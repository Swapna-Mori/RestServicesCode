package com.mouritech.printempdetails;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/v1") 
public class EmployeeRESTExample {
	
	ArrayList<Employee> empList = new ArrayList<Employee>();
	
	@Path("/listemployees")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getAllEmployees(){
		empList = createEmployeeList();
		return empList;
	}
	
	public ArrayList<Employee> createEmployeeList() {
		empList.add(new Employee(123,"rama"));
		empList.add(new Employee(124,"ram"));
		empList.add(new Employee(125,"raghs"));
		return empList;
	}

}
