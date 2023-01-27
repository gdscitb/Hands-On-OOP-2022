public class GoldUser extends User{
    public GoldUser(int saldo, String name, int pass) {
        super(saldo, name, pass);
    }

    @Override
    public void cekSaldo() {
        System.out.println("CEK SALDO");
        System.out.println(" ** GOLD MEMBER **");
        System.out.println("========\n");
        System.out.println("Saldo : $" + super.getSaldo());
        System.out.print("Apakah mau kembali ke halaman utama (y/n) : ");
    }

    @Override
    public Boolean tarikTunai() {
        System.out.println("TARIK TUNAI");
        System.out.println(" ** GOLD MEMBER **");
        System.out.println("========\n");
        System.out.println("Maksimal penarikan $1000");
        System.out.print("Masukan jumlah uang ('q untuk keluar'): ");
        String input = App.sc.next();
        if (input.equals("q")) return null;
        if (Integer.parseInt(input) > 1000){
            System.out.println("Melebihi batas penarikan tunai ($1000)");
            return false;
        } else {
            super.setSaldo(super.getSaldo() - Integer.parseInt(input));
            System.out.println("Tarik tunai berhasil");
            System.out.println("========");
            System.out.print("Apakah mau kembali ke halaman utama (y/n) : ");
            String input2 = App.sc.next();
            return input2.equals("y");

        }
    }

    @Override
    public Boolean deposit() {
        System.out.println("DEPOSIT");
        System.out.println(" ** GOLD MEMBER **");
        System.out.println("========\n");
        System.out.println("Minimal deposit $50");
        System.out.print("Masukan jumlah uang ('q untuk keluar'): ");
        String input = App.sc.next();
        if (input.equals("q")) return null;
        if (Integer.parseInt(input) < 50) {
            System.out.println("Deposit gagal!!!");
            System.out.println("Minimal deposit $50");
            return false;
        } else {
            super.setSaldo(super.getSaldo() + Integer.parseInt(input));
            System.out.println("deposit berhasil");
            System.out.println("========");
            System.out.print("Apakah mau kembali ke halaman utama (y/n) : ");
            String input2 = App.sc.next();
            return input2.equals("y");
        }
    }
}
