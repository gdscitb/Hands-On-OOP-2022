#include <iostream>
#include <string>
#include <fstream>
#include "Header.h"

using namespace std;



void data_dosen()
{
	// Creation of fstream class object
	fstream fio;
	string line;

	

	fio.open("dosen.dat", ios::trunc | ios::out | ios::in);

	printf("\n\n Nama\t\t\tNIM\t\tEmail\t\t\t\tDepartemen\t\\\\\n");
	
	

	// Execute a loop If file successfully Opened
	while (fio) 
	{
	
		printf("%s\t\t%d\t\t%s\t\t%s\t\t\n");

		// Read a Line from standard input
		getline(cin, line);


		fio << line << endl;
	}

	// Execute a loop until EOF (End of File)
	// point read pointer at beginning of file
	fio.seekg(0, ios::beg);

	while (fio) {

		// Read a Line from File
		getline(fio, line);

		// Print line in Console
		cout << line << endl;
	}

	// Close the file
	fio.close();

}
