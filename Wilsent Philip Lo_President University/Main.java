import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean checker;
        Walnut hutao = new Walnut();
        Shogun raiden = new Shogun();
        Ayaya ayaka = new Ayaya();
        Qixing keqing = new Qixing();
        Itto itto = new Itto();

        do {
            System.out.println("My top 5 DPS in Genshin Impact (5 Stars Edition)");
            System.out.println("1. Hu Tao");
            System.out.println("2. Raiden Shogun");
            System.out.println("3. Kamisato Ayaka");
            System.out.println("4. Keqing");
            System.out.println("5. Arataki Itto");
            System.out.println(
                    "Enter the representative numbers in the above list to see the description and my opinion about the character!");
            byte number = scanner.nextByte();

            if (number > 0 && number < 6) {
                if (number == 1) {
                    System.out.println("\nHu Tao");
                    hutao.weaponType();
                    hutao.elementType();
                    hutao.artifact();
                    hutao.teamComp();
                    hutao.f2pFriendly();
                    hutao.myOpinion();
                } else if (number == 2) {
                    System.out.println("\nRaiden Shogun");
                    raiden.weaponType();
                    raiden.elementType();
                    raiden.artifact();
                    raiden.teamComp();
                    raiden.f2pFriendly();
                    raiden.myOpinion();
                } else if (number == 3) {
                    System.out.println("\nKamisato Ayaka");
                    ayaka.weaponType();
                    ayaka.elementType();
                    ayaka.artifact();
                    ayaka.teamComp();
                    ayaka.f2pFriendly();
                    ayaka.myOpinion();
                } else if (number == 4) {
                    System.out.println("\nKeqing");
                    keqing.weaponType();
                    keqing.elementType();
                    keqing.artifact();
                    keqing.teamComp();
                    keqing.f2pFriendly();
                    keqing.myOpinion();
                } else if (number == 5) {
                    System.out.println("\nArataki Itto");
                    itto.weaponType();
                    itto.elementType();
                    itto.artifact();
                    itto.teamComp();
                    itto.f2pFriendly();
                    itto.myOpinion();
                }

                checker = true;
            } else {
                System.out.println("Please enter valid number! \n");
                checker = false;
            }

        } while (checker == false || checker == true);
    }
}