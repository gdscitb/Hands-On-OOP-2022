// IN PRGORESS

public class Main {

    public Ganemon customGanemon(int player) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Silahkan player 1 kustom monster Anda\n");
        System.out.println("Nama Ganemon: ");
        String gamon1 = scan.nextLine();
        // blum bikin tampilan elemen
        System.out.println("Elemen: ");
        String el1 = scan.nextLine();

        System.out.println("Nama Ganemon: ");
        String gamon1 = scan.nextLine();
    }

    public static void main(String[] args) {
        String opening = "Selamat Datang di Pertempuran Ganemon\n\n";
        System.out.println(opening);

        customGanemon(1); customGanemon(2);
    }
}