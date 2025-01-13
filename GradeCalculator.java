public class GradeCalculator extends Student {
    
    private int marks;

    public GradeCalculator(String name, int age, int marks) {
        super(name, age);
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
