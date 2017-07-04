package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.LikeTie;
import com.model.Liuyan;
import com.model.Tie;
import com.model.TieExample;
import com.model.User;
import com.model.UserExample;
import com.model.Zan;
import com.service.LeibieService;
import com.service.Like_tieService;
import com.service.LiuyanService;
import com.service.TieService;
import com.service.UserService;
import com.service.ZanService;

@Controller
public class GrzxController {

	private ApplicationContext a=new ClassPathXmlApplicationContext("classpath:spring_mybatis.xml","classpath:applicationContext.xml");
	private UserService us=(UserService) a.getBean("userService");
	private TieService ts=(TieService)a.getBean("tieService");
	private LiuyanService lys=(LiuyanService)a.getBean("liuyanService");
	private LeibieService ls=(LeibieService)a.getBean("leibieService");
	private Like_tieService lts=(Like_tieService)a.getBean("like_tieService");
	private ZanService zs=(ZanService)a.getBean("zanService");
	private JSONArray jsonArray;
	
	@RequestMapping("getfatie.do")
	public void getfatie(HttpServletRequest req,HttpServletResponse resp) throws IOException{
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		int userId=getUserId(req.getParameter("username"));
		TieExample te=new TieExample();
		TieExample.Criteria criteria=te.createCriteria();
		criteria.andUserIdEqualTo(userId);
		List<Tie> tList=ts.getAllTie(te);
		for(Tie t:tList){
			List<Zan> zl=zs.getTieZan(t.getTieId());
			sTie(t);
			t.setZan(zl.size());
		}
		jsonArray=JSONArray.fromObject(tList);
		PrintWriter out=resp.getWriter();
		out.print(jsonArray);
		out.flush();
		out.close();
		
	}
	
	@RequestMapping("gethuifu.do")
	public void gethuifu(HttpServletRequest req,HttpServletResponse resp) throws IOException{
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		List<Tie> tList=new ArrayList<Tie>();
		Tie t=new Tie();
		int userId=getUserId(req.getParameter("username"));
		List<Liuyan> lList=lys.getLiuyanByuserId(userId);
		for(Liuyan l:lList){
			
			t=ts.getTie(l.getTieId());
			slTie(t,l);
			tList.add(t);
			
		}
		jsonArray=JSONArray.fromObject(tList);
		PrintWriter out=resp.getWriter();
		out.print(jsonArray);
		out.flush();
		out.close();
		
	}
	
	@RequestMapping("getshoucang.do")
	public void getshoucang(HttpServletRequest req,HttpServletResponse resp) throws IOException{
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		List<Tie> tList=new ArrayList<Tie>();
		
		Tie t=new Tie();
		int userId=getUserId(req.getParameter("username"));
		List<LikeTie> ltList=lts.getUserLiketie(userId);
		for(LikeTie lt:ltList){
			
			t=ts.getTie(lt.getTieId());
			List<Zan> nzList=zs.getTieZan(t.getTieId());
			t.setZan(nzList.size());
			sTie(t);
			tList.add(t);
			
		}
		jsonArray=JSONArray.fromObject(tList);
		PrintWriter out=resp.getWriter();
		out.print(jsonArray);
		out.flush();
		out.close();
		
	}
	
	
	
	private void sTie(Tie tie){
		
		String ss=new Timestamp(tie.getCreatetime().getTime()).toString();
		StringTokenizer st=new StringTokenizer(ss," ");
		tie.setTime(st.nextToken());
		tie.setUserName(us.getUser(tie.getUserId()).getUsername());
		tie.setLeibieName(ls.getLeibie(tie.getLeibieId()).getBody());
	}
	private void slTie(Tie tie,Liuyan liuyan){
		
		String ss=new Timestamp(liuyan.getCreatetime().getTime()).toString();
//		StringTokenizer st=new StringTokenizer(ss," ");
		tie.setTime(ss);
		tie.setUserName(us.getUser(tie.getUserId()).getUsername());
		tie.setLeibieName(ls.getLeibie(tie.getLeibieId()).getBody());
	}

	private int getUserId(String username){
		UserExample ue=new UserExample();
		UserExample.Criteria criteria=ue.createCriteria();
		criteria.andUsernameEqualTo(username);
		List<User> uList=us.getAllUser(ue);
		return uList.get(0).getUserId();
	}
}
