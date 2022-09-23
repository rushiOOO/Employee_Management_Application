
import java.util.HashSet;
import java.util.Scanner;
public class EmployeeService {
	HashSet<Employee> empset=new HashSet<Employee>();
	
	Employee emp1=new Employee(1,";Amit",23 , "Developer","IT",35000);
	Employee emp2=new Employee(2,"Ram",29 , "Tester","CO",40000);
	Employee emp3=new Employee(3,"Meena",20 , "DevOps Eng","Admine",39000);
	Employee emp4=new Employee(4,"Dhiraj",25 , "System Eng","CO",32000);
	Employee emp5=new Employee(5,"Suraj",23 , "Developer","IT",45000);
	
	Scanner sc=new Scanner(System.in);
	boolean found =false;
	int id;
	String name;
	int age;
	String department;
	String desiganation;
	double salary;
	
	public EmployeeService() {
		empset.add(emp1);
		empset.add(emp2);
		empset.add(emp3);
		empset.add(emp4);
		empset.add(emp5);
	}
	//Add employee
	public void addEmp() {
		System.out.println("Enter id");
		id=sc.nextInt();
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter age");
		age=sc.nextInt();
		System.out.println("Enter Desiganation");
		desiganation=sc.next();
		System.out.println("Enter Department");
		department=sc.next();
		System.out.println("Enter Salary");
		salary=sc.nextDouble();
		
		Employee emp=new Employee(id, name, age, desiganation, department, salary);
		
		empset.add(emp);
		System.out.println(emp);
		System.out.println("Employee added Successfully");
	}
	//view employee based on there id
	public void viewEmp() {
		System.out.println("Enter id");
		id=sc.nextInt();
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				System.out.println(emp);
				found=true;
			}
		}
		if(!found) {
			System.out.println("Employee with this id is not present");
		}
	}
	//update employee details
	public void updateEmp() {
		System.out.println("Enter id: ");
		id=sc.nextInt();
		boolean found=false;
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				System.out.println("Enter name: ");
				name=sc.next();
				System.out.println("Enter age");
				age=sc.nextInt();
				System.out.println("Enter desiganation");
				desiganation=sc.next();
				System.out.println("Enter department");
				department=sc.next();
				System.out.println("Enter new Salary");
				salary=sc.nextDouble();
				emp.setName(name);
				emp.setAge(age);
				emp.setDesiganation(desiganation);
				emp.setDepartment(department);
				emp.setSalary(salary);
				System.out.println("Updated Details of employee are: ");
				System.out.println(emp);
				found=true;
			}
		}
		if(!found) {
			System.out.println("Employee is not present");
		}
		else {
			System.out.println("Employee details updated successfully !!");
		}
	}
	//delete employee
		public void deleteEmp() {
			System.out.println("Enter id");
			id=sc.nextInt();
			boolean found=false;
			Employee empdelete=null;
			for(Employee emp:empset) {
				if(emp.getId()==id) {
					empdelete=emp;
					found=true;
				}
			}
			if(!found) {
				System.out.println("Employee is not present");
			}
			else {
				empset.remove(empdelete);
				System.out.println("Employee deleted successfully!!");
			}
		}
		//view all employees
		public void viewAllEmps() {
			for(Employee emp:empset) {
				System.out.println(emp);
			}
		}
}
