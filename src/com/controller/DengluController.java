package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.User;
import com.model.UserExample;
import com.service.UserService;

@Controller
public class DengluController {

	private ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring_mybatis.xml");
	private UserService us ;
	private List<User> userList;
	
	@RequestMapping(value = "denglu.do", method = RequestMethod.POST)
	public void denglu(HttpServletRequest req, HttpServletResponse resp) {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		if(jiance(username,password)){
			req.getSession().setAttribute("username", username);
			req.getSession().setAttribute("userid", password);
			try {
				resp.sendRedirect("index.jsp");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			try {
				resp.sendRedirect("denglu.jsp");
				System.out.println("用户名或密码错误");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		

	}
	@RequestMapping("yonghu.do")
	public void yonghu(HttpServletRequest req,HttpServletResponse resp) throws IOException{
		PrintWriter out=resp.getWriter();
		out.print(req.getSession().getAttribute("username"));
		out.flush();
		out.close();
	}
	
	@RequestMapping("quit.do")
	public String quit(HttpServletRequest req){
		req.getSession().setAttribute("username", null);
		
		return "redirect:/index.jsp";
	}
	
	public boolean jiance(String username,String password){
		
		 us = (UserService) ac.getBean("userService");
		userList = us.getAllUser(new UserExample());

		for (User u : userList) {
			if (u.getUsername().equals(username)
					&& u.getPassword().equals(password)) {
				return true;
			}
		}
		
		
		return false;
	}
	
	
}
