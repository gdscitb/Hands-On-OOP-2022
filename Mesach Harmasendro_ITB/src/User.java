public class User implements UserInterface{

    private int saldo;
    private String username;
    private int pass;

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public User(int saldo, String name, int pass) {
        this.saldo = saldo;
        this.username = name;
        this.pass = pass;
    }

    @Override
    public  Boolean deposit() {
        System.out.println("DEPOSIT");
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
            this.saldo += Integer.parseInt(input);
            System.out.println("deposit berhasil");
            System.out.println("========");
            System.out.print("Apakah mau kembali ke halaman utama (y/n) : ");
            String input2 = App.sc.next();
            return input2.equals("y");
        }
    }

    @Override
    public Boolean tarikTunai() {
        System.out.println("TARIK TUNAI");
        System.out.println("========\n");
        System.out.println("Maksimal penarikan $400");
        System.out.print("Masukan jumlah uang ('q untuk keluar'): ");
        String input = App.sc.next();
        if (input.equals("q")) return null;
        if (Integer.parseInt(input) > 400){
            System.out.println("Melebihi batas penarikan tunai ($500)");
            return false;
        } else {
            this.saldo -= Integer.parseInt(input);
            System.out.println("Tarik tunai berhasil");
            System.out.println("========");
            System.out.print("Apakah mau kembali ke halaman utama (y/n) : ");
            String input2 = App.sc.next();
            return input2.equals("y");
        }
    }

    public void cekSaldo(){
        System.out.println("CEK SALDO");
        System.out.println("========\n");
        System.out.println("Saldo : $" + this.getSaldo());
        System.out.print("Apakah mau kembali ke halaman utama (y/n) : ");
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
