package javaclass;

public class InsufficientAmountException extends Exception{ 
	int amount;
	
	InsufficientAmountException(String s){
	super(s);
	
			
		 }  
	InsufficientAmountException(String s,int amount)
	{
		super(s);
		this.amount = amount + 1000; 
		
	}
	
		}  		