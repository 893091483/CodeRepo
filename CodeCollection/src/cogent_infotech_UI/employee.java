/**
 * 
 */
package cogent_infotech_UI;

/**
 * @author : Jialin Zheng
 * Jan 11, 2023
 */
public class employee {
	int empID;
	String empName;
	double empSalary;
	
	@Override
	public String toString() {
		return "employee [empID=" + empID + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}


	
	/**
	 * @return the empID
	 */
	public int getEmpID() {
		return empID;
	}

	/**
	 * @param empID the empID to set
	 */
	public void setEmpID(int empID) {
		this.empID = empID;
	}

	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * @return the empSalary
	 */
	public double getEmpSalary() {
		return empSalary;
	}

	/**
	 * @param empSalary the empSalary to set
	 */
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	employee(int empID,String empName,double empSalary){
		this.empID = empID;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	employee(){
		
	}
	
	
	
}
