import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int Q = scanner.nextInt();
            int E = scanner.nextInt();

            Set<Integer> recent = new HashSet<>();
            StringBuilder output = new StringBuilder();

            for (int i = 0; i < E; i++) {
                int id = scanner.nextInt();
                recent.add(id);
            }

            for (int i = 0; i < Q; i++) {
                int id = scanner.nextInt();

                if (recent.contains(id)) {
                    output.append("0\n");
                } else {
                    output.append("1\n");
                    recent.add(id);
                }
            }

            System.out.print(output.toString());
        }
    }
}
