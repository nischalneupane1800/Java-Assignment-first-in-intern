package Assignment;
import java.util.*;

public class DeleteById 
{

	    Student s=new Student();
	    void deleteById(){
	        Scanner input=new Scanner(System.in);
	        System.out.println("Enter the id of the student:");
	        int id1=input.nextInt();
	        if(s.getHash1().containsKey(id1)) 
	        {
		        s.getHash1().remove(id1);
		        MiddleWare m = new MiddleWare();
		        m.middleWare();
	        }
	        else
	        {
	        	System.out.println("Sorry the record doesn't exists...");
		        MiddleWare m = new MiddleWare();
		        m.middleWare();
	        }
	    }
	    }

