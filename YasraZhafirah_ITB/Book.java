public abstract class Book {
    public String title;
    public String author;
    public int stock;

    Book(String title, String author, int stock) {
        this.title = title;
        this.author = author;
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int stock() {
        return stock;
    }

    public void status() {
    }

    public void keterangan() {}
}