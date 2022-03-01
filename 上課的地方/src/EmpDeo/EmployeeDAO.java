package EmpDeo;

public interface EmployeeDAO {
	// create
	boolean createEmployee(Employee emp);

	// read
	Employee findEmployeeById(Integer ID);

	Employee[] findAllEmployee();

	// update
	boolean updateEmployee(Employee emp);

	// Delete
	boolean deleteEmployee(Integer id);

}
