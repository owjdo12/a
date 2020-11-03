package ex2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("김일", "001", "kim1@gmail.com", new Date(2020, 10, 23));
		emp1.setPay(10000000);
		emp1.setAddress("서울시");
		emp1.setTelno("010-1234-5678");
		emp1.displayEmployee();
		System.out.printf("이름 : %s, 사원번호 : %s, 생년월일 : %s, 급여액 : %f\n", emp1.getName(), emp1.getEmpNumber(), emp1.getBirthday(), emp1.getPay());
		String basicInfo = emp1.getBasicInfo();
		System.out.println(basicInfo);
		
		Employee emp2 = new Employee("김이", "002", "kim2@gmail.com", new Date(2000, 9, 9));
		
		Employee [] employees = new Employee[2];
		employees[0] = emp1;
		employees[1] = emp2;
		
		for(Employee emp : employees)
			emp.displayEmployee();
	}

}
