package Assignment;
import java.util.*;

class LoginAdmin
{
    static String name;
    static String pwd;
    Register r=new Register();
    public void loginAdmin() throws InterruptedException
    {        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your Name? ");
        name = sc.next();
        
        System.out.println("Enter your Password? ");
        pwd = sc.next();
        
        
        
        if(name.equals(r.name) && pwd.equals(r.pwd))
        {
	        System.out.println("Successfully Logged In... ");
	        MiddleWare w = new MiddleWare();
	        w.middleWare();
        }
        else
        {
        	System.out.println("Login fails:...");
        	Assignment a = new Assignment();
        	a.assignment();
        }      

}
        
        
        
        
        
        
        

     
        
     
    }
