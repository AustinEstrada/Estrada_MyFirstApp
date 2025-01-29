import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EstradaMyFirstApp {
    public static void main(String[] args) {
        System.out.println("Full Name: Austin Estrada");

        LocalDateTime currentDateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println("Current Date and Time: " + currentDateTime.format(formatter));
    }
}
