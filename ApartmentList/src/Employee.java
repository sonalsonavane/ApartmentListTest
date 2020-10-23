
/**
 * 
 */

/**
 * @author sonal
 *
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Employee {
	int empID;
	public String empName;
	String department;
	int bandLevel;

	public Employee() {
	}

	public Employee(int id, String name, String Dept, int level) {
		this.empID = id;
		this.empName = name;
		this.department = Dept;
		this.bandLevel = level;
	}
	
	
	// I am using Treeset , as its very memory efficient. You can store large data with very optimized way.

	TreeSet<Employee> EmployeesSet = new TreeSet<Employee>(new Comparator<Employee>() {
		@Override
		public int compare(Employee e1, Employee e2) {
			return e1.empName.trim().compareTo(e2.empName.trim());
		}
	});
	
	
	
// Add employee data all together
	public void addAllEmployees(ArrayList<Employee> employees) {

		EmployeesSet.addAll(employees);

	}
	
	
    // Add Single Employee
	public void addEmployee(Employee e) {

		EmployeesSet.add(e);
	}

	//If an Employee left the remove that employee
	public void removeEmployee(Employee e) {
		EmployeesSet.remove(e);
	}
	
	

	// create Lunch Groups of Min 3 and Max 5
	public List<List<String>> createEmployeeGroups() {

		List<List<String>> employeeGroups = new ArrayList<List<String>>();

		// Shuffle the collection everytime you create Lunch Groups so that people will not for lunch with same group forever.
		Collections.shuffle(Arrays.asList(EmployeesSet));

		// based on Employee Numbers and min-max criterion allocate groups
		int setSize = EmployeesSet.size();
		int groupSize = 0;
		int isRemainder = 0;

		if (setSize % 5 == 0) {
			groupSize = 5;
			isRemainder = 0;
		}

		else if (setSize % 5 >= 3) {
			groupSize = 5;
			isRemainder = 1;
		}

		else if (setSize % 5 < 3) {
			groupSize = 3;

			isRemainder = 0;

		}

		
		//calculate number of buckets/groups we will need
		int numOfBuckets = (setSize / groupSize) > 0 ? (setSize / groupSize) + isRemainder : 1;

		//Initialize ArrayList of Groups
		for (int i = 0; i < numOfBuckets; i++) {
			employeeGroups.add(new ArrayList<String>());
		}

		// Add employees to groups
		int i = 0;
		for (Employee e : EmployeesSet) {
			employeeGroups.get((i / groupSize) % numOfBuckets).add(e.empName);
			i++;

		}

		return employeeGroups;

	}

}
