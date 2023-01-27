// Inheritance
public class Nasabah implements RekeningBank {

  private Double saldo;
  private String nama;

  public Nasabah(String nama, Double saldo) {
    this.nama = nama;
    this.saldo = saldo;

    System.out.printf("Rekening baru berhasil dibuat atas nama %s dengan saldo awal Rp.%,.2f\n", this.nama, this.saldo);
  }

  public double getSaldo() {
    return this.saldo;
  }

  @Override
  public void deposit(Double amount) {
    saldo += amount;
  }

  @Override
  public void withdraw(Double amount) {
    if (saldo > amount) {
      saldo -= amount;
      System.out.printf("Anda mengambil sebanyak Rp.%,.2f\n", amount);
      System.out.printf("Sisa saldo anda adalah Rp.%,.2f\n", this.saldo);
    } else {
      System.out.println("Saldo tidak mencukupi.");
    }
  }

}
