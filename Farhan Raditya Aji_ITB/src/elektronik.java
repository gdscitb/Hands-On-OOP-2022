// interface yang saya pilih adalah elektronik dengan fungsi untuk memakai elektronik tersebut

interface  elektronik {
    void memakai() ;
}

// elektronik yang saya pakai adalah TV sebagai object nya
// abstraksi yang saya gunakan ada boolean,string, dan integer

class TV {
    boolean nyala ;
    String siaran ;
    int saluran ;
    TV(Boolean TV_nyala,String TV_siaran,int TV_saluran) {
        nyala = TV_nyala ;
        siaran = TV_siaran ;
        saluran = TV_saluran ;
    }
    
    // disini saya membuat 3 method yaitu menyalakan tv , mengecek channel saat ini , dan mematikan tv
    
    public void TurnON(){
        nyala = true ;
        System.out.println("TV nyala? " + nyala);
    }
    
    public void info_channel(){
        System.out.println("Nama siaran: " + siaran );
        System.out.println("Saluran: " + saluran );
    }

    public void TurnOFF(){
        nyala = false ;
        System.out.println("TV nyala? " + nyala);
    
    }
}

// ini adalah contoh dari contoh hasil dari program diatas
// cara menjalankannya hanya dengan menginput ketiga variabelnya
class Main {

    public static void main(String[] args) {

    TV tivi = new TV(false ,"SCTV" , 7 );
    tivi.TurnON();
    tivi.info_channel();
    tivi.TurnOFF();
    }
}