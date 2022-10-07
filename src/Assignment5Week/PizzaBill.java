package Assignment5Week;

public class PizzaBill {

	public static void main(String[] args) {
		String pizzaSize="large";
				
		  boolean extChs=false;
		   boolean pepproniAdd=false;
		   int bill=0;
		  
		  if(pizzaSize=="small")
			  
		  {
			  bill=bill+15;
		  }
		  
			  else if(pizzaSize=="medium")
			  {
				  bill=bill+20;
			  }
			  else if (pizzaSize=="large")
					  {
				  bill=bill+25;
					  }
			  else
			  {
				  System.out.println("enter correct size");
			  }
		  
		  
			   
			   
			 
			    if(pepproniAdd ==true&&pizzaSize=="small") {
		 
			 bill=bill+2;
		 
			    }
			    else
			    {
			    	bill=bill+0;
			    }
			  if (pepproniAdd==true&&(pizzaSize=="medium"||pizzaSize=="large"))
			 { 
				 bill=bill+3;
			 
			
			 }
			  else
			  {
				  bill=bill+0;
			  }
			  
			  
			  if(extChs==true)
				 {
					 bill=bill+1;
					 
				 }
				   else
				   
						
						 {
							 bill=bill+0;
							 
						 }
					   
		 
		 
			System.out.println("total bill for  order is"+bill)	; 
			 
		 
		 }
		  }
