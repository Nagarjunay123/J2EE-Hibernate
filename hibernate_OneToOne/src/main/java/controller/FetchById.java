package controller;

import dao.personAadharBothDao;

public class FetchById {

	public static void main(String[] args) {


		personAadharBothDao personAadharBothDao=new personAadharBothDao();
		personAadharBothDao.fetchById(1);
	}

}
