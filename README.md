# Scope Lab

## Learning Goals

- Fix scope issues

## Instruction

The starter code that we are given will currently not work in this state.
Consider the scope of the variables and modify the following code so that it
will compile. We want to print out the number according to the value of the
`flag` variable. Therefore, we must ensure that when we make the adjustments
needed that the appropriate number is displayed to the user.

```java
public class StudentGame {
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
```
