import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//        Program bank sederhana
//
//        Terdapat fitur login dan register lalu setelah login akan ada pilihan menu
//        cek saldo, deposit, dan tarik tunai.
//
//        Implementasi OOP ada pada user dimana user terdapat tiga jenis yaitu standard, gold, dan platinum
//
//        Tersedia 3 akun/user bawaan untuk tes:
//        - mch123, 1234 (standard)
//        - abg123, 1234 (gold)
//        - dxg123, 1234 (platinum)
//
//        Program berbasis terminal jadi dijalankan di terminal

public class App {

    public static Scanner sc = new Scanner(System.in);
    public static User user = null;
    public static List<User> users = new LinkedList<>();

    public static void main(String[] args) {

        users.addAll(List.of(new User(500, "mch123", 1234), new GoldUser(500, "abg123", 1234), new PlatinumUser(500, "dxg123", 1234)));

        while (user == null) {
            loginPage();
        }

        while (true) {
            mainPage();
            int input = sc.nextInt();
            if (input == 1){
                while (true) {
                    user.cekSaldo();
                    String input2 = sc.next();
                    if (input2.equals("y")){
                        break;
                    }
                }
            } else if (input == 2) {
                try {
                    Boolean a = user.tarikTunai();
                    while (!a) {
                        a = user.tarikTunai();
                    }
                } catch (Exception e){

                }
            } else if (input == 3) {
                try {
                    Boolean a = user.deposit();
                    while (!a) {
                        a = user.deposit();
                    }
                } catch (Exception e){

                }
            }else if (input == 4) {
                user = null;
                loginPage();
            }
        }
    }

    public static void loginPage(){
        System.out.println("LOGIN");
        System.out.println("=====\n");
        System.out.println("1.\tSign in");
        System.out.println("2.\tRegister");
        System.out.println("3.\tExit\n");
        System.out.print("Masukan pilihan : ");
        int input = sc.nextInt();

        if (input == 2){
            register();
        } else if (input == 1){
            signIn();
        } else if (input == 3) {
            System.exit(0);
        }
    }

    public static void signIn(){
        System.out.println("\nSIGN IN");
        System.out.println("=========================\n");
        System.out.print("Username: ");
        String username = sc.next();
        sc.nextLine();
        System.out.print("Password: ");
        int pass = sc.nextInt();
        sc.nextLine();
        System.out.println("");

        for (User u: users){
            if (u.getUsername().equals(username)){
                if (u.getPass() == pass){
                    user = u;
                    return;
                } else if (u.getPass() != pass) {
                    System.out.println("password salah");
                    loginPage();
                }
            }
        }
        System.out.println("username salah");
        loginPage();
    }

    public static void mainPage(){
        System.out.println("\nWELCOME TO BANKING APP");
        System.out.println("=========================\n");
        System.out.println("1.\tCek saldo");
        System.out.println("2.\tTarik tunai");
        System.out.println("3.\tTambah deposit");
        System.out.println("4.\tKeluar\n");
        System.out.print("Masukan pilihanmu : ");
    }

    public static void register(){
        String username;
        int password;
        int deposit;
        while (true) {
            System.out.println("REGISTER");
            System.out.println("=====\n");
            System.out.print("1.\tUsername (6 karakter): ");
            username = sc.next();
            sc.nextLine();
            System.out.print("2.\tPassword (4 angka):");
            password = sc.nextInt();
            sc.nextLine();
            System.out.print("3.\tConfirm password : ");
            int cpass = sc.nextInt();
            sc.nextLine();

            boolean b = true;
            for (User u: users){
                if (u.getUsername().equals(username)){
                    System.out.println("Username telah digunakan");
                    b = false;
                    break;
                }
            }

            if (username.length() <= 6 && password <= 9999 && password == cpass && b){
                break;
            }

            if (username.length() > 6) {
                System.out.println("Invalid username");
            }
            if (password > 9999) {
                System.out.println("Invalid password");
            }
            if (password != cpass) {
                System.out.println("password dan confirm password harus sama");
            }


            System.out.print("Apakah mau mengulang? (y/n): ");
            String inp = sc.next();
            if (!inp.equals("y")){
                loginPage();
                return;
            }
        }

        while (true){
            System.out.println("REGISTER");
            System.out.println("PEMILIHAN MEMBER");
            System.out.println("================\n");
            System.out.println("1.\tSTANDARD");
            System.out.println("2.\tGOLD");
            System.out.println("3.\tPLATINUM");
            System.out.println("4.\tKembali\n");
            System.out.print("Masukan pilihan : ");
            int inp2 = sc.nextInt();

            if (inp2 == 1){
                while(true) {
                    System.out.println("STANDARD MEMBER");
                    System.out.println("================\n");
                    System.out.println("Minimal deposit $50");
                    System.out.print("Deposit awal ('-1' untuk kembali): ");
                    deposit = sc.nextInt();
                    if (deposit >= 50) {
                        User newUser = new User(deposit, username, password);
                        users.add(newUser);
                        System.out.println("*** REGISTRASI BERHASIL ***");
                        loginPage();
                        return;
                    } else if (deposit == -1){
                        break;
                    }
                }
            } else if (inp2 == 2){
                while(true) {
                    System.out.println("GOLD MEMBER");
                    System.out.println("================\n");
                    System.out.println("Minimal deposit $250");
                    System.out.println("Deposit awal ('-1' untuk kembali): ");
                    deposit = sc.nextInt();
                    if (deposit >= 250) {
                        User newUser = new GoldUser(deposit, username, password);
                        users.add(newUser);
                        System.out.println("*** REGISTRASI BERHASIL ***");
                        loginPage();
                        return;
                    } else if (deposit == -1){
                        break;
                    }
                }
            } else if (inp2 == 3){
                while(true) {
                    System.out.println("PLATINUM MEMBER");
                    System.out.println("================\n");
                    System.out.println("Minimal deposit $500");
                    System.out.println("Deposit awal ('-1' untuk kembali): ");
                    deposit = sc.nextInt();
                    if (deposit >= 500) {
                        User newUser = new PlatinumUser(deposit, username, password);
                        users.add(newUser);
                        System.out.println("*** REGISTRASI BERHASIL ***");
                        loginPage();
                        return;
                    } else if (deposit == -1){
                        break;
                    }
                }
            } else if (inp2 == 4){
                loginPage();
                return;
            } else {
                System.out.println("Input salah silahkan ulangi kembali");
            }
        }
    }
}
