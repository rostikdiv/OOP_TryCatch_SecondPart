public class Main {
    public static void main(String[] args) {
        SecondClass secondClass = new SecondClass();
        String[] arr=new String[2];

        try {
            secondClass.method1();
        } catch (CustomException e) {
            System.out.println("Перехоплено власний виняток під час виклику методу 1: " + e.getMessage());
        }

        secondClass.method2();

        try {
            secondClass.method3(arr);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Перехоплено власний виняток під час виклику методу 3: " + e.getMessage());
        }
    }
}