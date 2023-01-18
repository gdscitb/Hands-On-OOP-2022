#include "pesawat.h"
#include "pesawat.cpp"
#include <iostream>
using namespace std;

int main() {

    string airline;
    string cabin;
    string seat;
    
    int adults;
    int kids;
    int facility;
    bool valid1, valid2, valid3, valid4, valid5;

    cout << "Type your airline name: ";
    getline(cin, airline);
    valid1 = false;
    do
    {
        cout << "Type your cabin option" << endl;
        cout << "(Option: Economy Class/Business Class/First Class): ";
        getline(cin, cabin);
        if (cabin == "Economy Class" || cabin == "Business Class" || cabin == "First Class") {
            valid1 = true;
        } else {
            cout << "Masukan tidak valid. Coba lagi!" << endl;
        }
    } while (not valid1);
    cout << "Type your seat number: ";
    getline(cin, seat);
    valid2 = false;
    while (not valid2) {
        cout << "Type the amount of adults: ";
        cin >> adults;
        if (adults >= 0) {
            valid2 = true;
        } else {
            cout << "Masukan tidak valid. Coba lagi!" << endl;
        }
    }
    valid3 = false;
    while (not valid3) {
        cout << "Type the amount of kids: ";
        cin >> kids;
        if (kids >= 0) {
            valid3 = true;
        } else {
            cout << "Masukan tidak valid. Coba lagi!" << endl;
        }
    }

    if (cabin == "Economy Class") {
        cout << endl;
        Pesawat *plane = new Pesawat(airline, cabin, seat, adults, kids);
        plane->print_ticket();
        cout << endl;
        delete plane;
    } else if (cabin == "Business Class") {
        valid4 = false;
        while (not valid4) {
            cout << "Type the amount of facilities: ";
            cin >> facility;
            if (facility >= 0) {
                valid4 = true;
            } else {
                cout << "Masukan tidak valid. Coba lagi!" << endl;
            }
        } 
        cout << endl;
        Pesawat *plane = new BusinessClass(airline, seat, adults, kids, facility);
        plane->print_ticket();
        cout << endl;
        delete plane;
    } else if (cabin == "First Class") {
        valid5 = false;
        while (not valid5) {
            cout << "Type the amount of facilities: ";
            cin >> facility;
            if (facility >= 0) {
                valid5 = true;
            } else {
                cout << "Masukan tidak valid. Coba lagi!" << endl;
            }
        } 
        cout << endl;
        Pesawat *plane = new FirstClass(airline, seat, adults, kids, facility);
        plane->print_ticket();
        cout << endl;
        delete plane;
    }
    return 0;
}