package controller;

import dao.personAadharBothDao;
import dto.Aadhar;
import dto.Person;

public class InsertPersonAadharBoth {

	public static void main(String[] args) {

		Person person=new Person();
		person.setPersonName("vijay");
		person.setPersonAge(21);
		person.setPersonPhone(9963627309l);
		person.setPersonAddress("habsiguda");
		
		Aadhar aadhar=new Aadhar();
		aadhar.setNumber(429763289343l);
		aadhar.setAuthority("goi");
		aadhar.setPerson(person);
		
		personAadharBothDao aadharBothDao=new personAadharBothDao();
		aadharBothDao.insertPersonAadhar(aadhar);
	}

}
