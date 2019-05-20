package com.ibm.eis.Service;

import java.util.Map;
import java.util.Scanner;

import com.ibm.eis.bean.Employee;

public class ServiceClass implements EmployeeService {
	DaoClass dao = new DaoClass();

	public void check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the salary:");
		double sal = sc.nextDouble();
		Scanner s = new Scanner(System.in);
		System.out.println("enter the designation:");
		String desg = s.nextLine();
		if (sal > 5000 && sal < 20000 && desg.equals("system associate")) {
			// TODO Auto-generated method stub
			System.out.println("Scheme-C");
		} else if (sal >= 20000 && sal < 40000 && desg.equals("programmer")) {
			System.out.println("Scheme-B");
		} else if (sal >= 40000 && desg.equals("manager")) {
			System.out.println("Scheme-A");
		} else if (sal < 5000 && desg.equals("clerk")) {
			System.out.println("No scheme");
		} else
			System.out.println("wrong input");
	}

	@Override
	public void storeIntoMap(Employee employee) {
		dao.storeIntoMap(employee);
		// TODO Auto-generated method stub

	}

	@Override
	public Map<Integer, Employee> displayPersons() {

		return dao.displayPersons();
	}

}
