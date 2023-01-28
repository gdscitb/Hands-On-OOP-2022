#include <iostream>
#include <cstdio>
#include <string>
#include "Header.h"
#include <fstream>
using namespace std;

void menu()
{
    printf("\t\t\t\t\t Menu\n");
    printf("\t\t\t|1.Input Mahasiswa\n");
    printf("\t\t\t|2.List Mahasiswa\n");
    printf("\t\t\t|3.Input Dosen\n");
    printf("\t\t\t|4.List Dosen\t\t\t\n");
    printf("\t\t\t|10.Exit\n\n");


    printf("Tolong Masukkan angka sesuai Menu:\n");
}

int main()
{
    ofstream fout;
    string line;
    int pilihmenu;
    menu();

    scanf("%d", &pilihmenu);

	while (pilihmenu != 10)
	{
		if (pilihmenu == 1)
		{
			inp_siswa();
		}
		else if (pilihmenu == 2)
		{
			data_siswa();
		}
		else if (pilihmenu == 3)
		{
			inp_dosen();
		}
		else if (pilihmenu == 4)
		{
			data_dosen();
		}
		else
		{
			printf("Pilihan anda tidak ada di Menu, tolong masukkan pilihan anda lagi: ");
		}

		menu();

		printf("Masukkan Pilihan anda:\n");

		scanf("%d", &pilihmenu);



	}
	return 0;
    return 0;
}