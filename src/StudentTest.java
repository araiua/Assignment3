public class StudentTest {
    public static void main(String[] args){
        try {
            Student s1 = new Student(67, "Sulukhan", 3.8);
            System.out.println("Student created: " + s1.getName());

            Student s2 = new Student(667, "Arnur", 0.1);
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
