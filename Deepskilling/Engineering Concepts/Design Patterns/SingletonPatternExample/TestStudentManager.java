public class TestStudentManager {

    public static void main(String[] args) {

        StudentManager manager1 = StudentManager.getInstance();
        manager1.displayMessage();

        StudentManager manager2 = StudentManager.getInstance();

        System.out.println("Same Object : " + (manager1 == manager2));
    }
}
