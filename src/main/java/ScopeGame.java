/**
 * Modify the sample code below so that we can display the integer value we
 * have assigned based on the value of the flag variable
 */
public class ScopeGame {
    public static void main(String[] args) {
        boolean flag = false;
        if (flag) {
            // do something when flag is true
            int numberWhenFlagIsTrue = 12;
        } else {
            // do something else when flag is false
            int numberWhenFlagIsFalse = 5;
        }
        System.out.println(numberWhenFlagIsTrue); // <- this will not work because numberWhenFlagIsTrue is not in scope
    }
}
