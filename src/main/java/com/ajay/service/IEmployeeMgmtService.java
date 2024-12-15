package com.ajay.service;

import com.ajay.dao.EmployeeDao;
import com.ajay.dto.EmployeeDto;

public interface IEmployeeMgmtService {
	public String registerEmployee(EmployeeDto dto) throws Exception;

}
