package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.List;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Tie;
import com.model.TieExample;
import com.service.LeibieService;
import com.service.TieService;
import com.service.UserService;

@Controller
public class TieController {
	
	private ApplicationContext a=new ClassPathXmlApplicationContext("classpath:spring_mybatis.xml","classpath:applicationContext.xml");
	private TieService tieService=(TieService)a.getBean("tieService");
	private UserService us=(UserService)a.getBean("userService");
	private LeibieService ls=(LeibieService)a.getBean("leibieService");
	private List<Tie> tList;
	private JSONArray jsonArray;
	
	@RequestMapping("getTie.do")
	public void getTie(HttpServletRequest req,HttpServletResponse resp) throws IOException{
		resp.setCharacterEncoding("UTF-8");
		tList=tieService.getAllTie(new TieExample());
		sTieList(tList);
		
		jsonArray=JSONArray.fromObject(tList);
		PrintWriter out=resp.getWriter();
		out.print(jsonArray);
		out.flush();
		out.close();
		
	}
	
	@RequestMapping("getLeiBieTie.do")
	public void getLeiXingTie(HttpServletRequest req,HttpServletResponse resp) throws IOException{
		resp.setCharacterEncoding("UTF-8");
//		int leibieId=new Integer(req.getParameter("leibieId"));
		Integer leibie=new Integer(req.getParameter("leibieId"));
		System.out.println(leibie);
		tList=tieService.getLeibieTieTitle(leibie);
		sTieList(tList);
		
		jsonArray=JSONArray.fromObject(tList);
		PrintWriter out=resp.getWriter();
		out.print(jsonArray);
		out.flush();
		out.close();
		
	}
	
	private void sTieList(List<Tie> tList){
		for(Tie tie:tList){
			String ss=new Timestamp(tie.getCreatetime().getTime()).toString();
			StringTokenizer st=new StringTokenizer(ss," ");
			tie.setTime(st.nextToken());
			tie.setUserName(us.getUser(tie.getUserId()).getUsername());
			tie.setLeibieName(ls.getLeibie(tie.getLeibieId()).getBody());
		}
	}

}
