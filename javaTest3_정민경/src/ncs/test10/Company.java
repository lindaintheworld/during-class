package ncs.test10;

public class Company {

	public static void main(String[] args) {

		
		Employee[] employees = new Employee[2];
		
		employees[0] = new Secretary("Hilery", 1, "secretary", 800);
		employees[1] = new Sales("Clinten", 2, "sales", 1200);
		
		System.out.println("name    department     salrary");
		System.out.println("------------------------------------");		
		for(int i = 0; i < employees.length; i++) {
			System.out.println(employees[i].getName() + "   " +
			employees[i].getDepartment()  + "     " +
			employees[i].getSalary());
			
		}
		System.out.println();
		System.out.println("인센티브 100 지급");
		System.out.println();
		System.out.println("name    department     salrary     tax");
		System.out.println("--------------------------------------");
		
		((Secretary)employees[0]).incentive(100);
		((Sales)employees[1]).incentive(100);

		for(int i = 0; i < employees.length; i++) {
			System.out.println(employees[i].getName() + "   " +
			employees[i].getDepartment()  + "         " +
			employees[i].getSalary() + "    " + employees[i].tax());
			
			System.out.printf("%5s%5s%5d%5.2f\n", employees[i].getName(),employees[i].getDepartment(),employees[i].getSalary(),employees[i].tax());

		}
		System.out.printf("%s%10s%5d%5.2f\n", employees[0].getName(),employees[0].getDepartment(),employees[0].getSalary(),employees[0].tax());
		System.out.printf("%s%10s%5d%5.2f\n", employees[1].getName(),employees[1].getDepartment(),employees[1].getSalary(),employees[1].tax());

	}
	
}
