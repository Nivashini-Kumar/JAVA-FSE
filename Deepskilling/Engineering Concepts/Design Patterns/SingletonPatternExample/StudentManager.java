public class StudentManager {

    private static StudentManager instance;

    private StudentManager() {
        System.out.println("Student Manager Created");
    }

    public static StudentManager getInstance() {
        if (instance == null) {
            instance = new StudentManager();
        }
        return instance;
    }

    public void displayMessage() {
        System.out.println("Managing Student Records");
    }
}