#include <iostream>
using namespace std;
#include "pesawat.h"

Pesawat::Pesawat(string airline_name, string cabin_option, string seat_number, int adults, int kids) {
    this->airline_name = airline_name;
    this->cabin_option = cabin_option;
    this->seat_number = seat_number;
    this->adults = adults;
    this->kids = kids;
}

Pesawat::Pesawat() {
    this->airline_name = "No Name";
    this->cabin_option = "None";
    this->seat_number = "None";
    this->adults = 0;
    this->kids = 0;
}

void Pesawat::set_name(string airline_name) {
    this->airline_name = airline_name;
}

string Pesawat::get_name() const {
    return this->airline_name;
}

void Pesawat::set_cabin(string cabin_option) {
    this->cabin_option = cabin_option;
}

string Pesawat::get_cabin() const {
    return this->cabin_option;
}

void Pesawat::set_seat(string seat_number) {
    this->seat_number = seat_number;
}

string Pesawat::get_seat() const {
    return this->seat_number;
}

void Pesawat::set_adults(int adults) {
    this->adults = adults;
}

int Pesawat::get_adults() const {
    return this->adults;
}

void Pesawat::set_kids(int kids) {
    this->kids = kids;
}

int Pesawat::get_kids() const {
    return this->kids;
}

// Asumsi harga dalam Euro
int Pesawat::ticket_cost() const {
    int sum = 0;
    if (this->cabin_option == "Economy Class") {
        sum = this->get_adults() * 350 + this->get_kids() * 300;
    } else if (this->cabin_option == "Business Class") {
        sum = this->get_adults() * 1400 + this->get_kids() * 1300;
    } else if (this->cabin_option == "First Class") {
        sum = this->get_adults() * 2500 + this->get_kids() * 2400;
    }
    return sum;
}

void Pesawat::print_ticket() {
    cout << "Here's your ticket!" << endl;  
    cout << "Nama pesawat: " << this->airline_name << endl;
    cout << "Pilihan kabin: " << this->cabin_option << endl;
    cout << "Nomor kursi: " << this->seat_number << endl;
    cout << "Jumlah dewasa: " << this->adults << endl;
    cout << "Jumlah anak-anak: " << this->kids << endl;
    cout << "Total: " << this->ticket_cost() << endl;
    cout << "Have a nice flight!" << endl;
}

BusinessClass::BusinessClass(string airline_name, string seat_number, int adults, int kids, int extra_facility) : Pesawat(airline_name, "Business Class", seat_number, adults, kids) {
    this->extra_facility = extra_facility;
}

BusinessClass::BusinessClass() : Pesawat() {
    this->extra_facility = 0;
}

void BusinessClass::set_extra_facility(int extra_facility) {
    this->extra_facility = extra_facility;
}

int BusinessClass::get_extra_facility() {
    return this->extra_facility;
}

int BusinessClass::calculate_extra_facility() {
    return ticket_cost() + this->extra_facility * 100;
}

void BusinessClass::print_ticket() {
    cout << "Here's your ticket!" << endl;
    cout << "Nama pesawat: " << this->airline_name << endl;
    cout << "Pilihan kabin: " << this->cabin_option << endl;
    cout << "Nomor kursi: " << this->seat_number << endl;
    cout << "Jumlah dewasa: " << this->adults << endl;
    cout << "Jumlah anak-anak: " << this->kids << endl;
    cout << "Total: " << this->calculate_extra_facility() << endl;
    cout << "Have a nice flight!" << endl;
}

FirstClass::FirstClass(string airline_name, string seat_number, int adults, int kids, int super_extra_facility) : Pesawat(airline_name, "First Class", seat_number, adults, kids) {
    this->super_extra_facility = super_extra_facility;
}

FirstClass::FirstClass() : Pesawat() {
    this->super_extra_facility = 0;
}

void FirstClass::set_super_extra_facility(int super_extra_facility) {
    this->super_extra_facility = super_extra_facility;
}

int FirstClass::get_super_extra_facility() {
    return this->super_extra_facility;
}

int FirstClass::calculate_super_extra_facility() {
    return ticket_cost() + this->super_extra_facility * 100;
}

void FirstClass::print_ticket() {
    cout << "Here's your ticket!" << endl;
    cout << "Nama pesawat: " << this->airline_name << endl;
    cout << "Pilihan kabin: " << this->cabin_option << endl;
    cout << "Nomor kursi: " << this->seat_number << endl;
    cout << "Jumlah dewasa: " << this->adults << endl;
    cout << "Jumlah anak-anak: " << this->kids << endl;
    cout << "Total: " << this->calculate_super_extra_facility() << endl;
    cout << "Have a nice flight!" << endl;
}

