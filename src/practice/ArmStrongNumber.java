package practice;

public class ArmStrongNumber {

	public static void main(String[] args) {
	
		int a=153,arm=0,rem,cp=a;
		
		while(a>0)  //153>0  15>0
		{
			rem=a%10;  //3  5
			a=a/10;    //15  1
			arm=arm+(rem*rem*rem); //30
		}
		
		if(cp==arm)
		{
			System.out.println(cp+"is armstrong");
		}else {
			System.out.println(cp+"is not armstrong");
		}

	}

}
