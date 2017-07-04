package com.controller;

import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.Leibie;
import com.model.LeibieExample;
import com.model.Tie;
import com.model.User;
import com.model.UserExample;
import com.service.LeibieService;
import com.service.TieService;
import com.service.UserService;

@Controller
public class FatieController {

	private ApplicationContext a=new ClassPathXmlApplicationContext("classpath:spring_mybatis.xml","classpath:applicationContext.xml");
	private TieService tieService=(TieService)a.getBean("tieService");
	private UserService userService=(UserService)a.getBean("userService");
	private LeibieService leibieService=(LeibieService)a.getBean("leibieService");
	private JSONArray jsonArray;

	//leixing,tezheng,ld_title,chengyin_content,xiangqing_content,verssion,pilu,yinyong,guanjianzi
	
	@RequestMapping(value="fatie.do",method=RequestMethod.POST)
	public String fatie(HttpServletRequest req,HttpServletResponse resp) throws UnsupportedEncodingException{
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		String[] str= req.getParameterValues("guanjianzi");
		String guanjianzi="";
		for(int i=0;i<str.length;i++){
			guanjianzi+=str[i]+",";
		}
//		System.out.println(getUserId(req.getSession().getAttribute("username").toString()));
//		System.out.println(getLeibieId(req.getParameter("jiedian")));
//		System.out.println(req.getParameter("tiename"));
//		System.out.println(wenzhangcl(req.getParameter("wenzhang_content")));
//		System.out.println(req.getParameter("guanjianzi"));
//		System.out.println(req.getParameter("dengji"));
//		System.out.println(new Timestamp(new Date().getTime()));
//		System.out.println(guanjianzi);
		Tie tie =new Tie();
		tie.setUserId(getUserId(req.getSession().getAttribute("username").toString()));
		tie.setLeibieId(getLeibieId(req.getParameter("jiedian")));
		tie.setTitle(req.getParameter("tiename"));
		tie.setTieContent(wenzhangcl(req.getParameter("wenzhang_content")));
		tie.setGuanjianzi(req.getParameter("guanjianzi"));
		tie.setDengji(new Integer(req.getParameter("dengji")));
		tie.setCreatetime(new Timestamp(new Date().getTime()));
		tie.setLiulan(0);
		tieService.addTie(tie);
		
	
		return "redirect:index.jsp";
	}
	
	private String wenzhangcl(String s){
		StringBuilder sss_content=new StringBuilder();
		StringTokenizer sss_cut=new StringTokenizer(s,"\r");
		while(sss_cut.hasMoreTokens()){
			sss_content.append("<p>"+sss_cut.nextToken()+"</p>");
		}
		
		return sss_content.toString();
	}
	//<strong>粗体</strong>
	//<i>斜体</i>
	//
	public boolean jcdenglu(){
		
		return false;
	}
	
	private int getUserId(String username){
		UserExample ue=new UserExample();
		UserExample.Criteria criteria=ue.createCriteria();
		criteria.andUsernameEqualTo(username);
		List<User> uList=userService.getAllUser(ue);
		return uList.get(0).getUserId();
	}
	
	private int getLeibieId(String leibie){
		LeibieExample le=new LeibieExample();
		LeibieExample.Criteria criteria=le.createCriteria();
		criteria.andBodyEqualTo(leibie);
		List<Leibie> lList=leibieService.getAllLeibie(le);
		return lList.get(0).getLeibieId();
	}

}
