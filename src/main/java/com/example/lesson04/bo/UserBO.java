package com.example.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson04.domain.User;
import com.example.lesson04.mapper.UserMapper;

@Service
public class UserBO {	
	
	@Autowired
	private UserMapper userMapper;
	
	// ex01
	
	// input: 파라미터4개(이름, 생년월일, 이메일, 자기소개)
	// output: X
	public void addUser(String name, String yyyymmdd, String email, String introduce) {
		userMapper.insertUser(name, yyyymmdd, email, introduce);
	}
	
	// input: X
	// output: User
	public User getLatestUser() {
		return userMapper.selectLatestUser();
	}
	
	// input: name
	// output: boolean
	public boolean isDuplicationByName(String name) {
		return userMapper.isDuplicationByName(name);
	}
	
}
