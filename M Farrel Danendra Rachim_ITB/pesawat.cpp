#include <iostream>
using namespace std;
#include "pesawat.h"

Pesawat::Pesawat(string airline_name, string cabin_option, string seat_number) {
    this->airline_name = airline_name;
    this->cabin_option = cabin_option;
    this->seat_number = seat_number;
}

Pesawat::Pesawat() {
    this->airline_name = "No Name"
    this->cabin_option = "None"
    this-> seat_number = "None"
}

void Pesawat::set_name(string airline_name) {
    this->airline_name = airline_name;
}

string Pesawat::get_name() const {
    return this->airline_name;
}