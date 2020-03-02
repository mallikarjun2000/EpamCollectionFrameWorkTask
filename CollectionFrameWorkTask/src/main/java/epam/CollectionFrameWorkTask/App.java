package epam.CollectionFrameWorkTask;

import java.util.Scanner;

import CustomCollection.EmployeeList;
import model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "<------ Employee List ----->\n" );
        System.out.print("Enter the employees :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        EmployeeList emp = new EmployeeList(n);
        for(int i=0;i<n;i++) {
        	System.out.print("Enter the employees name :");
        	String name = sc.next();
        	Employee e = new Employee(name,12,null,null);
        	emp.add(e);
        }
    }
}
