#ifndef PESAWAT_H
#define PESAWAT_H

#include <iostream>
using namespace std;
#include <string>

// Abstract class
// Menghitung tiket pesawat
class Pesawat {
    protected:
        string airline_name;
        string cabin_option;
        string seat_number;
        int adults;
        int kids;

    public:
        Pesawat(string airline_name, string cabin_option, string seat_number, int adults, int kids);
        Pesawat();

        void set_name(string airline_name);
        string get_name() const;

        void set_cabin(string cabin_option);
        string get_cabin() const;

        void set_seat(string seat_number);
        string get_seat() const;

        void set_adults(int adults);
        int get_adults() const;

        void set_kids(int kids);
        int get_kids() const;

        int ticket_cost() const;

        // Runtime polymorphism dengan keyword virtual
        virtual void print_ticket();
};



// Inheritance 1
// Menghitung tiket pesawat business class
class BusinessClass: public Pesawat {
    private:
        int extra_facility;
    public:

        BusinessClass(string airline_name, string seat_number, int adults, int kids, int extra_facility);
        BusinessClass();

        void set_extra_facility(int extra_facility);
        int get_extra_facility();
        int calculate_extra_facility();
        void print_ticket();

};



// Inheritance 2
// Menghitung tiket pesawat first class
class FirstClass: public Pesawat {
    private:
        int super_extra_facility;
    public:

        FirstClass(string airline_name, string seat_number, int adults, int kids, int super_extra_facility);
        FirstClass();

        void set_super_extra_facility(int super_extra_facility);
        int get_super_extra_facility();
        int calculate_super_extra_facility();
        void print_ticket();

};


#endif