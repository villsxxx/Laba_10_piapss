package university;

import java.util.List;
import java.util.Vector;

public class Lecturer extends ResearchAssociate {
	public java.util.Vector<Course> _courses;

	public Lecturer(int aSsNo, String aName, String aEmail, String aFieldOfStudy) {
		super(aSsNo, aName, aEmail, aFieldOfStudy);
		this._courses = new Vector<>();
	}

	public java.util.List<Course> getCourses() {
		return this._courses;
	}

	public void addCourse(Course aCourse) {
		this._courses.add(aCourse);
	}
}