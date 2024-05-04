package controller;

import dao.personAadharBothDao;

public class DeleteById {

	public static void main(String[] args) {

		personAadharBothDao personAadharBothDao=new personAadharBothDao();
		personAadharBothDao.deleteById(4);
	}

}
