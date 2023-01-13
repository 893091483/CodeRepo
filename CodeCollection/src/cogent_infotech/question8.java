/**
 * 
 */
package cogent_infotech;
import java.util.*;
/**
 * @author : Jialin Zheng
 * Jan 11, 2023
 */
public class question8 {
	public static void main(String[] args) {
		int [] arr = new int [5];
		Random rand = new Random();
		for(int i:arr) {
			i = rand.nextInt(41);
		}
		boolean aFound = false, bFound= false;
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Your first number is " + a);
		System.out.println("Your second number is " + b);
		
		for(int i: arr) {
			if(i == a)
				aFound = true;
			if(i == b)
				bFound = true;
		}
		if(aFound&&bFound)
			System.out.println("Bingo");
		else
			System.out.println("false");
	}
}
