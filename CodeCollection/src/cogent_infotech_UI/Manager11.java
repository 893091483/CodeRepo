/**
 * 
 */
package cogent_infotech_UI;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author : Jialin Zheng
 * Jan 11, 2023
 */

public class Manager11 {
	public static void main(String[] args) {
		int choice;
		ArrayList <employee> emp = new ArrayList<employee>();
		Scanner scan = new Scanner(System.in);
		do{
		System.out.println("1. Add"); 
		System.out.println("2. Recall"); 
		System.out.println("3. Update"); 
		System.out.println("4. Delete"); 
		System.out.println("5. Exit"); 
		System.out.println();
		System.out.println("Please enter choice");
		choice = scan.nextInt();
		
		switch(choice) {
			case 1:{
				System.out.println("Please enter count");
				System.out.println();
				int id;
				String name;
				int salary;
				int count = scan.nextInt();
				for(int i = 0; i< count; i++) {
					System.out.println("Please enter id");
					id = scan.nextInt();
					System.out.println("Please enter name");
					name = scan.next();
					System.out.println("Please enter salary");
					salary = scan.nextInt();
					emp.add(new employee(id,name,salary));
					System.out.println(name + " is added to employee List");
				}
				System.out.println();
				
				break;
				
			}
			case 2: {
				System.out.println("Recall, please enter ID");
				int index = scan.nextInt();
				boolean flag = false;
				for(employee i: emp) {
					if(i.empID == index) {
						flag = true;
						System.out.println(i.toString());
						break;
					}
					
				}
				if(!flag)
					System.out.println("User not found!");
				System.out.println();
				break;
				
			}
					
							
						
			case 3: {
				System.out.println("Update, please enter ID");
				int index = scan.nextInt();
				
				for(employee i: emp) {
					if(i.empID == index) {
						int  salary;
						String name;
						System.out.println("Update, please enter name");
						name = scan.next();
						i.setEmpName(name);
						System.out.println("Update, please enter salary");
						salary = scan.nextInt();
						i.setEmpSalary(salary);
					}
					
				}
				System.out.println("done update");
				System.out.println();
				break;
				
				
			}
			case 4: {
				System.out.println("Delete, please enter ID");
				int index = scan.nextInt();
				for(employee i: emp) {
					if(i.empID == index) {
						emp.remove(i);
						System.out.println("User id " + index + " deleted");
						break;
					}
					
				}
				System.out.println();
				
				break;
			}
			case 5 :{
				System.out.println("Bye");
				break;
			}
			
			
		}
		
	}while(choice != 5);
	
		scan.close();
	}
	
	
	
}
