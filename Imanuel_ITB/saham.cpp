#include <iostream>
#include <vector>
#include <map>
#include <iomanip>

using namespace std;
//Akun utama 
class Account {
public:
    double saldo;
    Account() {
        saldo = 0;
    }
    void deposit(double amount) {
        saldo += amount;
    }
    void withdraw(double amount) {
        if (amount > saldo) {
 
            cout << "Saldo anda tidak cukup" << endl;
        } else {
            saldo -= amount;
        }
    }
    double getsaldo() {
        return saldo;
    }
};


//akun Investasi yang dapat menampilkan portofolio investasi
class Investasi : public Account {
protected:
    // Map simpan data dengan format <nama saham, {harga,quantity}>
    map<string, pair<int, int>> items;
public:
    void init(){
    //Saham untuk porto
    items =   {
    {"BBCA", {8000,0}},
     {"BBRI", {4800,0}},
     {"BBNI", {9000,0}},
     {"BMRI", {8500,0}},
     {"HMSP", {1000,0}},
     {"BYAN", {9000,0}},
     {"UNVR", {4900,0}}
        };
    }
void printList() {
        cout << "----------------------- List Saham: -----------------------" << endl;
        cout << setw(6) << "No." << setw(21) << "Saham" << setw(17) << "Harga" << endl;
        int i =1;
        for (auto item : items) {
            cout << setw(5) << i++ << setw(20) << item.first << setw(15) << "Rp " << item.second.first<< endl;
        }
        cout  << "-----------------------            -----------------------" << endl;
    }
void updateBuy(string saham, int lot, Account &account){
    if (items.count(saham)>0 and lot*items[saham].first <= account.saldo){
        items[saham].second += lot;
        account.saldo -= lot*items[saham].first;
        cout<<"Pembelian "<<lot<<" saham "<< saham<< " berhasil."<<endl;
    }else if (items.count(saham)>0 and lot*items[saham].first > account.saldo){
        cout<<"Saldo Anda Tidak mencukupi "<<endl;}
        
    else{
        cout<<"Nama saham yang anda masukkan salah. "<<endl;
    }
    }

void updateSell(string saham, int lot, Account&account){
    if (items.count(saham)>0 and items[saham].second -lot>= 0){
        items[saham].second -= lot;
        account.saldo += lot*items[saham].first;
        cout<<"Penjualan "<<lot<<" saham "<< saham<< " berhasil."<<endl;
    } 
    else 
    {
        cout<<"Cek kembali saham ataupun lot yang anda masukkan"<<endl;
    
    }
}
void printPorto(){
    cout << setw(6) << "No." << setw(21) << "Saham" << setw(17) << "Harga" << setw(15) << "Lot" << endl;
    int i=1;
    int total=0;
    for (auto item : items) {
        if(item.second.second > 0)
        {
            cout << setw(5) << i++ << setw(21) << item.first << setw(15) << "Rp " << item.second.first << setw(13) << item.second.second << endl;
            total+=item.second.first*item.second.second;
        }
    }
    cout << "Total:"<<setw(16)<<" Rp "<< total<<endl;
}
    }
;

int main() {
    int choice;
    Account account;
    double amount;
    Investasi porto;
    porto.init();
    string namasaham;
    int jumlahlot;
    cout<<"---------------- SELAMAT DATANG DI BANK INDONESIA ----------------"<<endl;
    cout<<"-------- SILAHKAN MASUKKAN PILIHAN YANG ANDA INGIN LAKUKAN --------"<<endl;
    while (1) {
        cout << "1. Deposit" << endl;
        cout << "2. Withdraw" << endl;
        cout << "3. Check saldo" << endl;
        cout << "4. Beli Saham" << endl;
        cout<<  "5. Jual Saham"<<endl;
        cout<< "6. Cek portofolio" << endl;
        cout<< "7. Keluar Program"<< endl;
        cout <<"Masukkan Pilihan Anda ";cin >>choice;
        switch(choice) {
            case 1:
                cout<<"Berapa uang yang ingin anda deposit?: ";cin >>amount;
                account.deposit(amount);
                cout << "Deposit berhasil. Saldo anda: Rp " << account.getsaldo() << endl;
            
            break;
            case 2:
                cout << "Berapa uang yang ingin anda withdraw?: "; cin >>amount;
                account.withdraw(amount);
                if (amount <= account.getsaldo()){
                    cout <<fixed<<"Withdrawal berhasil. Saldo anda: Rp " << account.getsaldo() << endl;}
                break;
            case 3:
                cout << "Saldo anda: Rp " << account.getsaldo() << endl;
                break;
            case 4:
                porto.printList();
                cout << "Saham apa yang ingin anda beli? "; cin >>namasaham;
                cout << "Berapa lot saham yang ingin anda beli? "; cin >>jumlahlot;
                porto.updateBuy(namasaham,jumlahlot,account);
                break;
            case 5:
                cout << "Portofolio anda" << endl;
                porto.printPorto();
                cout << "Saham apa yang ingin anda jual? "; cin >>namasaham;
                cout << "Berapa lot saham yang ingin anda jual? "; cin >>jumlahlot;
                porto.updateSell(namasaham,jumlahlot,account);
                break;
            case 6:
                cout << "Posisi portofolio anda" << endl;
                porto.printPorto();
                break;
            case 7:
                cout << "Terimakasih telah menggunakan layanan kami, samapai jumpa di lain kesempatan." << endl;
                return 0;
            default:
                cout << "Pilihan salah, silahkan coba lagi" << endl;
                break;
        }
    }
    return 0;
};
