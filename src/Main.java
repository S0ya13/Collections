import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

void main() {
    // Task 1
    /*
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

     */

    // Task 2
    /*
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

     */

    // Task 3

}
