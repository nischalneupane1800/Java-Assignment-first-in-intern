package Assignment;
import java.util.*;

class Assignment
{
	static void assignment() throws InterruptedException{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choices: ");
        System.out.println("1. Register Admin ");
        System.out.println("2. Login Admin ");
        
        String a = sc.next();
 
        
        
        switch(a)
        {
        	case "1":
        		Compare c = new Compare();
        		c.compare();
        	case "2":
        		LoginAdmin l = new LoginAdmin();
        		l.loginAdmin();
        	default:
        		System.out.println("Sorry you Entered the wrong KeyWord...\n ");
        		
        		assignment();
            
        
        }
	}
    public static void main(String[] args) throws InterruptedException
    {
    	assignment();
        
    }
}