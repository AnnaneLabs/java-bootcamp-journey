import java.util.Scanner;

/**
 * ============================================
 *  EXERCICE 5 — Méthodes
 * ============================================
 */
public class Exercice5_Methodes {

    // 1. Calculer la moyenne
    public static double calculerMoyenne(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    // 2. Vérifier si l'étudiant est admis
    public static boolean estAdmis(double moyenne) {
        return moyenne >= 10;
    }

    // 3. Calculer la mention
    public static String calculerMention(double moyenne) {
        if (moyenne >= 16) {
            return "Très bien";
        } else if (moyenne >= 14) {
            return "Bien";
        } else if (moyenne >= 12) {
            return "Assez bien";
        } else if (moyenne >= 10) {
            return "Passable";
        } else {
            return "Insuffisant";
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Saisir les 3 notes
        System.out.print("Entrez la première note : ");
        double n1 = scanner.nextDouble();

        System.out.print("Entrez la deuxième note : ");
        double n2 = scanner.nextDouble();

        System.out.print("Entrez la troisième note : ");
        double n3 = scanner.nextDouble();

        // Calculer la moyenne
        double moyenne = calculerMoyenne(n1, n2, n3);

        // Afficher les résultats
        System.out.println("Moyenne : " + moyenne);
        System.out.println("Admis : " + estAdmis(moyenne));
        System.out.println("Mention : " + calculerMention(moyenne));

        scanner.close();
    }
}
