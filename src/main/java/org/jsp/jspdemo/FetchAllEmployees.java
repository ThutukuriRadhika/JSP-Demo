package org.jsp.jspdemo;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAllEmployees {
public static void main(String[] args) {
	
	EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
	String qry="select e from Employee e";
	Query q=manager.createQuery(qry);
	List<Employee> emps=q.getResultList();
	for(Employee emp:emps) {
	
		System.out.println("ID:"+emp.getId());
		System.out.println("Name:"+emp.getName());
		System.out.println("Password:"+emp.getPassword());
		System.out.println("Phone:"+emp.getPhone());
		System.out.println("Age:"+emp.getAge());
	System.out.println("-----------------------");
	
}
}
}