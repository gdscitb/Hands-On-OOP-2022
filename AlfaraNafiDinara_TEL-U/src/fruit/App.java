package fruit;
import java.util.Scanner;
import fruit.apple.Apple;
import fruit.watermelon.Watermelon;

public class App {
    public static void main(String[] args) {
		System.out.println("\n= = = = = = = = = = = = = = = Selamat datang di katalog buah = = = = = = = = = = = = = = ="); 

		Scanner scanner = new Scanner(System.in);
        boolean addMore = true;

        while (addMore) {
            System.out.println("\nMenu buah:");
			System.out.println("1. Apel");
			System.out.println("2. Semangka");
			System.out.print("Pilih buah: ");
            int fruitChoice = scanner.nextInt();
			AbstractFactory fruitFactory = null;
			Apple apple = null;
			Watermelon watermelon = null;

            if (fruitChoice == 1) {
				fruitFactory = FruitFactory.getFactory("apple");
                System.out.println("Kamu memilih apel.\n");
            } else if (fruitChoice == 2) {
				fruitFactory = FruitFactory.getFactory("watermelon");
                System.out.println("Kamu memilih semangka.\n");
            } else {
                System.out.println("Pilihan tidak valid.");
				System.exit(0);
            }

            System.out.println("Menu warna:");
			System.out.println("1. Hijau");
			System.out.println("2. Kuning");
			System.out.println("3. Merah");
			System.out.print("Pilih warna: ");
            int colorChoice = scanner.nextInt();

            if (colorChoice == 1 && fruitChoice == 1) {
                apple = fruitFactory.getApple("hijau");
            } else if (colorChoice == 2 && fruitChoice == 1) {
                apple = fruitFactory.getApple("kuning");
            } else if (colorChoice == 3 && fruitChoice == 1) {
                apple = fruitFactory.getApple("merah");
            }else if (colorChoice == 1 && fruitChoice == 2) {
                watermelon = fruitFactory.getWatermelon("hijau");
            } else if (colorChoice == 2 && fruitChoice == 2) {
                watermelon = fruitFactory.getWatermelon("kuning");
            }else if (colorChoice == 3 && fruitChoice == 2) {
                watermelon = fruitFactory.getWatermelon("merah");
            } else {
				System.out.println("Pilihan tidak valid.");
				System.exit(0);
            }

			if (fruitChoice == 1) {
				System.out.println("\nDetail buah apel");
                System.out.println("nama: "+apple.name());
				System.out.println("rasa: "+apple.flavor());
				System.out.println("warna: "+apple.color());
				System.out.println("harga: "+apple.price()+" /Kg");
            } else if (fruitChoice == 2) {
				System.out.println("\nDetail buah semangka");
				System.out.println("name: "+watermelon.name());
				System.out.println("rasa: "+watermelon.flavor());
				System.out.println("warna: "+watermelon.color());
				System.out.println("harga: "+watermelon.price()+" /Kg");
            } else {
                System.out.println("Pilihan tidak valid.");
				System.exit(0);
            }

            System.out.print("\nMau ulangi? (y/n): ");
            String addMoreChoice = scanner.next();
            if (addMoreChoice.equalsIgnoreCase("n")) {
                addMore = false;
            }
        }
	}
}
