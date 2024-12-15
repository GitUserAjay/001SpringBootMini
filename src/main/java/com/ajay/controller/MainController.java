package com.ajay.controller;

import com.ajay.dto.EmployeeDto;
import com.ajay.service.IEmployeeMgmtService;
import com.ajay.vo.EmployeeVO;

public class MainController {
	private IEmployeeMgmtService service;

	public MainController(IEmployeeMgmtService service) {
		System.out.println("MianController.MianController()");
		this.service = service;
	}
	
	public String processEmployee(EmployeeVO vo) throws Exception {
		
		//change from vo to dto and pass dto to service
		EmployeeDto dto=new EmployeeDto();
	dto.setEname(vo.getEname());
	dto.setDesg(vo.getDesg());
	dto.setBasicSalary(Float.parseFloat(vo.getBasicSalary()));
	
	String status=service.registerEmployee(dto);
	
	
		
		return status;
		
	}
	
	

}
