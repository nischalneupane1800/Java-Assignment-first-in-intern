package Assignment;

import java.util.*;


public class Compare
{
	public static String str;
	public static String str1;
	public static String password;
	void compare() throws InterruptedException 
	{
		Register r = new Register();
		r.register();
		
		this.str = r.pwd;
		this.str1 = r.pwd1;
				
		if(str.equals(str1))
		{
			System.out.println("Registrtion Successful.... \n");
			Assignment a = new Assignment();
			a.assignment();
		}
		else
		{
			System.out.println("Sorry Password doesn't match... \n");
			Assignment a = new Assignment();
			a.assignment();
		}
		String password = r.pwd;

	}
}
