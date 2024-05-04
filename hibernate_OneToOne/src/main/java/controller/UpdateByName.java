package controller;

import dao.personAadharBothDao;

public class UpdateByName {

	public static void main(String[] args) {


		personAadharBothDao personAadharBothDao=new personAadharBothDao();
		personAadharBothDao.updatePersonName(1, "chinnu");
	}

}
