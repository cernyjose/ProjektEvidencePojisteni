import java.util.Scanner;

public class EvidencePojisteni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        Pojisteny pojisteny = new Pojisteny();
        String volba = "";

        // hlavní cyklus
        while (!volba.equals("4")) {
            pojisteny.vypisVyber();
            volba = sc.nextLine();
            System.out.println();

            // reakce na volbu
            switch (volba) {
                case "1":
                    pojisteny.pridejZaznam();
                    break;
                case "2":
                    pojisteny.vypsatZaznamy();
                    break;
                case "3":
                    pojisteny.vyhledatZaznamy();
                    break;
                case "4":
                    System.out.println("Program byl ukončen.");
                    break;
                default:
                    pojisteny.vypisVyber();
                    break;
            }
        }
    }
}

