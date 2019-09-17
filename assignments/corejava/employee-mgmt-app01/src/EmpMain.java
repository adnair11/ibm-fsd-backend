import java.util.*;
public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
       Emp n=new Emp();
		int select =0;
		do
		{
			System.out.println(" CHOOSE AN OPTION");
			System.out.println("1) VIEW ALL EMPLOYEES");
			System.out.println("2) ADD  EMPLOYEE");
			System.out.println("3) VIEW EMPLOYEE");
			System.out.println("4) REMOVE EMPLOYEE ");
			System.out.println("5) EXIT ");
			
			select=sc.nextInt();
			switch(select)
			{
				case 2:
					n.addUser();
					break;
				case 1:
					n.viewAll();
					break;
				case 3:
					n.view();
					break;
				case 4:
					n.removeUser();
					
					
			}
			
			
			
		} while(select != 5);
		System.out.println("EXITING .....");

	}

}
