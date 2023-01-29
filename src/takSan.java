import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class takSan {
    public static void main(String[] args) {

        List<Integer> originalNumber = Arrays.asList(45, 3, 23, 546, 56, 324, 5, 46, 34,
                645, 5, 34552, 364756, 86, 5,
                45, 23, 5, 6, 5, 345, 76, 3, 44);
        List<Integer> oddNumber = new ArrayList<>();
        List<Integer> evenNumber = new ArrayList<>();
        for (int res : originalNumber) {
            if (res % 2 == 0) {
                oddNumber.add(res);
            } else {
                evenNumber.add(res);
            }

        }
        System.out.println(oddNumber);
        System.out.println(evenNumber);
    }
}
