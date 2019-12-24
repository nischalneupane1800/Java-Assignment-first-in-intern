package Assignment;
import java.util.*;

import java.util.Scanner;

public class MiddleWare 
{	public void middleWare() 
	{
		String a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter one of the following choices... \n");
		System.out.println("1. Add Student ");
		System.out.println("2. View all Student ");
		System.out.println("3. View Student by ID ");
		System.out.println("4. Delete Student by ID");
		a = sc.next();
		
		switch(a)
		{
			case "1":
				SaveStudentInfo s = new SaveStudentInfo();
				s.save();
				
			case "2":
				ViewAll v = new ViewAll();
				v.viewAll();
			case "3":
				ViewById b = new ViewById();
				b.viewById();
			case "4":
				DeleteById d = new DeleteById();
				d.deleteById();
			default:
				System.out.println("Invalid Input\n");
				MiddleWare m = new MiddleWare();
				m.middleWare();
					
		}

	}

 
}
