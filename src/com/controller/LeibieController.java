package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Leibie;
import com.model.LeibieExample;
import com.model.Tie;
import com.service.LeibieService;
import com.service.TieService;

@Controller
public class LeibieController {
	
	private ApplicationContext a=new ClassPathXmlApplicationContext("classpath:spring_mybatis.xml","classpath:applicationContext.xml");
	private LeibieService leibieService=(LeibieService)a.getBean("leibieService");
	private TieService tieService=(TieService)a.getBean("tieService");
	private List<Leibie> leiList;
	private JSONArray jsonArray;
	
	@RequestMapping("getLeibie.do")
	public void getLeibie(HttpServletRequest req,HttpServletResponse resp) throws IOException{
		resp.setCharacterEncoding("UTF-8");
		leiList=leibieService.getAllLeibie(new LeibieExample());
		jsonArray=JSONArray.fromObject(leiList);
		PrintWriter out=resp.getWriter();
		out.print(jsonArray);
		out.flush();
		out.close();
	}
	
	@RequestMapping("getLeibienum.do")
	public void getLeibienum(HttpServletRequest req,HttpServletResponse resp) throws IOException{
		resp.setCharacterEncoding("UTF-8");
		leiList=leibieService.getAllLeibie(new LeibieExample());
		List<Integer> num=new ArrayList<Integer>();
		for(int i=1;i<=leiList.size();i++){
			List<Tie> tList=tieService.getLeibieTieTitle(i);
			num.add(tList.size());
		}
		jsonArray=JSONArray.fromObject(num);
		PrintWriter out=resp.getWriter();
		out.print(jsonArray);
		out.flush();
		out.close();
		
		
		
	}

}
