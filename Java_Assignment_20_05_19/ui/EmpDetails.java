package com.ibm.eis.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.ibm.eis.Service.EmployeeService;
import com.ibm.eis.Service.ServiceClass;
import com.ibm.eis.bean.Employee;

public class EmpDetails  {
	static String desg;
	static double sal;
	static EmployeeService service = new ServiceClass();
public static void main(String args[]) {	
	int choice;
    do{
   System.out.println("1.Add emp details \n2.Insurance scheme. \n3.Display deatils");
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter one of the choices:");
   choice = sc.nextInt();
   switch(choice)
   { 
       case 1:add(); break;

       case 2:new ServiceClass().check(); break;

       case 3:display(); break;

       default:System.out.println("Wrong Choice program exit...!");
   
    }
    }while(choice<4);
}
   static void add() {
	   try {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the name:");
	String name = sc.nextLine();
	System.out.println("enter id:");
	Integer id = sc.nextInt();
	System.out.println("enter the designation:");
	Scanner sc1 = new Scanner(System.in);
	 desg = sc1.nextLine(); 
	System.out.println("enter the salary:");
	 sal=sc1.nextDouble();
	Employee emp = new Employee();
	emp.setId(id);
	emp.setName(name);
	emp.setSalary(sal);
	emp.setDesignation(desg);
	service.storeIntoMap(emp);
	System.out.println("details added");
	   }
	   catch(InputMismatchException e) {
		   System.out.println("wrong input");
	
}
   }
   static void display() {
	System.out.println(service.displayPersons());   

}
}
