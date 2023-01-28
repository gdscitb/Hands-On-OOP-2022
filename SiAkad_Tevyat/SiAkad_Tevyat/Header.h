#ifndef Header_h
#define Header_h
#include <iostream>
using namespace std;
#include <string>

class ssw 
{
protected:
	int nim;
	float ips;
	string name[100];
	string email[100];
	string departemen[100];
public:
	int getsswnim(){return nim;}	void setsswnim(int i){nim = i;}
	float getsswips(){return ips;}	void setsswips(int i){ips = i;}
	string getsswname(){return name[100];}	void setsswname(string i){name[100] = i;}
	string getsswname(){return email[100];}	void setsswemail(string i){email[100] = i;}
	string getsswname(){return departemen[100];}	void setsswdepartemen(string i){departemen[100] = i;}

};

class dsn
{
protected:
	int nim;
	string name[21];
	string email[21];
	string departemen[21];
public:
	int getdsnnim() { return nim; }	void setdsnnim(int i) { nim = i; }
	string getdsnname() { return name[100]; }	void setdsnname(string i) { name[100] = i; }
	string getdsnname() { return email[100]; }	void setdsnemail(string i) { email[100] = i; }
	string getdsnname() { return name[100]; }	void setdsndepartemen(string i) { departemen[100] = i; }

};

void inp_siswa();
void data_siswa();
void inp_dosen();
void data_dosen();

#endif