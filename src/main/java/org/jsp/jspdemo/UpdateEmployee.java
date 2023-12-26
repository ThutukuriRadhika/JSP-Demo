package org.jsp.jspdemo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateEmployee {
public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter your ID to update");
//	int id=sc.nextInt();
//	System.out.println("Enter name, password, phone, age to update");
//	String name=sc.next();
//	String password=sc.next();
//	long phone=sc.nextLong();
//	int age=sc.nextInt();
	Employee emp=new Employee();
	emp.setId(1);
	emp.setName("raju");
	emp.setPassword("raj");
	emp.setPhone(9133);
	emp.setAge(27);
	EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	manager.merge(emp);
	transaction.begin();
	transaction.commit();
}
}