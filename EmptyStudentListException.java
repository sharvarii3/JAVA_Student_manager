package exceptions;
// EmptyStudentListException.java
public class EmptyStudentListException extends Exception {
    public EmptyStudentListException(String message) {
        super(message);
    }
}