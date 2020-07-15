package list;

import java.util.ArrayList;
import java.util.Iterator;

class Employee{
	int empId;
	String empName;
	String email;
	String gender;
	float salary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public void GetEmployeeDetails() {
		System.out.println("empId\tempName\temail\tgender\tsalary");
		System.out.println(this.empId+"\t"+this.empName+"\t"+this.email+"\t"+this.gender+"\t"+this.salary);
	}
}
class EmployeeDb{
	ArrayList<Employee> List = new ArrayList<Employee>();
	boolean addEmployee(Employee e) {
		List.add(e);
		return true;
	}
	boolean deleteEmployee(int empId) {
		Iterator i = List.iterator();
		while(i.hasNext()) {
			Employee e = (Employee) i.next();
			if(e.getEmpId()==empId) {
				List.remove(e);
				return true;
			}
		}
		return false;
	}
	void showPaySlip(int empId) {
		Iterator i = List.iterator();
		while(i.hasNext()) {
			Employee e = (Employee) i.next();
			if(e.getEmpId()==empId) {
				e.GetEmployeeDetails();
				return;
			}
		}
	}
}
public class EmployeeManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean status = false;
		EmployeeDb empDb1 = new EmployeeDb();
		Employee emp1 = new Employee();
		emp1.empId = 1001;
		emp1.empName = "aniket";
		emp1.email = "aniket.maity1@gmail.com";
		emp1.gender = "M";
		emp1.salary = 10456;
		status = empDb1.addEmployee(emp1);
		empDb1.showPaySlip(1001);

	}

}
