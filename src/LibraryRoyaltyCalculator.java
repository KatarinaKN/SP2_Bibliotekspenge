import bibliotek.AudioBook;
import bibliotek.Author;
import bibliotek.PrintedBook;
import bibliotek.Title;

public class LibraryRoyaltyCalculator {
    static void main() {

        Author garthNix = new Author("Garth Nix");

        Title sabriel = new AudioBook("Sabriel", "SKØN", 1, 790);
        Title lirael = new PrintedBook("Lirael", "SKØN", 37, 549);
        Title abhorsen = new PrintedBook("Abhorsen", "SKØN", 27, 407);

        garthNix.addTitle(sabriel);
        garthNix.addTitle(lirael);
        garthNix.addTitle(abhorsen);

        System.out.printf("%s: %.2f kr.", garthNix.getName(), garthNix.calculateRoyalties());

    }
}
