package com.example.junit;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.junit.Model.Model;
import com.example.junit.repo.Erepo;

@SpringBootTest
class JunitApplicationTests {

	@Autowired
	Erepo erepo;
	@Test
	public void testCreate()
	{
		Model u=new Model();
		u.setId(6666);
		u.setName("balaji");
		erepo.save(u);
		
	}
	
	@Test
	public void testUpdate()
	{
		Model u=erepo.findById(222).get();
		u.setName("anihtin");
		erepo.save(u);
		
	}
	@Test
	public void testDelete()
	{		
		erepo.deleteById(555);
		
	}
}
