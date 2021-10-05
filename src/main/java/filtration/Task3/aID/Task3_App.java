package filtration.Task3.aID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task3_App {

	public static void main(String[] args) {
		
		List<Employee> person = new ArrayList<>();
		person.add(new Employee("Aly", "SE", "01064304242"));
		person.add(new Employee("Sara", "SE", "01032615292"));
		person.add(new Employee("Bassem", "SE", "01651570175"));
		person.add(new Employee("Ola", "QE", "01030277021"));
		person.add(new Employee("Yomna", "QA", "01066749160"));
		person.add(new Employee("Ahmed", "SM", "01030216305"));
		person.add(new Employee("Mohammed", "SM", "01963971085"));
		
		Map<String,List<Employee>> personByTitle = new HashMap<>();
		personByTitle = person
				.stream() 
				.collect(Collectors.groupingBy(Employee::getEmployeeTitle)); 
		System.out.print(personByTitle);
		
	}

}
