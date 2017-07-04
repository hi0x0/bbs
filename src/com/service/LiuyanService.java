package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.LiuyanMapper;
import com.model.Liuyan;
import com.model.LiuyanExample;



@Service("liuyanService")
public class LiuyanService {
	@Autowired
	private LiuyanMapper liuyanMapper;
	
	public void insertLiuyan(Liuyan liuyan){
		liuyanMapper.insert(liuyan);
	}
	
	public List<Liuyan> getAllLiuyan(){
		
		return liuyanMapper.selectByExampleWithBLOBs(new LiuyanExample());
	}
	
	public List<Liuyan> getLiuyanBytieId(int tieId){
		LiuyanExample lye=new LiuyanExample();
		LiuyanExample.Criteria criteria=lye.createCriteria();
		criteria.andTieIdEqualTo(tieId);
		return liuyanMapper.selectByExampleWithBLOBs(lye);
	}
	
	public List<Liuyan> getLiuyanByuserId(int userId){
		LiuyanExample lye=new LiuyanExample();
		LiuyanExample.Criteria criteria=lye.createCriteria();
		criteria.andUserIdEqualTo(userId);
		return liuyanMapper.selectByExampleWithBLOBs(lye);
	}
	
	public void dropLiuyan(int id){
		LiuyanExample le=new LiuyanExample();
		LiuyanExample.Criteria criteria=le.createCriteria();
		criteria.andLiuyanidEqualTo(id);
		liuyanMapper.deleteByExample(le);
	}
	

}
