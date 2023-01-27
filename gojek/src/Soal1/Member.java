/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal1;

/**
 *
 * @author Praktikan
 */
 class Member {
    private  String id, nama, telepon;
    private  double saldo;

    public Member(String id, String nama, String telepon, double saldo) {
        this.id = id;
        this.nama = nama;
        this.telepon = telepon;
        this.saldo = saldo;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Member{" + "id=" + id + ", nama=" + nama + ", telepon=" + telepon + ", saldo=" + saldo + '}';
    }
    
    
}
