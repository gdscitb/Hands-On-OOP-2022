import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.println(
				"Selamat datang, Calon Nasabah. Anda di sini untuk membuat rekening baru\nJadi, silahkan isi beberapa pertanyaan berikut.");

		System.out.print("Nama: ");
		String nama = input.nextLine();
		System.out.print("Saldo Awal: ");
		Double saldo = input.nextDouble();

		Nasabah nasabah1 = new Nasabah(nama, saldo);
	}
}
