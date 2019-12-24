package Assignment;
import java.util.*;

public class Register
{
	static public String name;
	static public String pwd;
	public String pwd1;
    
	public void register()
    {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter your name? ");
    	name = sc.next();
    	
    	
    	System.out.println("Enter your Password? ");
    	pwd = sc.next();
    	
    	System.out.println("Confirm your password? ");
    	pwd1 = sc.next();
    	

    }
}
