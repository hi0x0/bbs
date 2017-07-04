package com.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.TieMapper;
import com.model.Tie;
import com.model.TieExample;



@Service("tieService")
public class TieService {
	@Autowired
	private TieMapper tieMapper;
	
	public List<Tie> getAllTie(TieExample te){
		return tieMapper.selectByExampleWithBLOBs(te);
	}
	
	public List<Tie> getAllTieTitle(){
		return tieMapper.selectByExample(new TieExample());
	}
	
	public Tie getTie(int id){
		return tieMapper.selectByPrimaryKey(id);
	}
	
	public void addTie(Tie tie){
		tieMapper.insert(tie);
	}
	
	public void updata(Tie tie){
		tieMapper.updateByPrimaryKeyWithBLOBs(tie);
	}
	
	public List<Tie> getLeibieTieTitle(int leibieId){
		TieExample te=new TieExample();
		TieExample.Criteria criteria=te.createCriteria();
		criteria.andLeibieIdEqualTo(leibieId);
		return tieMapper.selectByExample(te);
	}
	
	public List<Tie> getLeibieTie(int leibieId){
		TieExample te=new TieExample();
		TieExample.Criteria criteria=te.createCriteria();
		criteria.andLeibieIdEqualTo(leibieId);
		return tieMapper.selectByExampleWithBLOBs(te);
	}

}
