package MuhammadAlfarizaRasendria_UniversitasAirlangga;

public class Manager extends Employee implements Salary{
    private int GajiHarianManager = 500000;
    public int HariKerja;

    Manager(String Id,String Nama,int Jabatan,String Alamat,String Tanggal_Lahir,int HariKerja){
        super(Id,Nama,Jabatan,Alamat,Tanggal_Lahir);
        this.HariKerja=HariKerja;
    }

    public String getJabatan(){
        return "Manager";
    }
    
    @Override
    public int TotalGaji() {
        return this.GajiHarianManager * HariKerja;
  }
    
}
