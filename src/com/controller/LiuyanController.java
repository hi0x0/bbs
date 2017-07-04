package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
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

import com.model.Liuyan;
import com.model.Tie;
import com.model.User;
import com.model.UserExample;
import com.service.LiuyanService;
import com.service.UserService;

@Controller
public class LiuyanController {
	
	private ApplicationContext a=new ClassPathXmlApplicationContext("classpath:spring_mybatis.xml","classpath:applicationContext.xml");
	private LiuyanService liuyanService=(LiuyanService)a.getBean("liuyanService");
	private UserService userService=(UserService)a.getBean("userService");
	private List<Liuyan> lList;
	private JSONArray jsonArray;
	
	@RequestMapping("getAllLiuYan.do")
	public void getAllLiuYan(HttpServletRequest req,HttpServletResponse resp) throws IOException{
		resp.setCharacterEncoding("UTF-8");
		lList=liuyanService.getLiuyanBytieId(new Integer(req.getParameter("tieId")));
		for(Liuyan ly:lList){
			sLiuyan(ly);
		}
		jsonArray=JSONArray.fromObject(lList);
		PrintWriter out=resp.getWriter();
		out.print(jsonArray);
		out.flush();
		out.close();
	}
	
	@RequestMapping(value="insertLiuyan.do",method=RequestMethod.POST)
	public String insertLiuyan(HttpServletRequest req) throws UnsupportedEncodingException{
		req.setCharacterEncoding("utf-8");
//		System.out.println(getUserId(req.getSession().getAttribute("username").toString()));
//		System.out.println(req.getParameter("tieId"));
//		System.out.println(req.getParameter("liuyan_content"));
		Integer tieId=new Integer(req.getParameter("tieId"));
		Liuyan ly=new Liuyan();
		ly.setBody(wenzhangcl(req.getParameter("liuyan_content")));
		ly.setTieId(tieId);
		ly.setUserId(getUserId(req.getSession().getAttribute("username").toString()));
		ly.setCreatetime(new Timestamp(new Date().getTime()));
		liuyanService.insertLiuyan(ly);
		return "redirect:/wenzhang.do?tieId="+tieId;
	}
	
	private String wenzhangcl(String s){
		StringBuilder sss_content=new StringBuilder();
		StringTokenizer sss_cut=new StringTokenizer(s,"\r");
		while(sss_cut.hasMoreTokens()){
			sss_content.append("<p>"+sss_cut.nextToken()+"</p>");
		}
		
		return sss_content.toString();
	}
	
	private int getUserId(String username){
		UserExample ue=new UserExample();
		UserExample.Criteria criteria=ue.createCriteria();
		criteria.andUsernameEqualTo(username);
		List<User> uList=userService.getAllUser(ue);
		return uList.get(0).getUserId();
	}
	
	private void sLiuyan(Liuyan liuyan){
		
		String ss=new Timestamp(liuyan.getCreatetime().getTime()).toString();
		StringTokenizer st=new StringTokenizer(ss," ");
		liuyan.setTime(st.nextToken());
		liuyan.setUserName(userService.getUser(liuyan.getUserId()).getUsername());
	}

}
