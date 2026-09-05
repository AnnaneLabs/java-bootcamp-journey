import java.util.Scanner;

/**
 * ============================================
 *  EXERCICE 2 — Conditions
 * ============================================
 *
 * Énoncé :
 * --------
 * Demander une note à l'utilisateur et afficher :
 * - Si la note >= 10 : "Admis"
 * - Si la note < 10  : "Non admis"
 *
 * Bonus : Ajouter les mentions :
 * - >= 16 : "Très bien"
 * - >= 14 : "Bien"
 * - >= 12 : "Assez bien"
 * - >= 10 : "Passable"
 * - < 10  : "Échec"
 */
public class Exercice2_Conditions {

    public static void main(String[] args) {

        // TODO : Créer un Scanner
        Scanner userInput = new Scanner(System.in);
        // TODO : Demander la note
        System.out.println("entre your note: ");
        double note = userInput.nextDouble();

        // TODO : Afficher le résultat
        if(note >= 10)
        {
            System.out.println("Admis: ");
            if (note >= 16)
            {
                System.out.println("Très bien");
            } else if (note >= 14) {
                System.out.println("Bien");
            } else if (note >= 12 ) {
                System.out.println("Assez bien");
            }
            else if ( note >= 10)
            {
                System.out.println("Passable");
            }
        }
        else
            System.out.println("non admis");

    }
}