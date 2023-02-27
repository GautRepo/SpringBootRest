 //EmployeeOperationsController.java
package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Company;
import com.nt.model.Employee;

@RestController
@RequestMapping("/employee/api")
public class EmployeeOperationsController {
	
	/*{
    "empno": 10,
    "empname": "Gautam",
    "empaddrs": {
        "houseNo" :"12ef",
        "areaName": "something",
        "city": "Patna",
        "pinCode" :1234
    },
    "favColors" : ["ABC","CBA"],
    "nickNames": ["AB","BC"],
    "phoneNumbers": ["10","15"],
     "idDetails": {
         "AC":10,
         "BC": 12
     }
}*/
	
	@PostMapping("/register")
	public ResponseEntity<Employee>  registerEmployee(@RequestBody Employee emp){
		System.out.println("EmployeeOperationsController.registerEmployee():::"+emp);
		return new ResponseEntity<Employee>(emp,HttpStatus.CREATED);
	}
	
	/*
	 {
"companyId" : 10,
"companyName" : "COMP",
"dos" : "2022-10-12",
"dtos" : "2022-10-12 00:10:20",
"projectsInfo" : [{
    "projId" : 10,
    "projName" : "pencile",
    "teamSize":10
    
}], 
 "tos":"10:05:06"
}*/
	
	@PostMapping("/company")
	public ResponseEntity<Company>  registerCompany(@RequestBody Company company){
		System.out.println("EmployeeOperationsController.registerCompany():::"+company);
		return new ResponseEntity<Company>(company,HttpStatus.CREATED);
	}
	

}
