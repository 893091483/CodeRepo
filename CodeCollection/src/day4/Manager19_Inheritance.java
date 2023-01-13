/**
 * 
 */
package day4;

/**
 * @author : Jialin Zheng
 * Jan 12, 2023
 */
class person19{
	void drink() {
		System.out.println("water ");
	}
}
class Employee19 extends person19{
	void login() {
		System.out.println("login ");
	}
}

class Manager19 extends Employee19{
	void assignment() {
		System.out.println("assign work ");
	}
}

public class Manager19_Inheritance {
	public static void main(String[] args) {
		Manager19 manager = new Manager19();
		manager.drink();
		manager.login();
		manager.assignment();
	}
}
