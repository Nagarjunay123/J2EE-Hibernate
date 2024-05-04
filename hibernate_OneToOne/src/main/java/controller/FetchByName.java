package controller;

import dao.personAadharBothDao;

public class FetchByName {

	public static void main(String[] args) {


		personAadharBothDao personAadharBothDao=new personAadharBothDao();
		personAadharBothDao.fetchByName("nag");
	}

}
