import java.util.*;
public class EmpMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		EmpServ Serv=new EmpServ();
       
		int select =0;
		do
		{
			System.out.println(" CHOOSE AN OPTION");
			System.out.println("1) VIEW ALL EMPLOYEES");
			System.out.println("2) ADD  EMPLOYEE");
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
					Serv.viewAll();
					break;
				case 2:
					Serv.addUser();
					
					break;
				case 3:
					Serv.view();
					break;
				case 4:
					Serv.removeUser();
					
					break;
				case 5:
					
				break;
					
				case 6:
					Serv.importEmp();
					
					
				break;
				case 7:
					Serv.exportEmp();
					
					break;
				case 8:
					
					break;
					
					
			}
			
			
			
		} while(select != 8);
		System.out.println("EXITING .....");

	}

}
