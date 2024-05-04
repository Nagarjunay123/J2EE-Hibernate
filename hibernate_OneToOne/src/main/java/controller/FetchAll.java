package controller;

import dao.personAadharBothDao;

public class FetchAll {

	public static void main(String[] args) {

		personAadharBothDao personAadharBothDao=new personAadharBothDao();
		personAadharBothDao.fetchAll();
	}
}
