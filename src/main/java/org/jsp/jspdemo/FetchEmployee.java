package org.jsp.jspdemo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class FetchEmployee {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your ID to print the details");
	int id=sc.nextInt();
	EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
	Employee emp=manager.find(Employee.class, id);
	if(emp!=null) {
		System.out.println("ID:"+emp.getId());
		System.out.println("Name:"+emp.getName());
		System.out.println("Password:"+emp.getPassword());
		System.out.println("Phone:"+emp.getPhone());
		System.out.println("Age:"+emp.getAge());
		System.out.println("Enter your Id to print the details");
	}else {
		System.err.println("Invalid ID");
}
	
}
}
