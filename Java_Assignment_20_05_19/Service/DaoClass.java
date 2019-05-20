package com.ibm.eis.Service;

import java.util.HashMap;
import java.util.Map;

import com.ibm.eis.bean.Employee;

public class DaoClass {
	private Map<Integer,Employee> Employee=new HashMap<Integer,Employee>();
	
	public void storeIntoMap
	(Employee emp) {
		Employee.put(1, emp);
		Employee.put(2, emp);
		
	}
	public Map<Integer,Employee>
	displayPersons(){
		return Employee;
	}
}
