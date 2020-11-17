package d2;
import java.
potsclass Employee{
	private int empId;
	private string empName;
	public Employee(int empId, string empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return empId+" +empName";
	}
}
public class EmployeeDemo {

	public static void main(String[] args) {
		Employee e = new Employee(101, "Ram");
		System.out.println(e);
	}

}
