package CustomCollection;

import java.util.ArrayList;

import model.Employee;

public class EmployeeList extends ArrayList<Employee>{
	ArrayList<Employee> emp;
	
	
	public EmployeeList(int n){
		emp = new EmployeeList(n);
	}

	public void indexOf(Employee e){
		emp.indexOf(e);
	}

	public boolean add(Employee e)
	{
		return emp.add(e);
	}
	

	public void add(int i, Employee e) {
		emp.add(i, e);
	}

	public Employee remove(int i){
		return emp.remove(i);
		//return null;
	}

	public void remove(Employee e){
		emp.remove(e);
	}
}
