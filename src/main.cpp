#include <iostream>

#include "DatabaseManager.h"

#include "Classroom.h"

static DatabaseManager dbManager; // singleton object

int main(){

    // ArtStudent messi(1, "messi", 21, 13, 99, 12);
    // LiteratureStudent leon(2, "leon bead", 75, 78, 23, 89);
    

    // Teacher teach(32, "fredric");

    // Classroom clz(31, teach);

    // clz.addStudent(&messi);
    // clz.addStudent(&leon);

    // // cout << clz.asJSON().dump() <<endl;



    // clz.displayClassroom();

    // dbManager.addClassroom(clz);

    // dbManager.StoreData();
    dbManager.LoadData();
    dbManager.displayDatabase();

    
}