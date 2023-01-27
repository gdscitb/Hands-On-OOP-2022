public class nonFiction extends Book {
    protected nonFiction  (String title, String author, int stock) {
        super(title, author, stock);
    }

    @Override
    public void status() {
        System.out.println("Terima kasih! Anda telah mendonasikan buku non-fiksi.");
    }

    @Override
    public void keterangan() {
        System.out.println("Genre buku: Non-fiksi");
    }
}
