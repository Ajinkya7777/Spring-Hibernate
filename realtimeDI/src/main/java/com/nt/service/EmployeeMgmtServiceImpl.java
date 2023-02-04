package com.nt.service;


import com.nt.bo.EmployeeBO;
import com.nt.dao.IEmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeMgmtServiceImpl implements  IEmployeeMgmtService {
	
	private IEmployeeDAO dao;
	public EmployeeMgmtServiceImpl(IEmployeeDAO dao) {
		
		System.out.println("EmployeeMgmtServiceImpl.EmployeeMgmtServiceImpl()");
		this.dao=dao;
		
	}

	@Override
	public String registerEmoloyee(EmployeeDTO dto) throws Exception {
		
		//write business logic to calculate gross salary and net salary
		float grossSalary = dto.getBasicSalary()+dto.getBasicSalary()*0.4f; //40% on basic salary
		float netSalary =grossSalary-dto.getBasicSalary()*.2f;
		
		//prepare BO class object having persistable data
		
		EmployeeBO bo = new EmployeeBO();
		bo.seteName(dto.geteName());
		bo.setDesg(dto.getDesg());
		bo.setBasicSalary(dto.getBasicSalary());
		bo.setGrossSalary(grossSalary);
		bo.setNetSalary(netSalary);
		
		//use DAO
		int count = dao.insertEmployee(bo);
		
		//generate final result
		
		return count ==1?"Employee registered with netSalary::"+netSalary:"Employee not registered with netSalary: "+netSalary;
		
		
	}

	

}
