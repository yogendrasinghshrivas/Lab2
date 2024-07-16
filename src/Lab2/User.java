package Lab2;

import java.util.Scanner;

public class User  {
	
	public static void checked(String email) throws InvalidEmailException {
		   if(email.contains("@")) {
	    	   System.out.println("Email is valid");
	       }else{
	    		  throw new InvalidEmailException("you can not consider the @ so this is Invalid email");
	        }
	       
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your email: ");
		
	    String email = sc.next();
	    
	    try {
			checked(email);
		} catch (InvalidEmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
