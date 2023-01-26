public class Nasabah implements RekeningBank {

  private Double saldo;
  private String nama;

  public Nasabah(String nama, Double saldo) {
    this.nama = nama;
    this.saldo = saldo;
  }

  @Override
  public void deposit(Double amount) {
    saldo += amount;
  }

  @Override
  public void withdraw(Double amount) {
    if (saldo > amount) {
      saldo -= amount;
      System.out.printf("Anda mengambil sebanyak Rp.%,.2f\n");
      System.out.printf("Sisa saldo anda adalah Rp.%,.2f\n");
    }
    else
      System.out.println("Saldo tidak mencukupi.");
  }

}
