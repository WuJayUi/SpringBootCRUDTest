package com.fstop.test.service;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.fstop.test.dao.countryDao;
import com.fstop.test.dao.testDao;
import com.fstop.test.entity.test;

@Service
public class exampleService {
	@Autowired
	private testDao testdao;

	public List<test> getTestList() {
		return testdao.findAll();
	}

	
	public test getTestById(String id) {
		return testdao.getReferenceById(id);
	}

	public test createUser(test test) {

		return testdao.save(test);
	}

	public String upDateUser(test test) {
		testdao.save(test);
		return "oK";
	}

	public String deleteUser(String id) {
		test test = getTestById(id);
		testdao.delete(test);
		;
		return "ok";
	}

}
