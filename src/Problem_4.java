import java.util.HashMap;
import java.util.Map;

public class Problem_4 {

	public static void main(String[] args) {
        int[] input = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        Map<Integer, Integer> result = new HashMap<>();
        for (int i = 1; i <= 9; i++) {
            result.put(i, 0);
        }

        for (int i = 1; i <= 9; i++) {
            int count = 0;
            for (int num : input) {
                if (num % i == 0) {
                    count++;
                }
            }
            result.put(i, count);
        }
        System.out.print("{");
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            System.out.print(entry.getKey() + ": " + entry.getValue());
            if (index < result.size() - 1) {
                System.out.print(", ");
            }
            index++;
        }
        System.out.println("}");
    }

}
