package com.controller;

import java.sql.Timestamp;
import java.util.List;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.LikeTie;
import com.model.Tie;
import com.model.User;
import com.model.UserExample;
import com.model.Zan;
import com.service.LeibieService;
import com.service.Like_tieService;
import com.service.TieService;
import com.service.UserService;
import com.service.ZanService;

@Controller
public class WenzhangController {
	private ApplicationContext a=new ClassPathXmlApplicationContext("classpath:spring_mybatis.xml","classpath:applicationContext.xml");
	private TieService tieService=(TieService)a.getBean("tieService");
	private UserService us=(UserService)a.getBean("userService");
	private LeibieService ls=(LeibieService)a.getBean("leibieService");
	private ZanService zs=(ZanService)a.getBean("zanService");
	private Like_tieService l_ts=(Like_tieService)a.getBean("like_tieService");

	@RequestMapping("wenzhang.do")
	public ModelAndView wenzhang(HttpServletRequest req){
		Tie tie=tieService.getTie(new Integer(req.getParameter("tieId")));
		sTie(tie);
		liulan(tie);
		List<Zan> nzList=zs.getTieZan(new Integer(req.getParameter("tieId")));
		ModelAndView m=new ModelAndView("tie");
		m.addObject("tie",tie);
		m.addObject("zan",nzList);
		return m;
	}
	
	@RequestMapping("zan.do")
	public String zan(HttpServletRequest req){
		if(req.getSession().getAttribute("username").toString()==null){
			System.out.println("请先登录!");
		}
		Integer tieId=new Integer(req.getParameter("tieId"));
		int userId=getUserId(req.getSession().getAttribute("username").toString());
		List<Zan> zList=zs.getTieZan(tieId);
		boolean zanguo=false;
		for(Zan z:zList){
			if(z.getUserId()==userId){
				zanguo=true;
			}
		}
		if(zanguo){
			zs.dropZan(userId,tieId);
			
		}else{
			Zan zan=new Zan();
			zan.setUserId(userId);
			zan.setTieId(tieId);
			zs.addZan(zan);
		}
		
		return "redirect:/wenzhang.do?tieId="+tieId;
	}
	
	@RequestMapping("shoucang.do")
	public String shoucang(HttpServletRequest req){
		Integer tieId=new Integer(req.getParameter("tieId"));
		int userId=getUserId(req.getSession().getAttribute("username").toString());
		List<LikeTie> l_tList=l_ts.getUserLiketie(userId);
		Boolean scg=false;
		for(LikeTie lt:l_tList){
			if(lt.getTieId()==tieId){
				scg=true;
			}
		}
		if(scg){
			l_ts.dropLiketie(userId,tieId);
		}else{
			LikeTie liketie=new LikeTie();
			liketie.setTieId(tieId);
			liketie.setUserId(userId);
			l_ts.addLiketie(liketie);
		}
		
		return "redirect:/wenzhang.do?tieId="+tieId;
	}
	
	
	private int getUserId(String username){
		UserExample ue=new UserExample();
		UserExample.Criteria criteria=ue.createCriteria();
		criteria.andUsernameEqualTo(username);
		List<User> uList=us.getAllUser(ue);
		return uList.get(0).getUserId();
	}
	
	private void sTie(Tie tie){
		
		String ss=new Timestamp(tie.getCreatetime().getTime()).toString();
		StringTokenizer st=new StringTokenizer(ss," ");
		tie.setTime(st.nextToken());
		tie.setUserName(us.getUser(tie.getUserId()).getUsername());
		tie.setLeibieName(ls.getLeibie(tie.getLeibieId()).getBody());
	}
	
	private void liulan(Tie tie){
		int liulan=tie.getLiulan();
		liulan+=1;
		tie.setLiulan(liulan);
		tieService.updata(tie);
	}
}
