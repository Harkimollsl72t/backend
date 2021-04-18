package com.zwxu.backend.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import com.zwxu.backend.model.User;

public interface UserDao {
	@Select("select * from ai_user where loginname=#{loginname}")
	public User getUserByName(@Param("loginname") String loginname);
}
