package Assignment;
import java.util.*;

class Address
{
	 String temp_addr;
	 String perm_addr;
    
  
    void address() 
    {
    	System.out.println("Enter your temp_addr:- ");
    	Scanner sc = new Scanner(System.in);
    	temp_addr = sc.next();
    	System.out.println("Enter your permanent addr:- ");
    	perm_addr = sc.next();
    }
}
