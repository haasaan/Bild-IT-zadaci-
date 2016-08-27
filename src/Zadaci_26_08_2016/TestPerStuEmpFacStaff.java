package Zadaci_26_08_2016;

public class TestPerStuEmpFacStaff {

	public static void main(String[] args) {
		// Pravimo 4 objekta i prolsjedujemo im imena tj stringove
		Person person = new Person("person1");
		Student student = new Student("student");
		Employee employee = new Employee("employee");
		Faculty faculty = new Faculty("faculty");
		Staff staff = new Staff("staff");
		// Pozivamo sve metode to string i ispisujemo
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());

	}

}
