package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ZanMapper;
import com.model.Zan;
import com.model.ZanExample;

@Service("zanService")
public class ZanService {
	@Autowired
	private ZanMapper zanMapper;
	
	public void addZan(Zan zan){
		zanMapper.insert(zan);
	}
	
	public List<Zan> getTieZan(int tieId){
		ZanExample ze=new ZanExample();
		ZanExample.Criteria criteria=ze.createCriteria();
		criteria.andTieIdEqualTo(tieId);
		List<Zan> list=zanMapper.selectByExample(ze);
		return list;
	}
	
	public List<Zan> getAllZan(){
		return zanMapper.selectByExample(new ZanExample());
	}
	
	public void dropZan(int userId,int tieId){
		ZanExample ze=new ZanExample();
		ZanExample.Criteria criteria=ze.createCriteria();
		criteria.andUserIdEqualTo(userId);
		criteria.andTieIdEqualTo(tieId);
		zanMapper.deleteByExample(ze);
	}
	

}
