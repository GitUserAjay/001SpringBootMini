package com.ajay.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.ajay.bo.EmployeeBO;

public class EmployeeOracleDaoImpl implements EmployeeDao{
	private static final String QUERY="insert into spring_employee values(ENOSEQUENCE.NEXTVAL,?,?,?,?,?)";
	private DataSource ds;
	 
	public EmployeeOracleDaoImpl(DataSource ds) {
		System.out.println("EmployeeOracleDaoImpl.EmployeeDaoImpl()");
		this.ds = ds;
	}


	@Override
	public int insertEmployee(EmployeeBO bo) throws Exception {
//		try {  //old try block where we have to close resource explicitly uisng finally block
//			Connection con=ds.getConnection();   
//			Statement st=con.createStatement();
//		}
		System.out.println("EmployeeDaoImpl.insertEmployee()");
		int status;
		try(Connection con=ds.getConnection();  
				PreparedStatement ps=con.prepareStatement(QUERY);){  //TRY WITH RESOURCE BLOCK THAT WILL AUTOMATICALLY CLOSE RESOURCE UNDER IT
			ps.setString(1, bo.getEname());
			ps.setString(2, bo.getDesg());
			ps.setFloat(3, bo.getBasicSalary());
			ps.setFloat(4, bo.getNetSalary());
			ps.setFloat(5, bo.getGrossSalary());
			
			 status=ps.executeUpdate();
		}
		catch(SQLException se) {
			se.printStackTrace();
			throw se; //exception rethrowing;
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		return status;
	}

		
	

}
