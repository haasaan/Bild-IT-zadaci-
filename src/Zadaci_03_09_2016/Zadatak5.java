package Zadaci_03_09_2016;

public class Zadatak5 {

	public static void main(String[] args) {
		// Pravimo objekat kurs jedan i na njeg dodajemo dva studenta
		Course course1 = new Course("Course1");
		course1.addStudent("student1");
		course1.addStudent("student2");
		// Kloniramo drugi objekat da bude kao prvi
		Course course2 = (Course) course1.clone();
		// Provjeravamo da li svaki stdent ima iste reference
		System.out.println(course1 == course2);
		System.out.println(course1.getCourseName() == course2.getCourseName());
		System.out.println(course1.getStudents() == course2.getStudents());

	}

}
