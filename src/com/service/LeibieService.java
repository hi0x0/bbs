package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.LeibieMapper;
import com.model.Leibie;
import com.model.LeibieExample;

@Service("leibieService")
public class LeibieService {
	@Autowired
	private LeibieMapper leibieMapper;
	
	public void addLeibie(Leibie leibie){
		leibieMapper.insert(leibie);
	}
	
	public List<Leibie> getAllLeibie(LeibieExample example){
		
		return leibieMapper.selectByExample(example);
	}
	
	public Leibie getLeibie(int id){
		LeibieExample le=new LeibieExample();
		LeibieExample.Criteria criteria=le.createCriteria();
		criteria.andLeibieIdEqualTo(id);
		List<Leibie> list=leibieMapper.selectByExample(le);
		return list.get(0);
	}
	
	
}
