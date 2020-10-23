import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author sonal
 *
 */
public class facade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee empObj = new Employee();
		
		
		
        // Create Employess
		Employee e1 = new Employee(1, "Mark Jones", "Marketing", 1);
		Employee e2 = new Employee(2, "Jane Doe", "Operations", 2);
		Employee e3 = new Employee(3, "Sonal Sonavane", "Development", 3);
		Employee e4 = new Employee(4, "Anne HathWay", "Development", 4);
		Employee e5 = new Employee(5, "Anne Baraon", "Product", 5);
		Employee e6 = new Employee(6, "Viral Singh", "Product", 6);
		Employee e7 = new Employee(7, "Viral Singh One", "Product", 7);
		Employee e8 = new Employee(8, "Cecilia Jones", "HR", 8);
		Employee e9 = new Employee(9, "Cecile Mathew", "R&D", 9);
		Employee e10 = new Employee(10, "Yoona Kim", "R&D", 10);
		Employee e11 = new Employee(11, "Yoon Hyeeong", "R&D", 11);
		Employee e12 = new Employee(12, "Minji Yen", "R&D", 12);
		Employee e13 = new Employee(13, "Minji Ken", "R&D", 13);

		
		//create Single Employee
		Employee e14 = new Employee(13, "Yogita patil", "R&D", 14);
		empObj.addEmployee(e14);
		
		
		
  //Add all the employess altogther
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);
		employees.add(e7);
		employees.add(e8);
		employees.add(e9);
		employees.add(e10);
		employees.add(e11);
		employees.add(e12);
		employees.add(e13);

        empObj.addAllEmployees(employees);
        
        
        
        // create Lunch Groups
		List<List<String>> empGroups = empObj.createEmployeeGroups();

		//print lunch groups
		for (List<String> list : empGroups) {
			System.out.println("employeeGroups" + list);
		}

	}

}
