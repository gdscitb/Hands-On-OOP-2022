#include <iostream>
 
using namespace std;
 
class Monitor {
  public:
    string merk;
    double refreshrate;
    double ukuranLayar;
 
    string hidupkanMonitor() {
      return "Hidupkan Monitor";
    }
 
     string matikanMonitor() {
      return "Matikan Monitor";
    }
};
 
int main()
{
  Monitor monitorsaya;
 
  monitorsaya.merk = "Viewsonic";
  monitorsaya.refreshrate = 144;
  monitorsaya.ukuranLayar = 15.6;
 
  cout << monitorsaya.merk << endl;
  cout << monitorsaya.refreshrate << endl;
  cout << monitorsaya.ukuranLayar << endl;
 
  // tampilkan member function
  cout << monitorsaya.hidupkanMonitor() << endl;
  cout << monitorsaya.matikanMonitor() << endl;
  return 0;
}
