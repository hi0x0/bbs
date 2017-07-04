package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.LikeTieMapper;
import com.model.LikeTie;
import com.model.LikeTieExample;

@Service("like_tieService")
public class Like_tieService {
	@Autowired
	LikeTieMapper liketieMapper;
	
	public void addLiketie(LikeTie liketie){
		liketieMapper.insert(liketie);
	}
	public List<LikeTie> getAllLiketie(){
		
		return liketieMapper.selectByExample(new LikeTieExample());
	}
	public List<LikeTie> getUserLiketie(int userId){
		LikeTieExample le=new LikeTieExample();
		LikeTieExample.Criteria criteria=le.createCriteria();
		criteria.andUserIdEqualTo(userId);
		return liketieMapper.selectByExample(le);
	}
	public List<LikeTie> getTieLiketie(int tieId){
		LikeTieExample le=new LikeTieExample();
		LikeTieExample.Criteria criteria=le.createCriteria();
		criteria.andTieIdEqualTo(tieId);
		return liketieMapper.selectByExample(le);
	}
	
	public void dropLiketie(int userId,int tieId){
		LikeTieExample lte=new LikeTieExample();
		LikeTieExample.Criteria criteria=lte.createCriteria();
		criteria.andTieIdEqualTo(tieId);
		criteria.andUserIdEqualTo(userId);
		liketieMapper.deleteByExample(lte);
	}
}
