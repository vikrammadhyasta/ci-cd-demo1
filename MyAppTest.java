public class MyAppTest {
    public static void main(String[] args) {
        MyApp app = new MyApp();

        int result = app.add(2, 3);
        if (result == 5) {
            System.out.println("Test Passed: add(2, 3) == 5");
        } else {
            System.out.println("Test Failed: add(2, 3) != 5");
        }

        // Add more tests if needed
    }
}
