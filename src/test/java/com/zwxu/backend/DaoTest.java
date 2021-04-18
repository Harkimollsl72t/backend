package com.zwxu.backend;

import lombok.extern.slf4j.Slf4j;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.zwxu.backend.dao.UserDao;
import com.zwxu.backend.model.User;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Slf4j
public class DaoTest {
	@Autowired
	private UserDao userDao;
	
	@Test
	@Ignore
	public void test(){
		User user = userDao.getUserByName("admin");
		log.info("用户信息-{}",user.toString());
	}
	

}
