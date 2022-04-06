package oopFirstExample;

public class CourseManager {

	public void theClassIsOver(Course course) {
		boolean isTheCourseOver = true;
		
		if(isTheCourseOver) {
			int newPercentOfSuccess = course.percentOfSuccess + 5;
			System.out.println(course.courseName + " : %" + newPercentOfSuccess + " tamamlandý");
		}
		
	}
}
