package org.jsp.jspdemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveEmployee {
public static void main(String[] args) {
	Employee emp=new Employee();
	emp.setName("Radhika");
	emp.setAge(23);
	emp.setPassword("a123");
	emp.setPhone(1234);
	EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	manager.persist(emp);
	transaction.begin();
	transaction.commit();
	
}
}
