/**
 * 
 */

/**
 * @author : Jialin Zheng
 * Jan 9, 2023
 */
package cogent_infotech;

import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printEven(n);
	}   
	
	public static void printEven(int n) {
		if(n % 2 ==1)
			n= n-1;
		while(n >= 0) {
			System.out.println(n);
			n -= 2;
		}
	}
}
