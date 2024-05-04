package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Aadhar;
import dto.Person;

public class personAadharBothDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Nag");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void insertPersonAadhar(Aadhar aadhar) {
		
//		Person person=aadhar.getPerson();
		entityTransaction.begin();
		
//		entityManager.persist(person);
		entityManager.persist(aadhar);
		
		entityTransaction.commit();
		
	}																																												
	
	public void fetchById(int aadharId) {
		Aadhar aadhar=entityManager.find(Aadhar.class, aadharId);
		System.out.println(aadhar);
	}
	
	public void deleteById(int aadharId) {
		Aadhar aadhar=entityManager.find(Aadhar.class, aadharId);
//		Person person=aadhar.getPerson();
		
		entityTransaction.begin();
//		entityManager.remove(person);
		entityManager.remove(aadhar);
		entityTransaction.commit();
	}
	
	public void fetchAll() {
		Query query=entityManager.createQuery("select a from Aadhar a");
		List list=query.getResultList();
		System.out.println(list);
	}
	
	public void fetchByName(String name) {
		Query query=entityManager.createQuery("select a from Aadhar a,Person p where a.aadharId=p.personId and p.personName=?1");
		query.setParameter(1, name);
		
		List list=query.getResultList();
		System.out.println(list);
	}
	public void updateAadharNumber(int id,long number) {
		Aadhar aadhar=entityManager.find(Aadhar.class, id);
		aadhar.setNumber(number);
		
		entityTransaction.begin();
		
		entityManager.merge(aadhar);
		entityTransaction.commit();
	}
	
	public void updatePersonName(int id,String name) {
		Person person=entityManager.find(Person.class, id);
		person.setPersonName(name);
		
		entityTransaction.begin();
		
		entityManager.merge(person);
		entityTransaction.commit();
	}
	public void updateBoth(Aadhar aadhar) {
//		Person person=aadhar.getPerson();
		entityTransaction.begin();
//		entityManager.merge(person);
		entityManager.merge(aadhar);
		entityTransaction.commit();
	}
}
