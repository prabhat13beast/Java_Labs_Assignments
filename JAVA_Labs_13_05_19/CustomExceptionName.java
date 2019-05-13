import java.util.Scanner;
class MyException extends Exception {

   MyException(String str){
        super(str);
    }
}

public class CustomExceptionName {
   
   public static void main(String args[])  {
   
      
         System.out.println("Enter your first name & last name");
         Scanner sc = new Scanner(System.in);
		     String s1 = sc.nextLine();
		     String s2 = sc.nextLine();

		 try
		 {
		 	new CustomExceptionName().checkName(s1,s2);

		 }catch(MyException e)
		 {
		 	System.out.println("Exception caught: "+e);
		 }
      	 
   }

   public void checkName(String fn, String ln) throws MyException
   {
   		System.out.println("Checking name");
   		if(fn.equals("") || ln.equals(""))
        	throw new MyException("First name or last name cannot be empty");
        else
        	System.out.println("Name is valid");
   }
}