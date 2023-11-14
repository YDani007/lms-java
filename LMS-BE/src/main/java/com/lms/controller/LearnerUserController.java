package com.lms.controller;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lms.entity.LearnerUser;

@RestController
@RequestMapping("/user")
public class LearnerUserController {

	@Autowired
	private DataSource ds;

	@PostMapping("/save")
	public LearnerUser save(@RequestBody LearnerUser lu) {

		return null;

	}

	@GetMapping("/testdb")
	public String test() throws SQLException {
		Connection connection = ds.getConnection();
		if (connection != null) {
			return "Api Is Connected";
		} else {
			return "Api Not Working";
			
		}
	}

}
