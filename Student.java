// Student.java
public class Student {
    private String name;
    private long prn;
    private String dob;
    private double marks;

    public Student(String name, long prn, String dob, double marks) {
        this.name = name;
        this.prn = prn;
        this.dob = dob;
        this.marks = marks;
    }

    public String getName() { return name; }
    public long getPrn() { return prn; }
    public String getDob() { return dob; }
    public double getMarks() { return marks; }

    public void setName(String name) { this.name = name; }
    public void setDob(String dob) { this.dob = dob; }
    public void setMarks(double marks) { this.marks = marks; }

    @Override
    public String toString() {
        return "Name: " + name + ", PRN: " + prn + ", DoB: " + dob + ", Marks: " + marks;
    }
}
