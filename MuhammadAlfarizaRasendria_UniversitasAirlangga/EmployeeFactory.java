package MuhammadAlfarizaRasendria_UniversitasAirlangga;

public class EmployeeFactory implements EmployeeInterface{

    @Override
    public Manager createManager(String Id,String Nama,int Jabatan,String Alamat,String Tanggal_Lahir,int HariKerja){
        return new Manager(Id,Nama,Jabatan,Alamat,Tanggal_Lahir,HariKerja);
    }

    @Override
    public Staff createStaff(String Id,String Nama,int Jabatan,String Alamat,String Tanggal_Lahir,int HariKerja){
        return new Staff(Id,Nama,Jabatan,Alamat,Tanggal_Lahir,HariKerja);
    }
}
