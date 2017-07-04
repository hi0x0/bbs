package com.test;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;




















import java.util.StringTokenizer;

import net.sf.json.JSONArray;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;










import com.model.Tie;
import com.model.TieExample;
import com.model.User;
import com.model.UserExample;


import com.model.Zan;
import com.service.LeibieService;
import com.service.TieService;
import com.service.UserService;
import com.service.ZanService;


public class T {

	
	
	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("classpath:spring_mybatis.xml","classpath:applicationContext.xml");
		TieService tieService=(TieService)a.getBean("tieService");
		UserService us=(UserService)a.getBean("userService");
		LeibieService ls=(LeibieService)a.getBean("leibieService");
		ZanService zs=(ZanService)a.getBean("zanService");

		TieExample te=new TieExample();
		TieExample.Criteria criteria=te.createCriteria();
		criteria.andLeibieIdEqualTo(2);
		List<Tie> tList=tieService.getLeibieTieTitle(1);
		System.out.println(tList.size());
		
		
		
	}
}
