package MuhammadAlfarizaRasendria_UniversitasAirlangga;

public abstract class Person {
    private String Nama; 
    private String Alamat;
    private String Tanggal_Lahir;
    


    public Person(String Nama,String Alamat,String Tanggal_Lahir){
        this.Nama=Nama;
        this.Alamat=Alamat;
        this.Tanggal_Lahir=Tanggal_Lahir;
    }

    /* Method Setter untuk memudahkan dalam pengisian data member*/
    
    public void Set_Nama(String Nama){
        this.Nama = Nama;
    }
    public void Set_Alamat(String Alamat){ 
        this.Alamat = Alamat;
    }

    public void Set_Tanggal_Lahir(String Tanggal_Lahir){
        this.Tanggal_Lahir = Tanggal_Lahir;
    }
 

    
    /* Method Getter untuk memudahkan dalam menampilkan data member*/
    public String Get_Nama(){
        return this.Nama;
    }
    public String Get_Alamat(){
        return this.Alamat;
    }

    public String Get_Tanggal_Lahir(){
        return this.Tanggal_Lahir;
    }
}
