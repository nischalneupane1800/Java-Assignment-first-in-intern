package Assignment;
import java.util.*;

public class ViewAll
{

	    public void viewAll(){
	       SaveStudentInfo save = new SaveStudentInfo();
	    	Student student1 = new Student();
	    	
	    	
	        //Example ex = new Example();
	        HashMap<Integer, Student> hm = student1.getHash1();
	    	
	    	
	    	HashMap<Integer, Student> x = student1.getHash1();
	    	

	        
	        for(Map.Entry<Integer,Student> map1 : x.entrySet())
	        {
	        	
	            int key =  map1.getKey();
	            Student s= map1.getValue();
	           
	            System.out.println("");
	            System.out.println("Detatils of key: "+key+".\n");
	            System.out.println("Id :"+s.id+"\n"+"Name:"+s.name+"\n"+"Phone:"+s.phone_no+"\n"+"Address:\n"
	            +"Temporary Address: "+s.address.temp_addr+"\n"+"Permanent Address "+s.address.perm_addr+"\n"+"Email: "+s.email);
	        }
	        MiddleWare m = new MiddleWare();
	        m.middleWare();
	    }
	}