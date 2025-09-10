import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,op;
		while(true)
		{
		    System.out.print("1.add\n2.sub\n3.mul\n4.div\n0.exit\n");
		    	System.out.print("enter : ");
		    	a  = sc.nextInt();
		    		System.out.print("enter : ");
	        	b  = sc.nextInt();
	        		System.out.print("enter op: ");
	        	op = sc.nextInt();
	        	
	        	switch(op)
	        	{
	        	    case 1: System.out.print(a+b);
	        	    break;
	        	    case 2: System.out.print(a-b);
	        	    break;
	        	    case 3: System.out.print(a*b);
	        	    break;
	        	    case 4: System.out.print(a/b);
	        	    break;
	        	    case 0: System.out.print("thank you ,bye bye ");
	        	    return;
	        	    
	        	}
	        	System.out.print("\n-----------------------------------\n");
		}
		
	
	
	}
}
