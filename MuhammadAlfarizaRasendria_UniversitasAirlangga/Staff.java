package MuhammadAlfarizaRasendria_UniversitasAirlangga;

public class Staff extends Employee implements Salary{
    private int GajiHarianStaff = 200000;
    public int HariKerja;

    Staff(String Id,String Nama,int Jabatan,String Alamat,String Tanggal_Lahir,int HariKerja){
        super(Id,Nama,Jabatan,Alamat,Tanggal_Lahir);
        this.HariKerja=HariKerja;
    }

    public String getJabatan(){
        return "Staff";
    }

    @Override
    public int TotalGaji() {
        return this.GajiHarianStaff * HariKerja;
  }
    
    
}
