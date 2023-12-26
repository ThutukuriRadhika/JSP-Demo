package org.jsp.jspdemo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteEmployee {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
System.out.println("Enter your Id to print the details");
	int id=sc.nextInt();
	EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
	Employee emp=manager.find(Employee.class, id);
	if(emp!=null) {
		manager.remove(emp);
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		transaction.commit();
		System.out.println("Employee has been deleted");
	}else {
		System.out.println("Enter invalid  Employee Id:"+id+emp.getId());
	}
}
}

