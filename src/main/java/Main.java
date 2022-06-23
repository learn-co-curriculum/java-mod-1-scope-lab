public class Main {
    public static void main(String[] args) {
        boolean flag = false;
        int number;
        if (flag) {
            // do something when flag is true
            number = 12;
        } else {
            // do something else when flag is false
            number = 5;
        }
        System.out.println(number); // <- this will not work because numberWhenFlagIsTrue is not in scope
    }
}
