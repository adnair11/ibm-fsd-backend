package com.service;



import java.util.*;

import java.util.concurrent.Callable;
import java.io.*;
import java.sql.SQLException;

import com.dom.empdb;
import com.employee.*;


public class empservices implements serviceinterface {

//	ArrayList<Emp> EmpList = new ArrayList<Emp>();
	Scanner sc = new Scanner(System.in);
	
	empdb db= new empdb();

	public empservices() throws SQLException ,ClassNotFoundException{
		super();
	
	}

	@Override
	public void addUser() throws SQLException {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter ID, NAME , DESIGNATION,COMPANY");
		emp n=new emp(sc.nextInt(),sc.next(),sc.next(),sc.next());
		
		db.addToDB(n);
	
		

	}

	@Override
	public void removeUser() {
		// TODO Auto-generated method stub
//		System.out.println("ENTER ID of the employee to remove");
//		Scanner sc= new Scanner(System.in);
//		int id=sc.nextInt();
//		int t = -1;
//		for(int i=0;i<EmpList.size();i++)
//		{
//			if(id==EmpList.get(i).EmpId)
//				t=i;
//		}
//		System.out.println("Index" + t);
//		if(t!=-1)
//		EmpList.remove(t);
//		else
//		System.out.println("FAILED TO REMOVE ID NOT FOUND");
//		
//		
		

	}

	@Override
	public void viewAll() throws SQLException {

		
		db.viewfromdb();
		
		
	}

	@Override
	public void view() {
		// TODO Auto-generated method stub
//		System.out.println("Enter the id to view employee");
////		System.out.println("ENTER ID of the employee to remove");
//		Scanner sc= new Scanner(System.in);
//		int id=sc.nextInt();
//		int t = -1;
//		for(int i=0;i<EmpList.size();i++)
//		{
//			if(id==EmpList.get(i).EmpId)
//				t=i;
//		}
////		System.out.println("Index" + t);
//		if(t!=-1)
//			System.out.format("%5d %5s %5f \n" ,EmpList.get(t).getEmpId(),EmpList.get(t).getEmpName(),EmpList.get(t).getSalary() );
//		else
//		System.out.println("FAILED TO REMOVE ID NOT FOUND");
//		
//		
//		

		

	}

	@Override
	public void importEmp() throws FileNotFoundException {
		// TODO Auto-generated method stub
//		File file= new File("C:\\Training\\ibm-fsd-backend\\assignments\\corejava\\employee-mgmt-app01\\src\\export.txt");
//		Scanner sc= new Scanner(file);
//		String s;
//	
//	    while(sc.hasNext())
//	    {
//	    	Emp n =new Emp();
//		s=sc.nextLine();
//		System.out.println(s);
//		String[] str= s.split(",");
//		n.setEmpId(( Integer.parseInt(str[0])));
//		n.setEmpName(str[1]);
//		n.setSalary(Float.parseFloat(str[2]));
//		EmpList.add(n);
//	    }
//		
//		
//		
//	
//			
//		sc.close();
//		
	}

	@Override
	public void exportEmp() throws IOException {
		// TODO Auto-generated method stub
//		PrintWriter out=null;
//		  out = new PrintWriter(new FileWriter("C:\\Training\\ibm-fsd-backend\\assignments\\corejava\\employee-mgmt-app01\\src\\export.txt"));
//
//	for(int i=0;i<EmpList.size();i++)
//	{
//		String s1= Integer.toString(EmpList.get(i).getEmpId());
//		String s2=EmpList.get(i).getEmpName();
//		String s3=Float.toString(EmpList.get(i).getSalary());
//		
//		out.write(s1);
//		out.write(',');
//		out.write(s2);
//		out.write(',');	
//	    out.write(s3);
//	    out.write('\n');
//	}
//	out.flush();
//	
//	
//	
//	
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
