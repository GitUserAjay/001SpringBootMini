package com.ajay.service;

import com.ajay.bo.EmployeeBO;
import com.ajay.dao.EmployeeDao;
import com.ajay.dto.EmployeeDto;

public class EmployeeMgmtService implements IEmployeeMgmtService {
private EmployeeDao dao;

	public EmployeeMgmtService(EmployeeDao dao) {
System.out.println("EmployeeMgmtService:: constructor.EmployeeMgmtService()");
	this.dao = dao;
}

	@Override
	public String registerEmployee(EmployeeDto dto) throws Exception {
		System.out.println("EmployeeMgmtService.registerEmployee()");
		
		float grossSalary=dto.getBasicSalary()+dto.getBasicSalary()*0.4f;  //calculate gross salary
		float netSalary=grossSalary-dto.getBasicSalary()*0.2f;   //calculate net salary
		
		EmployeeBO bo=new EmployeeBO();
		bo.setEname(dto.getEname());
		bo.setDesg(dto.getDesg());
		bo.setBasicSalary(dto.getBasicSalary());
		bo.setGrossSalary(grossSalary);
		bo.setNetSalary(netSalary);
		
		int count=dao.insertEmployee(bo);
		return count==1?"Employee registered with netSalary::"+netSalary:"Employee not registered with netsalary::"+netSalary;
		
		
		
		
		
		// TODO Auto-generated method stub	return null;
	}

}
