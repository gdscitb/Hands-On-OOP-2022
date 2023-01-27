package MuhammadAlfarizaRasendria_UniversitasAirlangga;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  int menu, ListOption, RemoveChoice, Jabatan, HariKerja;
  String Nama, Id, Alamat, Tanggal_Lahir;

  ArrayList<Manager> ListManager = new ArrayList<Manager>();
  ArrayList<Staff> ListStaff = new ArrayList<Staff>();

  Scanner input = new Scanner(System.in);

  public Main() {
    do {
      System.out.println(
        "Selamat Datang pada sistem Pendataan Perusahaan, Silahkan pilih salah satu dari opsi berikut:"
      );
      System.out.println("1. Add Karyawan");
      System.out.println("2. Remove Karyawan");
      System.out.println("3. View List Karyawan");
      System.out.println("4. Exit");

      System.out.println("=================");
      menu = input.nextInt();
      input.nextLine();
      if (menu == 1) {
        do {
          System.out.println(
            "Pilih Tipe Karyawan dengan menginputkan angka sesuai keterangan:"
          );
          System.out.println("1. Manager");
          System.out.println("2. Staff");
          Jabatan = input.nextInt();
          input.nextLine();
        } while (Jabatan != 1 && Jabatan != 2);

        if (Jabatan == 1) {
          do {
            System.out.print("Masukkan Id Manager (3 digit) : ");
            Id = input.nextLine();
          } while (Id.length() < 3 || Id.length() > 15);

          do {
            System.out.print("Masukkan Nama Manager (nama lengkap) : ");
            Nama = input.nextLine();
          } while (Nama.length() < 2 || Nama.length() > 75);

          do {
            System.out.print("Masukkan Alamat dari Manager : ");
            Alamat = input.nextLine();
          } while (Alamat.length() < 5 || Alamat.length() > 100);

          do {
            System.out.print("Masukkan Tanggal Lahir dari Manager (Format : Tanggal Bulan Tahun) : ");
            Tanggal_Lahir = input.nextLine();
          } while (Tanggal_Lahir.length() < 6 || Tanggal_Lahir.length() > 30);

          do {
            System.out.print("Masukkan Total Hari Kerja Dalam Satu Bulan untuk Manager (Harap memasukkan angka dibawah 31) : ");
            HariKerja = input.nextInt();
            input.nextLine();
          } while (HariKerja > 31);


          EmployeeFactory NewManagerObject = new EmployeeFactory();
          Manager ManagerObject = NewManagerObject.createManager(Id,Nama,Jabatan,Alamat,Tanggal_Lahir,HariKerja);
          ListManager.add(ManagerObject);
          System.out.println("Data Manager Berhasil Dimasukkan");

        } else if (Jabatan == 2) {
          do {
            System.out.print("Masukkan Id Staff (3 digit) : ");
            Id = input.nextLine();
          } while (Id.length() < 3 || Id.length() > 15);

          do {
            System.out.print("Masukkan Nama Staff (nama lengkap) : ");
            Nama = input.nextLine();
          } while (Nama.length() < 2 || Nama.length() > 75);

          do {
            System.out.print("Masukkan Alamat dari Staff : ");
            Alamat = input.nextLine();
          } while (Alamat.length() < 5 || Alamat.length() > 100);

          do {
            System.out.print("Masukkan Tanggal Lahir dari Staff (Format : Tanggal Bulan Tahun) :");
            Tanggal_Lahir = input.nextLine();
          } while (Tanggal_Lahir.length() < 6 || Tanggal_Lahir.length() > 30);

          do {
            System.out.print("Masukkan Total Hari Kerja Dalam Satu Bulan untuk Staff (Harap memasukkan angka dibawah 31) : ");
            HariKerja = input.nextInt();
            input.nextLine();
          } while (HariKerja>31);

          EmployeeFactory NewStaffObject = new EmployeeFactory();
          Staff StaffObject = NewStaffObject.createStaff(Id,Nama,Jabatan,Alamat,Tanggal_Lahir,HariKerja);
          ListStaff.add(StaffObject);
          System.out.println("Data Staff Berhasil Dimasukkan");
        }
      } else if (menu == 2) {
        System.out.println(
          "Pilih Opsi Berikut untuk menghapus List dari karyawan: "
        );
        System.out.println("1. Manager");
        System.out.println("2. Staff");
        RemoveChoice = input.nextInt();
        input.nextLine();
        if (RemoveChoice == 1) {
          System.out.println("Manager List : ");
          DisplayManager();

          int index = 0, Counter = 0;
          System.out.println("insert Id to remove");
          Id = input.nextLine();
          for (Manager Manager : ListManager) {
            if (Manager.Get_Id().equals(Id)) {
              Counter = 1;
              ListManager.remove(index);
              break;
            }
            index++;
          }
          if (Counter == 0) {
            System.out.println("Manager not found!");
            System.out.println("Press to continue");
            input.nextLine();
          }
        }
        
        else if(RemoveChoice==2){
          System.out.println("Staff List : ");
          DisplayStaff();

          int index = 0, Counter = 0;
          System.out.println("insert Id to remove");
          Id = input.nextLine();
          for (Staff Staff : ListStaff) {
            if (Staff.Get_Id().equals(Id)) {
              Counter = 1;
              ListStaff.remove(index);
              break;
            }
            index++;
          }
          if (Counter == 0) {
            System.out.println("Staff not found!");
            System.out.println("Press to continue");
            input.nextLine();
          }

        }

      } else if (menu == 3) {
        System.out.println(
          "Pilih Opsi Berikut untuk melihat List dari karyawan: "
        );
        System.out.println("1. Manager");
        System.out.println("2. Staff");
        ListOption = input.nextInt();
        input.nextLine();
        if (ListOption == 1) {
          if (ListManager.size() == 0) {
            System.out.println("No Manager");
            System.out.println("Press enter to continue");
            input.nextLine();
          } else {
            System.out.println("Manager List : ");
            DisplayManager();
          }
        } else if (ListOption == 2) {
          if (ListStaff.size() == 0) {
            System.out.println("No Staff");
            System.out.println("Press enter to continue");
            input.nextLine();
          } else {
            System.out.println("Staff List : ");
            DisplayStaff();
          }
        }
      }
    } while (menu != 4);
  }

  public void DisplayManager() {
    for (Manager Manager : ListManager) {
      System.out.println(
        Manager.Get_Id() +
        " " +
        Manager.Get_Nama() +
        " " +
        Manager.getJabatan() +
        " " +
        Manager.Get_Alamat() +
        " " +
        Manager.Get_Tanggal_Lahir() +
        " " +
        Manager.TotalGaji()
      );
    }
  }

  public void DisplayStaff() {
    for (Staff Staff : ListStaff) {
      System.out.println(
        Staff.Get_Id() +
        " " +
        Staff.Get_Nama() +
        " " +
        Staff.getJabatan() +
        " " +
        Staff.Get_Alamat() +
        " " +
        Staff.Get_Tanggal_Lahir() +
        " " +
        Staff.TotalGaji()
      );
    }
  }

  public static void main(String[] args) throws Exception {
    Main Object = new Main();
  }
}
