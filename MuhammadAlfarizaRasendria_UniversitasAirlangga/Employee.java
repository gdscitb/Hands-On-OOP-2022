package MuhammadAlfarizaRasendria_UniversitasAirlangga;

public class Employee extends Person  {

  private String Id;
  private int Jabatan;

  public Employee(
    String Id,
    String Nama,
    int Jabatan,
    String Alamat,
    String Tanggal_Lahir
  ) {
    super(Nama,Alamat,Tanggal_Lahir);
    this.Id = Id;
    this.Jabatan=Jabatan;
  }

  public void Set_Id(String Id) {
    this.Id = Id;
  }

  public String Get_Id() {
    return this.Id;
  }

  
}
