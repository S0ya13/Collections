import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main() {
        File path = new File("C:\\Users\\Asus\\Desktop\\JavaHomework\\Collections\\src\\workers.txt");
        List<String> employees = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    employees.add(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
        System.out.println("Number of workers: " + employees.size());

        System.out.println("Workers: ");
        for (String employee : employees) {
            System.out.println(employee);
        }
    }
}
