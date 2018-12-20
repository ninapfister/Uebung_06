import javax.swing.*;

public class Aufgabe1
{
    public static void main (String []args) {


        String a = JOptionPane.showInputDialog("Nina");
        String b = JOptionPane.showInputDialog("Sabrina");
        String c = JOptionPane.showInputDialog("Michael");

        String sub1 = a.substring(0,3); // Teil vom Wort
        System.out.println(sub1);

        String sub2 = b.substring(0,3);
        System.out.println(sub2);

        String sub3 = c.substring(0,3);
        System.out.println(sub3);

        if(sub1.equals(sub2)|| sub2.equals(sub3)||sub3.equals(sub2))  // oder Verknüpfung - eines muss wahr sein
        {
            System.out.println("Die ersten drei Zeichen von drei Variablen sind gleich!");
        }
        else
        {
            System.out.println("Keines der eingegeben Werte stimmt überein!");
        }
    }
}
