#include <iostream>

#include "DatabaseManager.h"
// #include "Classroom.h"

static DatabaseManager dbManager; // singleton object

int main(){
    vector<string> nama = {"Phillips", "Kooe", "Kokk", "Henry", "Jekoo", "Loiii", "Q", "Blythe", "Clover", "Jack", "Azalea", "Kendall", "Lois", "Mei", "feng", "Knight", "Dwight", "van Hoiste", "Presley", "Prescott", "Koi", "Haru", "Kanade", "Mafuyu", "Emu", "Mizuki", "Ena", "Shinonome", "Pratama", "Kean", "Meaz", "Sei", "Waverly", "Cloud", "Pedro", "Salamance", "Hector", "Walter", "White", "Jesse", "Pinkman", "Kosss", "Koenisegg", "K", "honda", "Totoya", "aoya", "Meaaa", "Ayana", "Loo", "Crane", "Wordle"};

    cout << "Data yang diambil langsung dari data.json" << endl;
    dbManager.LoadData();
    dbManager.displayDatabase();

    // membersihkan data sebelum memberikan populasi baru
    dbManager.ClearData();

    cout << "Memberikan populasi random pada data dan menyimpannya dalam data.json" << endl;
    for (int _i = 0; _i < 3; _i++){

        // randomisasi teacher
        Teacher teach(nama[randint(0, nama.size()-1)] + " " + nama[randint(0, nama.size()-1)]);
        Classroom clz(teach);

        // randomisasi pelajar
        for(int _j = 0; _j < 2; _j++){
            clz.addStudent(new ArtStudent(nama[randint(0, nama.size()-1)] + " " + nama[randint(0, nama.size()-1)], randint(60, 99), randint(60, 99), randint(60, 99), randint(60, 99))); 
            clz.addStudent(new MedicalStudent(nama[randint(0, nama.size()-1)] + " " + nama[randint(0, nama.size()-1)], randint(60, 99), randint(60, 99), randint(60, 99), randint(60, 99))); 
            clz.addStudent(new LiteratureStudent(nama[randint(0, nama.size()-1)] + " " + nama[randint(0, nama.size()-1)], randint(60, 99), randint(60, 99), randint(60, 99), randint(60, 99)));
        }

        dbManager.addClassroom(clz);
    }

    dbManager.StoreData();
    dbManager.displayDatabase();
}