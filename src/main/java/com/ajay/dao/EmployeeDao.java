package com.ajay.dao;

import javax.sql.DataSource;

import com.ajay.bo.EmployeeBO;

public interface EmployeeDao {
	public int insertEmployee(EmployeeBO bo) throws Exception;


}
