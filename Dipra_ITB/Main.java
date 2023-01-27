// IN PRGORESS

public class Main {

    public Ganemon customGanemon(int player) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Silahkan player " + player + " kustom monster Anda\n");
        System.out.println("Nama Ganemon: ");
        String nama = scan.nextLine();
        // blum bikin tampilan elemen
        System.out.println("Elemen: ");
        String elemen = scan.nextLine();

        System.out.println("Health points: ");
        int HP = scan.nextInt();
        
        System.out.println("Attack points: ");
        int AT = scan.nextInt();

        System.out.println("Defend points: ");
        int DF = scan.nextInt();

        System.out.println("Ultimate points: ");
        int ULT = scan.nextInt();

        Ganemon monster = new Ganemon(nama, elemen, HP, AT, DF, ULT);
        return monster;
    }

    public void play() {
        Ganemon monster1 = customGanemon(1);
        Ganemon monster2 = customGanemon(2);

        int round = 1;
        while (getHP(monster1) > 0 && getHP(monster2) > 0) {
            // giliran player 1
            if (round%2 == 1) {
                Ganemon attacker = monster1;
                Ganemon defender = monster2;
            } else { // giliran player 2
                Ganemon attacker = monster2;
                Ganemon defender = monster1;
            }

            // Proses Hit dan Elemental Reactions

            round++;
        }

        if (getHP(monster1) == 0) {
            System.out.println("Player 2 menang yeayyyyyy");
        } else {
            System.out.println("Player 1 menang yeayyyyyy");
        }
    }

    public static void main(String[] args) {
        String opening = "Selamat Datang di Pertempuran Ganemon\n\n";
        System.out.println(opening);

        while (true) {
            Scanner scan = new Scanner(System.in);

            play();
            System.out.println("Apakah kalian ingin bermain lagi (y/n): ");
            String cek = scan.nextLine();
            if (cek != 'y') break;
            System.out.println("Selamat bermain kembali :D");
        }

        System.out.println("Selamat tinggal, jangan lupa main lagi yaaa... :D\nGausah belajar!!! 'kan udah pinter dan cerdas, Auto A lah yaaa :D");
    }
}