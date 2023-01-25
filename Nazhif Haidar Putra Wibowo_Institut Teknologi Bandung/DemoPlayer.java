import java.util.Scanner;
public class DemoPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nickname anda: ");
        String nama = scanner.next();
        Player player = new Player(nama);
        int choice = Integer.MIN_VALUE;
        while (choice != 1 && choice != 2){
            System.out.println("Silakan pilih ingin berlangganan Apa:\n1.Welkin\n2.Battle Pass");
            choice = scanner.nextInt();
            if (choice != 1 && choice != 2){
                System.out.println("Input tidak valid");
            }
        }
        if (choice == 1){
            player.langgananWelkin();
            System.out.println("Anda berlangganan " + player.welkin.name);
            player.welkin.activate(player);
        }
        else if (choice == 2){
            player.langgananBattlePass();
            System.out.println("Anda berlangganan " + player.battlePass.name);
            player.battlePass.activate(player);
        }
        scanner.close();
        System.out.println("Program berakhir.");
        System.out.println("total primogems yang didapat = " + player.getPrimogems());
    }
}
