package com.zwxu.backend.model;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {
	private Integer id;
	
	private Integer userid;
	
	private String username;
	
	private String password;
	
	private String loginname;
	
	private String company;
	
	private String project;
	
	private String role;
	
	private Date createtime;
	
	private Date updatetime;
}
