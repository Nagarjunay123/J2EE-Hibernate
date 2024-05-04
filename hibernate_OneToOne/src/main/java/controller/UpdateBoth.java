package controller;

import dao.personAadharBothDao;
import dto.Aadhar;
import dto.Person;

public class UpdateBoth {

	public static void main(String[] args) {

		Person person=new Person();
		person.setPersonId(1);
		person.setPersonName("nag");
		person.setPersonAge(22);
		person.setPersonPhone(9955555l);
		person.setPersonAddress("hyd");
		
		Aadhar aadhar=new Aadhar();
		aadhar.setAadharId(1);
		aadhar.setNumber(872742747474l);
		aadhar.setAuthority("toi");
		aadhar.setPerson(person);
		
		personAadharBothDao personAadharBothDao=new personAadharBothDao();
		personAadharBothDao.updateBoth(aadhar);
	}

}
