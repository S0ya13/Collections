import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static void main() {
        File path = new File("C:\\Users\\Asus\\Desktop\\JavaHomework\\Collections\\src\\workers.txt");
        Set<String> employees = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    employees.add(line.trim());
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Number of unique workers: " + employees.size());

        System.out.println("Unique employees: ");
        for (String employee : employees) {
            System.out.println(employee);
        }
    }
}
