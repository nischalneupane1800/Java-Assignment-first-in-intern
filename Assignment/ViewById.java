package Assignment;
import java.util.*;

public class ViewById {
    public void viewById(){
        Student addStudent = new Student();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the id of the student:");
        int id1 = input.nextInt();
        if(addStudent.getHash1().containsKey(id1)) {
        Student a = addStudent.getHash1().get(id1);
        System.out.println("Id :"+a.id+"\n"+"Name:"+a.name+"\n"+"Phone:"+a.phone_no+"\n"+"Address:\n"
	            +"Temporary Address: "+a.address.temp_addr+"\n"+"Permanent Address"+a.address.perm_addr+"\n"+"Email: "+a.email);
        MiddleWare m = new MiddleWare();
        m.middleWare();
        }
        else 
        {
        	System.out.println("Sorry The record doesn't exists...");
            MiddleWare m = new MiddleWare();
            m.middleWare();
        }
    }
}