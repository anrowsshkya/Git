public static void main(String[] args) {
    GradeCalculator student = new GradeCalculator("Alice", 20, 85);
    System.out.println("Name: " + student.getName());
    System.out.println("Age: " + student.getAge());
    System.out.println("Marks: " + student.getMarks());
    System.out.println("Grade: " + student.calculateGrade());
}
