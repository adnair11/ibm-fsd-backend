import java.sql.SQLException;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
//import com.mysql.jdbc.Driver;

import com.dom.empdb;
import com.employee.*;
import com.service.empservices;




public class empMain {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
//		empdb db = new empdb();
		empservices es = new empservices();
		
		Scanner sc=new Scanner(System.in); 
	
       
		int select =0;
		do
		{
			System.out.println(" CHOOSE AN OPTION");
			System.out.println("1) ADD EMPLOYEE");
			System.out.println("2) VIEW ALL EMPLOYEES");
			System.out.println("3) VIEW EMPLOYEE");
			System.out.println("4) REMOVE EMPLOYEE ");
			System.out.println("5) UPDATE EMPLOYEE");
			System.out.println("6) IMPORT EMPLOYEE");
			System.out.println("7) EXPORT EMPLOYEE");
			System.out.println("8) EXIT ");
			
			select=sc.nextInt();
			switch(select)
			{
				case 1:
					es.addUser();
					
					break;
				case 2:
					es.viewAll();
					
					
					break;
				case 3:
					
					break;
				case 4:
					
					
					break;
				case 5:
					
				break;
					
				case 6:
					
					
					
					
					
				break;
				case 7:
                 
				
					
	
					
					break;
				case 8:
					
					break;
					
					
			}
			
			
			
		} while(select != 8);
		System.out.println("EXITING .....");

		

	}

}
