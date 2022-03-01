package EmpDeo;

public class EmployeeDAOImpl implements EmployeeDAO {
	private Employee[] empList = new Employee[10];
	private int count = 0;

	@Override
	public boolean createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		if (count < empList.length) {
			empList[count] = emp;
			count++;
			return true;
		} else {
			System.out.println("陣列已滿");
			return false;
		}
	}

	@Override
	public Employee findEmployeeById(Integer ID) {
		for (Employee employee : empList) {
			if (employee.getEmployeeID() == id) {
				return employee;
			}
		}
		return null;
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee[] findAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		for (Employee employee : empList) {
			if (employee.getEmployeeID() == emp.getEmployeeID()) {
				employee.setAddress(emp.getAddress());
				employee.setHireDate(emp.getHireDate());
				employee.setName(emp.getName());
				employee.setTitle(emp.getTitle());
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteEmployee(Integer id) {
		for (int count=0;count<empList.length;count++) {
			if(empList[count].getEmployeeID()==id) {
				empList[count]=empList[count++];
			}
		}
		// TODO Auto-generated method stub
		return false;
	}

}
