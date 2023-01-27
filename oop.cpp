#include <bits/stdc++.h>
#include <chrono>
#include <ctime>
using namespace std;

class jam
{
protected:
    int start_time;
    int end_time;

public:
    void setTime(int pukul, bool available)
    {
        if (available)
        {
            jam::start_time = pukul;
        }
        else
        {
            jam::end_time = pukul;
        }
    }
    int getstart()
    {
        return start_time;
    }
    int getEnd()
    {
        return end_time;
    }
};
class komputer : public jam
{
protected:
    bool adakomputer;
    int memory;
    int kualitas_processor;

public:
    void buatKomuter(int memori, int kualitas)
    {
        komputer::memory = memori;
        komputer::kualitas_processor = kualitas;
    }
};
class ruangankomputer : public komputer
{
private:
    bool tersedia = false;
    bool dipakai = false;

public:
    // Set ketersediaan komputer
    void setAvailable()
    {
        ruangankomputer::tersedia = !tersedia;
    }
    void setDIpakai()
    {
        if (!ruangankomputer::tersedia)
        {
            cout << "Ruangan belum memiliki komputer." << endl
                 << "Silakan cari ruangan lain." << endl;
        }
        else
            ruangankomputer::dipakai = !dipakai;
    }
    // cek tersedia
    bool getAvailable()
    {
        return tersedia;
    }
    bool getDipakai()
    {
        return dipakai;
    }
};

// inheritance

void showAll(int a, bool x, bool y)
{
    if (x && y == false)
    {
        cout << "Ruangan komputer ke-" << a << " tersedia." << endl;
    }
    else if (x && y)
    {
        cout << "Ruangan komputer ke-" << a << " dipakai." << endl;
    }
    else
    {
        cout << "Ruangan komputer ke-" << a << " tidak tersedia." << endl;
    }
}


int main()
{
    ruangankomputer comp[30];
    bool a;
    a = true;
    cout << "Selamat datang di warnet!" << endl;
    while (a)
    {
        cout << "1. Buat komputer" << endl;
        cout << "2. Check in" << endl;
        cout << "3. Check out" << endl;
        cout << "4. Check semua" << endl;
        cout << "0. Out" << endl;

        int opsi;
        cin >> opsi;
        if (opsi == 1)
        {
            int memory, kualitas, nomor_komputer;
            cout << "Nomor komputer: ";
            cin >> nomor_komputer;
            while (nomor_komputer < 1 || nomor_komputer > 30)
            {
                cout << "Masukkan no 1 sampai 30 saja." << endl;
                cout << "Nomor komputer: ";
                cin >> nomor_komputer;
            }
            nomor_komputer--;
            cout << "Masukkan memory: ";
            cin >> memory;
            cout << "Masukkan kualitas: ";
            cin >> kualitas;
            if (comp[nomor_komputer].getAvailable())
            {
                cout << "Komputer sudah ada." << endl;
            }
            else
            {
                comp[nomor_komputer].setAvailable();
                comp[nomor_komputer].buatKomuter(memory, kualitas);
            }
        }
        if (opsi == 2)
        {
            int nomor_komputer, jam;
            cout << "Nomor komputer: ";
            cin >> nomor_komputer;
            while (nomor_komputer < 1 || nomor_komputer > 30)
            {
                cout << "Masukkan no 1 sampai 30 saja." << endl;
                cout << "Nomor komputer: ";
                cin >> nomor_komputer;
            }

            nomor_komputer--;
            cout << "Jam check in (0 sampai 24): ";
            cin >> jam;

            while (jam < 0 || jam > 24)
            {
                cout << "Jam tidak valid." << endl;
                cout << "Jam check out (0 sampai 24): ";
                cin >> jam;
            }
            if (!comp[nomor_komputer].getDipakai())
            {
                comp[nomor_komputer].setDIpakai();
                comp[nomor_komputer].setTime(jam, comp[nomor_komputer].getDipakai());
            }
            else
            {
                cout << "Komputer sedang dipakai." << endl;
            }
        }
        if (opsi == 3)
        {
            int nomor_komputer, jam;
            cout << "Nomor komputer: ";
            cin >> nomor_komputer;
            while (nomor_komputer < 1 || nomor_komputer > 30)
            {
                cout << "Masukkan no 1 sampai 30 saja." << endl;
                cout << "Nomor komputer: ";
                cin >> nomor_komputer;
            }

            nomor_komputer--;
            cout << "Jam check out (0 sampai 24): ";
            cin >> jam;

            while (jam < 0 || jam > 24)
            {
                cout << "Jam tidak valid." << endl;
                cout << "Jam check out (0 sampai 24): ";
                cin >> jam;
            }
            if (comp[nomor_komputer].getDipakai())
            {
                comp[nomor_komputer].setDIpakai();
                comp[nomor_komputer].setTime(jam, comp[nomor_komputer].getDipakai());
            }
            else
            {
                cout << "Komputer tidak sedang digunakan." << endl;
            }
            int lama = (comp[nomor_komputer].getEnd() - comp[nomor_komputer].getstart());
            if (lama <= 0)
            {
                lama += 24;
            }
            cout << lama << " jam" << endl;
            cout << "Biaya 3000 perjam." << endl;
            cout << "Biaya yang harus dibayar sebesar: " << lama * 3000 << endl;
        }
        if (opsi == 4)
        {
            for (int i = 0; i < 30; i++)
            {
                showAll(i + 1, comp[i].getAvailable(), comp[i].getDipakai());
            }
        }
        if (opsi == 0)
            a = false;
    }
}