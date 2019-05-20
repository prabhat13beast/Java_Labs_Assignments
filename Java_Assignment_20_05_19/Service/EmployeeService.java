package com.ibm.eis.Service;

import java.util.Map;

import com.ibm.eis.bean.Employee;

public interface EmployeeService {
	 void check();
	void storeIntoMap(Employee employee);
	Map<Integer, Employee> displayPersons();

}
