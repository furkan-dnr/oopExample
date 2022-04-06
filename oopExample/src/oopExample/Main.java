package oopFirstExample;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course();
		course1.id = 1;
		course1.courseName = "Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)";
		course1.instructor = "Engin Demirog";
		course1.percentOfSuccess = 20;
		
		Course course2 = new Course();
		course2.id = 2;
		course2.courseName = "Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)";
		course2.instructor = "Engin Demirog";
		course2.percentOfSuccess = 90;
		
		Course course3 = new Course();
		course3.id = 3;
		course3.courseName = "Programlamaya Giriþ Ýçin Temel Kurs";
		course3.instructor = "Engin Demirog";
		course3.percentOfSuccess = 45;
		
		CourseManager courseManager = new CourseManager();
		
		courseManager.theClassIsOver(course1);
		courseManager.theClassIsOver(course2);
		courseManager.theClassIsOver(course3);

	}

}
