package com.myHibernateProg.Util;

import com.myHibernateProg.DAO.EmployeeDAO;
import com.myHibernateProg.DTO.EmployeeDTO;

public class EmployeeTester {

	public static void main(String[] args) 
	{
		EmployeeDTO dto=new EmployeeDTO();
		dto.setId(1);
		dto.setFirstName("Anuj");
		dto.setLastName("Sachan");
		EmployeeDAO dao=new EmployeeDAO();
		dao.save(dto);
		
	}

}
