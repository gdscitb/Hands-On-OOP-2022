package MuhammadAlfarizaRasendria_UniversitasAirlangga;

public interface EmployeeInterface {
    public Manager createManager(String Id,String Nama,int Jabatan,String Alamat,String Tanggal_Lahir,int HariKerja);
        
    public Staff createStaff(String Id,String Nama,int Jabatan,String Alamat,String Tanggal_Lahir,int HariKerja);

}
