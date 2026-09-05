/**
 * ============================================
 *  EXERCICE 3 — Boucles (nombres pairs)
 * ============================================
 *
 * Énoncé :
 * --------
 * Afficher tous les nombres pairs de 1 à 100.
 *
 * Indice : un nombre est pair si (nombre % 2 == 0)
 *
 * Sortie attendue :
 * -----------------
 * 2
 * 4
 * 6
 * ...
 * 100
 */
public class Exercice3_BouclesPairs {

    public static void main(String[] args) {

        // TODO : Écrire la boucle

        for (int i = 1 ; i <= 100 ; i++)
        {
            if (i % 2 == 0)
            {
                System.out.println(i);
            }
        }

    }
}