/*Your task is to create a function that does four basic mathematical operations.

The function should take three arguments - operation(string/char), value1(number), value2(number).
The function should return result of numbers after applying the chosen operation. */

public class BasicOperations {
    public static Integer basicMath(String op, int v1, int v2) {
        if ("+" == op)
            return v1 + v2;
        if ("-" == op)
            return v1 - v2;
        if ("*" == op)
            return v1 * v2;
        if ("/" == op)
            return v1 / v2;
        return 0;
    }
}
