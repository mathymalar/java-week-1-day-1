package week1.day1;

public class IsPrime {
	public static void main(String[] args) {
		int n = 16, count = 0;
		 for(int i=2; i<n; i++)
	      {
	         if(n%i == 0)
	         {
	            count++;
	            break;
	         }
	      }
	      
	      if(count==0)
	         System.out.println("\nIt is a Prime Number.");
	      else
	         System.out.println("\nIt is not a Prime Number.");
	   }
	}


	
		