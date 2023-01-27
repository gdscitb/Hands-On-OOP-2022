import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char isWithdraw = ' ';
		System.out.println(
				"Selamat datang, Calon Nasabah. Anda di sini untuk membuat rekening baru\nJadi, silahkan isi beberapa pertanyaan berikut.");

		System.out.print("Nama: ");
		String nama = input.nextLine();
		System.out.print("Saldo Awal: ");
		Double saldo = input.nextDouble();

		Nasabah nasabah1 = new Nasabah(nama, saldo);

		System.out.print("Apakah anda ingin melakukan penarikan tunai? ");
		input.nextLine();
		isWithdraw = input.nextLine().charAt(0);

		while (true) {
			if (isWithdraw == 'N' || isWithdraw == 'n') {
				System.out.printf("Sampai jumpa lagi, %s", nama);
				break;
			}
			System.out.print("Berapa jumlah tarik tunai? ");
			Double amountWithdraw = input.nextDouble();
			if (nasabah1.getSaldo() > amountWithdraw) {
				nasabah1.withdraw(amountWithdraw);
			} else {
				System.out.println("Saldo tidak cukup");
				break;
			}
			System.out.print("Apakah anda ingin melakukan penarikan tunai lagi (Y / N)? ");
			input.nextLine();
			isWithdraw = input.nextLine().charAt(0);
		}
	}
}
