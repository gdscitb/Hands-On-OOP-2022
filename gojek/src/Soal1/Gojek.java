/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal1;

import java.util.ArrayList;

/**
 *
 * @author Praktikan
 */
public class Gojek {

    private static ArrayList<Member> mlist = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Gojek Indonesia");
        runThis();
    }

    public static void addDriver(String id, String nama, String telepon, String platNo, String jenisKendaraan, double saldo) {
        mlist.add(new Driver(id, nama, telepon, platNo, jenisKendaraan, saldo));

    }

    public static void addCustomer(String id, String nama, String telepon, double saldo) {
        mlist.add(new Customer(id, nama, telepon, saldo));

    }

    public int cekId(String id) {
        for (Member m : mlist) {
            if (id.equals(m.getId())) {
                System.out.println(id);
            }
        }
        return 0;
    }

    public static void topUpSaldo(String id, double saldo) {
        System.out.println("");
        System.out.println("Data lama : ");
        for (Member m : mlist) {
            if (id.equals(m.getId())) {
                if (m instanceof Driver) {
                    if (m != null) {
                        m.setSaldo(m.getSaldo());
                        System.out.println(m);
                    }

                } else if (m instanceof Customer) {
                    if (m != null) {
                        m.setSaldo(m.getSaldo());
                        System.out.println(m);
                    }
                }
            }
        }

        System.out.println("Data Akhir : ");
        for (Member m : mlist) {
            if (id.equals(m.getId())) {
                if (m instanceof Driver) {
                    if (m != null) {
                        m.setSaldo(m.getSaldo() + saldo);
                        System.out.println(m);
                    }

                } else if (m instanceof Customer) {
                    if (m != null) {
                        m.setSaldo(m.getSaldo() + saldo);
                        System.out.println(m);
                    }
                }
            } else {
                System.out.println("Data tidak ditemukan!");
            }
        }

    }

    public static void viewCustomer(String id) {
        for (Member c : mlist) {
            if (id.equals(c.getId())) {
                if (c instanceof Customer) {
                    System.out.println(c);
                }
            }
        }
    }

    public static void viewDriver(String id) {
//        System.out.println("Driver");
        for (Member d : mlist) {
            if (id.equals(d.getId())) {
                if (d instanceof Driver) {
                    System.out.println(d);
                }
            }
        }
    }

    public static void transaksi(String idDriver, String idCustomer, double tarif) {
        System.out.println("Besaran Transaksi : " + tarif);
        System.out.println("Data Lama : ");
        for (Member m : mlist) {
            if (m instanceof Driver) {
                if (idDriver.equals(m.getId())) {
                    System.out.println(m);
                }
            } else if (m instanceof Customer) {
                if (idCustomer.equals(m.getId())) {
                    System.out.println(m);
                }
            }
        }
        System.out.println("Data Baru : ");
        for (Member m : mlist) {
            if (m instanceof Driver) {
                if (idDriver.equals(m.getId())) {
                    m.setSaldo(m.getSaldo() - tarif);
                    System.out.println(m);
                }
            } else if (m instanceof Customer) {
                if (idCustomer.equals(m.getId())) {
                    m.setSaldo(m.getSaldo() - tarif);
                    System.out.println(m);
                }
            }
        }
    }

    public static void runThis() {
        System.out.println("-----------------Tambah Driver----------------------------");
        addDriver("1", "Becky", "0811", "D 1 A", "Motor", 100000);
        addDriver("2", "Adrian", "0812", "B 15 A", "Motor", 50000);
        addDriver("3", "Begra", "0813", "J 45A LHO", "Motor", 0);
        for (Member m : mlist) {
            if (m instanceof Driver) {
                System.out.println(m);
            }
        }
        System.out.println(" ");
        System.out.println("----------------Tambah Customer-----------------------------");
        addCustomer("4", "Eva", "0814", 100000);
        addCustomer("5", "Celia", "0815", 0);
        addCustomer("6", "Latjuba", "0816", 200000);
        addCustomer("7", "Lesmana", "0817", 0);
        for (Member m : mlist) {
            if (m instanceof Customer) {
                System.out.println(m);
            }
        }
        System.out.println(" ");

        System.out.println("----------------TopUp Saldo-----------------------------------");
        topUpSaldo("1", 150000);
        topUpSaldo("3", 50000);
        topUpSaldo("4", 250000);
        topUpSaldo("5", 450000);
        topUpSaldo("6", 150000);
        topUpSaldo("9", 150000);

        System.out.println("------------View Driver----------------");
        viewDriver("1");
        viewDriver("3");
        viewDriver("4");
        System.out.println(" ");
        System.out.println("------------View Customer----------------");
        viewCustomer("1");
        viewCustomer("4");
        viewCustomer("5");
        viewCustomer("8");
        System.out.println(" ");

        System.out.println("------------ Transaksi ----------------");
        transaksi("1", "4", 50000);
        System.out.println("--------------------------------------");
        transaksi("3", "5", 50000);
        System.out.println("--------------------------------------");

        transaksi("4", "5", 50000);
        System.out.println("--------------------------------------");

        transaksi("1", "2", 50000);
        System.out.println("--------------------------------------");

    }
}
