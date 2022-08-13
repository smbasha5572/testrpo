package practice;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int a=7,count=0;
		for (int i=1;i<=7;i++)
		{
			if(a%i==0) 
			{
				count++;
			}
			
		}
		if (count==2) 
		{
			System.out.println(a+ " is prime number");
		}else {
			System.out.println(a+ " is not prime number");
		}

	}

}
