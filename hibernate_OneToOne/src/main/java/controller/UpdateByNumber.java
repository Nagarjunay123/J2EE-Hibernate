package controller;

import dao.personAadharBothDao;

public class UpdateByNumber {

	public static void main(String[] args) {


		personAadharBothDao personAadharBothDao=new personAadharBothDao();
		personAadharBothDao.updateAadharNumber(1, 123456789l);
}
}