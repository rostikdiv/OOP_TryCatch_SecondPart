public class SecondClass {
    public void method1() throws CustomException {
        throw new CustomException("Помилка у методі 1");// генерація власного вийнятку
    }

    public void method2() {
        try {
            method1();
            // перехоплення власного вийняту
        } catch (CustomException e)  {
            System.out.println("Перехоплено власний виняток: " + e.getMessage());
        }
    }

    public void method3(String[] str) {
        try {
            str[7]="nco";
        } catch (IndexOutOfBoundsException e){
            throw new IndexOutOfBoundsException(e.getMessage());//генерація вийнятку
        }
    }
}
