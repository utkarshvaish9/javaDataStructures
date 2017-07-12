package javaclass; 

public class ExceptionHandling {
	static void validate(int amount) throws InsufficientAmountException{  
	     if(amount<0)  
	      throw new InsufficientAmountException("hello",1000);  
	     else  
	      System.out.println("you can take amount");  
	   }  
	
	public static void main(String[] args) {
		try
		{
			validate(100);
			validate(-100);
			
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(InsufficientAmountException e)
		{ 
			System.out.println(e.amount + " "+e);
		}
		
	}

}
