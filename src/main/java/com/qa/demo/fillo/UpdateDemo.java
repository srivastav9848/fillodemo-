package com.qa.demo.fillo;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;

public class UpdateDemo {
	public static void main(String[] args) throws FilloException {
		Fillo fillo = new Fillo();
		Connection connection = fillo.getConnection("EmpData.xlsx");
		String strquery = "update Emp set Salary='45000' where EmpId='5'";
		connection.executeUpdate(strquery);
		connection.close();

	}
}
