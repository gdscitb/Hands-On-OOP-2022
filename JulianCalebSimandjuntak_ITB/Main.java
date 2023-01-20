import java.util.Scanner;
import java.util.List;

// MAIN CLASS
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat datang di Nameless Gym! \n");


        // Sudah jadi member atau belum?
        System.out.println("Apakah Anda ingin login atau register? \n");
        System.out.println("1. login");
        System.out.println("2. register");
        int accountMember = input.nextInt();
        input.nextLine(); // this line to consume the newline character

        if (accountMember == 1) { // Jika ingin login
            // Meminta input untuk login
            System.out.println("\nSilahkan melakukan login!");
            System.out.println("Masukkan nama Anda! ");
            String loginName = input.nextLine();
            System.out.println("Masukkan password Anda! ");
            String loginPassword = input.nextLine();

            // Sistem login
            MemberLogIn login = new MemberLogIn();
            login.login(loginName, loginPassword);

        } else if (accountMember == 2) { // Jika ingin register
            // Meminta input untuk register
            System.out.println("\nSilahkan melakukan register!");
            System.out.println("Masukkan nama Anda! ");
            String registerName = input.nextLine();
            System.out.println("Masukkan password Anda! ");
            String registerPassword = input.nextLine();
            System.out.println("Masukkan usia Anda! ");
            int registerAge = input.nextInt();
            input.nextLine(); // this line to consume the newline character
            System.out.println("Masukkan berat Anda (kg)! ");
            int registerWeight = input.nextInt();
            input.nextLine(); // this line to consume the newline character
            System.out.println("Masukkan tinggi Anda (cm)! ");
            int registerHeight = input.nextInt();
            input.nextLine(); // this line to consume the newline character

            // Meminta input tipe member apa
            System.out.println("\nIngin menjadi member regular atau premium? ");
            System.out.println("1. Regular (Rp150.000) ");
            System.out.println("2. Premium (Rp200.000) ");
            int registerType = input.nextInt();
            input.nextLine(); 

            // Pembuatan member baru
            MemberTypeFactory registerMember = new MemberTypeFactory();
            Member newMember = registerMember.createMember(registerName, registerPassword, registerType, registerAge, registerWeight, registerHeight);
            newMember.status();

        }

        // Mengambil list peralatan gym
        EquipmentManager equipmentManager = new EquipmentManager();
        List<GymEquipment> equipmentList = equipmentManager.getEquipmentList();

        // Memilih peralatan gym
        while (true) {
            System.out.println("\nApa yang ingin Anda lakukan: (1/2/3)");
            System.out.println("1. Melihat peralatan yang tersedia");
            System.out.println("2. Menggunakan peralatan");
            System.out.println("3. Keluar");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    // View available equipment
                    for (GymEquipment equipment : equipmentList) {
                        System.out.println(equipment.getName() + ": " + (equipment.isUsed() ? "Sedang dipakai" : "Tersedia"));
                    }
                    break;
                case 2:
                    // Use equipment
                    System.out.println("\nPeralatan mana yang ingin anda gunakan? (Nama peralatan)");
                    String equipmentName = input.nextLine();
                    boolean checkEquipmentName = false;
                    for (GymEquipment equipment : equipmentList) {
                        if (equipment.getName().equals(equipmentName) && !equipment.isUsed()) {
                            equipment.use();
                            equipment.setUsed(true);
                            checkEquipmentName = true;
                            break;
                        } else if (equipment.getName().equals(equipmentName) && equipment.isUsed()) {
                            System.out.println("Peralatan ini sedang dipakai \n");
                            checkEquipmentName = true;
                            break;
                        }
                    }
                    if (!checkEquipmentName) {
                        System.out.println("Peralatan tidak tersedia, silahkan coba lagi. \n");
                    }
                    break;
                case 3:
                    // Exit
                    System.out.println("\nTerima kasih telah menggunakan Nameless Gym!");
                    return;
                default:
                    System.out.println("\nPilihan invalid. Silahkan coba lagi.");
                    break;
            }
        }
    }
}


