package sdbms;

public interface StudentManagementSystem {

	void addStudent();
	void displayStudent();
	void displayAllStudents();
	void removeStudent();
	void removeAllStudents();
	void updateStudent();
	void countStudents();
	void sortStudents();
	void getStudentWithHighestMarks();
	void getStudentWithLowestMarks();

}

// ALL Method inside interface are automatically public and abstract
