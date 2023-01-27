/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal1;

/**
 *
 * @author Praktikan
 */
public class Driver extends Member {

    private String platNo;
    private String jenisKendaraan;

    public Driver(String id, String nama, String telepon, String platNo, String jenisKendaraan, double saldo) {
        super(id, nama, telepon, saldo);
        this.platNo = platNo;
        this.jenisKendaraan = jenisKendaraan;
    }

    @Override
    public String toString() {
        return "Member{" + "id=" + super.getId() + ", nama=" + super.getNama() + ", saldo=" + super.getSaldo() + ", telepon=" + super.getTelepon() + "}\n"
                + "Driver{" + "platNo=" + platNo + ", jenisKendaraan=" + jenisKendaraan + '}';
    }
}
