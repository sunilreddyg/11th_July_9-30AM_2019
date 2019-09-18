package corejava.Loops;

public class For_loop 
{

	public static void main(String[] args)
	{
		
		
		//Example1:--> Print numbers from 1 to 10
		for (int i = 1; i <= 10; i++) 
		{
			System.out.println(i);
		}
		
		
		
		//Example2:--> Conduct sub between 1 to 100
		int sum=0;
		for (int i = 1; i <= 100; i++) 
		{
			sum=sum+i;
		}
		System.out.println(sum);
		
		
		
		//Example3:--> Print array values 
		String browsers[]={"firefox","chrome","ie","safari","edge"};
		//Iterate for number of array size
		for (int i = 0; i < browsers.length; i++) 
		{
			String browsername=browsers[i];
			System.out.println(browsername);
		}
		
		
		
		
		
	}

}
