/**
 * ============================================
 *  EXERCICE 4 — Boucles (somme)
 * ============================================
 *
 * Énoncé :
 * --------
 * Calculer et afficher la somme des nombres de 1 à 100.
 *
 * Résultat attendu : 5050
 */
public class Exercice4_BouclesSomme {

    public static void main(String[] args) {

        // TODO : Calculer la somme

        int sum = 0;

        // TODO : Afficher le résultat

        for (int i = 1 ; i <= 100 ; i++)
        {
            sum = sum + i;
        }

        System.out.println("Sum:" + sum);

    }
}