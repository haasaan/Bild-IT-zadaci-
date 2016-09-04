package Zadaci_03_09_2016;

public class Course implements Cloneable {
	// Tri privatna data fielda
	private String courseName;
	private String[] students = new String[10];
	private int numberOfStudents;

	// Konstruktor kome prosljedjujemo ime kao string
	public Course(String courseName) {
		this.courseName = courseName;
	}

	// Metoda koja dodaje strudente tj imena studenata
	public void addStudent(String student) {
		// Ako je broj studenata veci ili jednak duzini onda duzino mnozimo sa
		// dva i dodjeljujemo na niz stringa
		if (numberOfStudents >= students.length) {
			String[] temp = new String[students.length * 2];
			System.arraycopy(students, 0, temp, 0, students.length);
			students = temp;
		}
		// Povecavamo bro studenata
		students[numberOfStudents++] = student;
	}

	// Vracamo studente
	public String[] getStudents() {

		return students;
	}

	// Vracamo broj studenata
	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	// Vracamo ime kursa
	public String getCourseName() {
		return courseName;
	}

	// Studenti koji su pali
	public void dropStudent(String student) {
		// Forpetlja prolazi kroz ssve studente
		for (int i = 0; i < students.length; i++) {
			// Ako je studnet razlicit od indexa i
			if (student.equalsIgnoreCase(students[i])) {
				// Postavljamo palom studentu vrijednost na nulu
				students[i] = null;
				numberOfStudents--;
				while (i < numberOfStudents) {
					students[i] = students[i + 1];
					i++;
				}
				break;
			}
		}

	}

	public void clear() {
		students = new String[25];
		numberOfStudents = 0;
	}

	// Kloniramo objekat ako ne uspije u catchu hvatamo exception
	public Object clone() {
		Course course = null;
		try {
			course = (Course) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		course.students = students.clone();
		course.courseName = new String(courseName);

		return course;
	}

}
