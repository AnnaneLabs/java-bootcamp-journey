import java.util.Scanner;

/**
 * ============================================
 *  🏆 CHALLENGE JOUR 1 — Student Grade Calculator
 * ============================================
 */
public class ChallengeJour1 {

    // === LES MÉTHODES SONT DÉPLACÉES ICI (EN DEHORS DE MAIN) ===

    public static double calculerMoyenne(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3.0;
    }

    public static boolean estAdmis(double moyenne) {
        if (moyenne >= 10) {
            return true;
        }
        return false; // Ajout du cas où l'étudiant n'est pas admis
    }

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

    // === LA MÉTHODE MAIN NE CONTIENT QUE L'EXÉCUTION ===
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Saisie des informations personnelles
        System.out.print("Entrez le nom de l'étudiant : ");
        String nom = scanner.nextLine();

        System.out.print("Entrez le prénom de l'étudiant : ");
        String prenom = scanner.nextLine();

        // 2. Saisie des trois notes
        System.out.print("Entrez la note 1 : ");
        double note1 = scanner.nextDouble();

        System.out.print("Entrez la note 2 : ");
        double note2 = scanner.nextDouble();

        System.out.print("Entrez la note 3 : ");
        double note3 = scanner.nextDouble();

        // 3. Traitements via les méthodes dédiées
        double moyenne = calculerMoyenne(note1, note2, note3); // Correction de l'orthographe
        String mention = calculerMention(moyenne);
        boolean admis = estAdmis(moyenne);

        // Conversion du booléen en texte clair pour le statut
        String statut = admis ? "Admis" : "Non admis";

        // 4. Affichage du résultat formaté
        System.out.println("\n-------------------------");
        System.out.println("Nom : " + nom);
        System.out.println("Prénom : " + prenom);
        System.out.printf("Moyenne : %.2f\n", moyenne);
        System.out.println("Mention : " + mention);
        System.out.println("Statut : " + statut);
        System.out.println("-------------------------");

        scanner.close();
    }
}
