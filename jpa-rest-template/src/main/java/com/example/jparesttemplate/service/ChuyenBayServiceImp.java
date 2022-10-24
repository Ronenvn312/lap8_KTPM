package com.example.jparesttemplate.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.jparesttemplate.entity.ChuyenBay;

@Service
public class ChuyenBayServiceImp implements ChuyenBayService{
	 static final String URL_API = "http://localhost:8088/api";
	 private static RestTemplate restTemplate = new RestTemplate();
	@Override
	public ArrayList<ChuyenBay> findAll() {
		ArrayList<ChuyenBay>  cbs = new ArrayList<ChuyenBay>();
		ChuyenBay[] chuyenBays =  restTemplate.getForEntity(URL_API+"/chuyenbay", ChuyenBay[].class).getBody();
		for (ChuyenBay chuyenBay : chuyenBays) {
			cbs.add(chuyenBay);
		}
		return cbs;
	}
	@Override
	public ChuyenBay findById(String theId) {
		return null;
	}
	@Override
	public ArrayList<ChuyenBay> findByGaDen(String gaDen) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ChuyenBay save(ChuyenBay chuyenBay) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteById(String maCB) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<ChuyenBay> findByDuongbay(int dbay1, int dbay2) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<ChuyenBay> findBySG_BMT(String gadi, String daden) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int countChuyenBay(String gadi) {
		// TODO Auto-generated method stub
		return 0;
	}
	 
	 
}
