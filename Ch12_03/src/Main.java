import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<String, Employee> staff = new HashMap<>();
		staff.put("1234", new Employee("Mr. Joo", 10000000.0));
		staff.put("2345", new Employee("Lady Yejin", 10000010.0));
		staff.put("3456", new Employee("Musician", 20000000.0));
		System.out.println(staff);
		staff.remove("1234");
		staff.put("1234", new Employee("Jun", 1000000));
		System.out.println(staff);
		Employee e = staff.get("2345");
		System.out.println(e);
		//staff.forEach((k, v) -> System.out.println("Key = " + k + ", Value = " + v));
	}

}
