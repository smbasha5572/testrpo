package practice;

public class Reverse {

	public static void main(String[] args) {
		
		int a=123,rem,rev=0;
		while(a>0)
		{
			rem=a%10;
			a=a/10;
			rev=rev*10+rem;
		}
          System.out.println(rev);
	}

}
