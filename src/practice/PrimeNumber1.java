package practice;

public class PrimeNumber1 {

	public static void main(String[] args) {

//		for(int a=1;a<=100;a++) 
//		{
//			int count=0;
//			for(int i=1;i<=a;i++) 
//			{
//				if(a%i==0)
//				{
//				count++;	
//				}
//			}
//			if (count==2) {
//				System.out.print(a+" ");
//			}
//		}
//
//	}
//
//}

		for (int a = 1; a <= 100; a++) {
			int count = 0;
			for (int i = 1; i <= a; i++) {
				if (a % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.print(a + " ");
			}
		}
	}

}
