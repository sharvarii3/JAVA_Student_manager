import java.util.*;
import exceptions.*;

public class StudentOperations {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student s) throws DuplicateStudentException, InvalidDataException {
        if (s.getName().isEmpty() || s.getMarks() < 0) {
            throw new InvalidDataException("Invalid student data.");
        }
        for (Student stu : students) {
            if (stu.getPrn() == s.getPrn()) {
                throw new DuplicateStudentException("Student with same PRN already exists.");
            }
        }
        students.add(s);
    }

    public void displayStudents() throws EmptyStudentListException {
        if (students.isEmpty()) throw new EmptyStudentListException("No students to display.");
        for (Student s : students) System.out.println(s);
    }

    public Student searchByPRN(long prn) throws StudentNotFoundException {
        for (Student s : students) {
            if (s.getPrn() == prn) return s;
        }
        throw new StudentNotFoundException("PRN not found.");
    }

    public void updateStudent(long prn, String newName, String newDob, double newMarks)
            throws StudentNotFoundException, InvalidDataException {
        Student s = searchByPRN(prn);
        if (newName.isEmpty() || newMarks < 0)
            throw new InvalidDataException("Invalid update data.");
        s.setName(newName);
        s.setDob(newDob);
        s.setMarks(newMarks);
    }

    public void deleteStudent(long prn) throws StudentNotFoundException {
        Student s = searchByPRN(prn);
        students.remove(s);
    }
}
