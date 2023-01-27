import java.util.ArrayList;
import java.util.List;

public class donationGenre implements Donation {
    public donationGenre() {}

    public Book donateBook(String title, String author, int genre, int stock) {
        if (genre == 1) {
            return new Fiction(title, author, stock);
        } else {
            return new nonFiction(title, author, stock);
        }
    }
}
