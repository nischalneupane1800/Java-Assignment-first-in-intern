package Assignment;
import java.util.*;
import java.util.*;
public class Student
{
    int id;
    String name;
    Address address;
    String email;
    String phone_no;
   
    Student()
    {
    	
    }

    public Student(int id, String name,Address address, String phone_no,String email) 
    {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone_no = phone_no;
        this.email = email;
    }
    public static HashMap<Integer, Student> hash1 = new HashMap<>();
    

    public static HashMap<Integer, Student> getHash1()
    {
        return hash1;
    }
    public void setHash(HashMap<Integer, Student> hash1) 
    {
        this.hash1 = hash1;
    }
    public void addStudent()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your id: ");
        id = sc.nextInt();
        System.out.println("Enter your name: ");
        name = sc.next();
        System.out.println("Enter your Address: ");
        Address a = new Address();
        a.address();
        
        System.out.println("Enter your phone no: ");
        phone_no = sc.next();
        System.out.println("Enter your Email id: ");
        email = sc.next();
        hash1.put(id, new Student(id, name,a,phone_no,email));
        
       
        


    }
    


}
