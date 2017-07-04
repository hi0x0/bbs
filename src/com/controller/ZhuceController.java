package com.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.User;
import com.model.UserExample;
import com.service.UserService;

@Controller
public class ZhuceController{
	private ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:spring_mybatis.xml");
	private UserService us;
	private User u=new User();
	@RequestMapping(value="adduser.do",method=RequestMethod.POST)
	public String addUser(HttpServletRequest req){
		
		u.setHeaderimg(req.getParameter("headerimg"));
		u.setUsername(req.getParameter("username"));
		u.setPassword(req.getParameter("password"));
		u.setEmail(req.getParameter("email"));
		u.setCreatetime(new Timestamp(new Date().getTime()));
		u.setQuanxianId(1);
		
		us=(UserService)ac.getBean("userService");
		us.addUser(u);
		return "redirect:index.jsp";
	}
	@RequestMapping(value="getuser.do",method=RequestMethod.POST)
	public void getUser(HttpServletResponse resp) throws IOException{
		List<User> userList=us.getAllUser(new UserExample());
		JSONArray jsonArray=JSONArray.fromObject(userList);
		PrintWriter out=resp.getWriter();
		out.print(jsonArray);
		out.flush();
		out.close();
	}
	
	
	
}
