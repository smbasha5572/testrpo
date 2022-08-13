package practice;

import java.util.Scanner;

public class Hacker {

	public static void main(String[] args) {
		  final Scanner scanner = new Scanner(System.in);
                 System.out.println("enter value");
		   
		        int N = scanner.nextInt();
		        System.out.println("enter N value");
		        if(!(N%2==0)){
		            System.out.println("weird");
		        }
		         else if(N%2==0 && 2<=N  && N<=5){
		             System.out.println("not weird");
		               
		         }else if(N%2==0 && 6<=6 && N<=20){
		             System.out.println(" wierd");
		         }
		         else{
		             System.out.println("not wired");
		         }
		         
		     
		       

	}

}
