import java.util.*;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter integers (type 'done' to finish):");
        while (true) {
            String input = sc.next();
            if (input.equalsIgnoreCase("done")) break;
            try {
                int num = Integer.parseInt(input);
                numbers.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer or 'done'.");
            }
        }
        int sum = 0;
        for (Integer n : numbers) {
            sum += n;
        }
        System.out.println("Sum of entered integers: " + sum);
        sc.close();
    }
}
