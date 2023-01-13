/**
 * 
 */
package cogent_infotech;

import java.util.Scanner;

/**
 * @author : Jialin Zheng
 * Jan 10, 2023
 */
public class question6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		boolean ans = checkStr(str);
		System.out.println(ans);
		
	}
	public static boolean checkStr(String str) {
		boolean ans;
		int index = (str.length()+1) /2;
		System.out.println(index);
		str = str.toUpperCase();
		int left = 0, right = str.length()-1;
		while(index-- > 0) {
			if(str.charAt(left) != str.charAt(right))
				return ans = false;
			left++;
			right--;
			
		}
			
		return true;
	}
}
