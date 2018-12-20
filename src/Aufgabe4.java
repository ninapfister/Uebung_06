import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Aufgabe4
{
    public static void main (String[]args)
    {
        List<Integer> liste1 = new ArrayList<>(); // keine fixe Anzahl an Felder, ArrayList
        Random rnd = new Random();
        int zufallszahl = rnd.nextInt(1000)+1; // mind. 1, max 1000

        for (int i =0; i>zufallszahl; i++) // Start bei 0, läuft so oft wie die Zufallszahl es sagt
        {
            int zufallszahl2 = rnd.nextInt(500)+1; // neue Zufallszahl, Schleife neu durchgehen
            liste1.add(zufallszahl2); // hinzufügen zu ArrayList
        }

        for (int aufzählung:liste1) // für jedes Item dass in der ArrayListe befindet, läuft es einmal durch
        {
            System.out.println(aufzählung);; // gibt mit den Wert aus
        }
    }
}
