public class Fiction extends Book {
    protected Fiction (String title, String author, int stock) {
        super(title, author, stock);
    }

    @Override
    public void status() {
        System.out.println("Terima kasih! Anda telah mendonasikan buku fiksi.");
    }

    @Override
    public void keterangan() {
        System.out.println("Genre buku: Fiksi");
    }
}
