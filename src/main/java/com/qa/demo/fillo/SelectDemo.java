package com.qa.demo.fillo;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class SelectDemo {
	public static void main(String[] args) throws FilloException {
		Fillo fillo = new Fillo();
		Connection connection = fillo.getConnection("EmpData.xlsx");
		String strquery = "Select * from Emp";
		Recordset recordset = connection.executeQuery(strquery);
		while (recordset.next()) {
			System.out.println(recordset.getField("EmpName"));
		}
		recordset.close();
		connection.close();
	}
}
