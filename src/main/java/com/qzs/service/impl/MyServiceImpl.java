package com.qzs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qzs.dto.User;
import com.qzs.mapper.MyMapper;
import com.qzs.service.MyService;
@Service
public class MyServiceImpl implements MyService {
	@Autowired
	private MyMapper mapper;

	@Override
	public List<User> select() {
		// TODO Auto-generated method stub
		return mapper.select();
	}
	
	
	
}
