/**
 * 
 */
package cogent_infotech;
import java.util.*;
/**
 * @author : Jialin Zheng
 * Jan 10, 2023
 */
public class question7 {
	public static int sum =0;;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		sum = a + b;
		int pre = b;
		System.out.print(a + " "+ b);
		for(int i=0; i < 12; i++) {
			int temp = sum;
			sum = sum + pre;
			System.out.print(" " + sum);
			pre = temp;
		}
	}
}
