#include <iostream>

#include "DatabaseManager.h"

#include "Classroom.h"

static DatabaseManager dbManager; // singleton object

int main(){

    ArtStudent messi(1, "messi");
    LiteratureStudent leon(2, "leon bead");
    

    Teacher teach(32, "fredrc");

    Classroom clz(31, teach);

    clz.addStudent(&messi);
    clz.addStudent(&leon);

    cout << clz.asJSON().dump();

    clz.displayClassRoom();
    
}