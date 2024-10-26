import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String liczby = "liczby_losowe.txt";
        int numberOfNumbers = 15;

        try (FileWriter fileWriter = new FileWriter(liczby)) {
            Random random = new Random();
            for (int i = 0; i < numberOfNumbers; i++) {
                int randomNumber = random.nextInt();
                System.out.println(randomNumber);
                fileWriter.write(Integer.toString(randomNumber));
                fileWriter.write(System.lineSeparator());
            }
            System.out.println("Liczby zapisane do pliku");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
