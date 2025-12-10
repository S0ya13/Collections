import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        File path = new File("C:\\Users\\Asus\\Desktop\\JavaHomework\\Collections\\src\\workers.txt");

        List<String> employees = new ArrayList<>();

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

        Collections.sort(employees, Collections.reverseOrder());

        System.out.println("Number of workers with repetitions: " + employees.size());

        System.out.println("Sorted in reverse order workers: ");
        for (String employee : employees) {
            System.out.println(employee);
        }
    }
}
