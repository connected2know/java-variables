package main.java;

public class JavaVariables4Student {

	protected String studentName; // 1 - Instance Variable

	private static String studentUniversity = "UNIVERSITY_A"; // 2 - Class Variable

	protected JavaVariables4Student() {
	}

	String getStudentName() {

		return this.studentName;

	}

	public void setStudentName(String studentName) { // 3 - Parameter

		this.studentName = studentName;

	}

	public String getStudentUniversity() {

		String universityCode = "123:"; // 4 - Local variable

		return universityCode + studentUniversity;

	}

	public static void main(String[] args) {

		JavaVariables4Student student = new JavaVariables4Student();
		student.setStudentName("C2K");

		System.out.println("Student: " + student.getStudentName() +

				" belongs to University: " + student.getStudentUniversity());

	}

}
