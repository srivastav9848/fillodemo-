package com.qa.demo.fillo;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;

public class InsertDemo {
public static void main(String[] args) {
	Fillo fillo =new Fillo();
	try {
		Connection connection=fillo.getConnection("EmpData.xlsx");
		String strquery="Insert into Emp (EmpId,EmpName,Salary,Location) values ('10','Tom Cruise','74000','Coimbatore')";
		connection.executeUpdate(strquery);
		connection.close();
	} catch (FilloException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
