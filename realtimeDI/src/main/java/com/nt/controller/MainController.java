package com.nt.controller;

import com.nt.dto.EmployeeDTO;
import com.nt.service.IEmployeeMgmtService;
import com.nt.vo.EmployeeVO;

public class MainController {

		private IEmployeeMgmtService service;
		public MainController() {
			// TODO Auto-generated constructor stub
		}

		public MainController(IEmployeeMgmtService service) {
			super();
			System.out.println("MainController::1-parameter constructor()");
			this.service = service;
		}
		
		
		public String processEmployee(EmployeeVO vo )throws Exception {
			//convert employeeVO class object to EmployeeDTO class OBJ 
			
			EmployeeDTO dto = new EmployeeDTO();
			dto.seteName(vo.geteName());
			dto.setDesg(vo.getDesg());
			dto.setBasicSalary(Float.parseFloat(vo.getBasicSalary()));
			
			//use service 
			String result = service.registerEmoloyee(dto);
			return result;
		}
		
}
