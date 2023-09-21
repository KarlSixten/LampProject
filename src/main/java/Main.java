import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Lamp> lampeListe = new ArrayList<>(List.of(
                new Lamp("lampe1", true),
                new Lamp("lampe2", true),
                new Lamp("lampe3", true),
                new Lamp("lampe4", true),
                new Lamp("lampe5", true)));

        Lamp selectedLamp = null;

        while (true) {
            for (Lamp lampe : lampeListe) {
                System.out.println(lampe);
            }
            System.out.println("\nHvilken lampe skal ændres?: ");
            int valg = input.nextInt();
            switch (valg) {
                case 0 -> System.exit(0);
                case 1 -> selectedLamp = lampeListe.get(0);
                case 2 -> selectedLamp = lampeListe.get(1);
                case 3 -> selectedLamp = lampeListe.get(2);
                case 4 -> selectedLamp = lampeListe.get(3);
                case 5 -> selectedLamp = lampeListe.get(4);
                default -> System.out.println("Enter valid number.\n");
            }
            selectedLamp.toggle();
        }
    }
}
