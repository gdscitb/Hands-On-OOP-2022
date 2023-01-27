import java.util.InputMismatchException
import java.util.Scanner

abstract class ClientInteraction()

class Output(): ClientInteraction() {
    fun foodVendingDisplay() {
        println("=".repeat(25))
        println("1")
        println("|Doritos Rasa Barbeque|")
        println("Rp15000")
    }

    fun drinkVendingDisplay() {
        println("=".repeat(25))
        println("1")
        println("|Pocari Sweat|")
        println("Rp6500")
    }

    fun processedFoodVendingDisplay() {
        println("=".repeat(25))
        println("1")
        println("|Pizza|")
        println("Rp50000")
    }

}

class Input(): ClientInteraction() {
    fun validasiMasukinUang(): Int {
        var reader = Scanner(System.`in`)
        var Uang: Int = 0
        try {
            print("Masukkan uang Anda: ")
            Uang = reader.nextInt()
            if (Uang > 100000) {
                throw InvalidNumber("Sepertinya Rupiah belum ada pecahan yang lebih besar dari 100000...")
            } else if (Uang < 0) {
                throw InvalidNumber("Uang yang anda masukkan bernilai... negatif?")
            } else if (Uang < 6500) {
                throw InsufficientMoney("Uang anda tidak ada yang mencukupi...")
            }
        } catch (e: InputMismatchException) {
            println("Tolong masukkan UANG Anda, bukan benda lain.")
            println("Silahkan masukkan kembali uang Anda (mulai ulang program).")
        } catch (e: InvalidNumber) {
            println(e.message)
            println("Silahkan masukkan kembali uang Anda (mulai ulang program).")
        } catch (e: InsufficientMoney) {
            println(e.message)
            println("Ambil kembali uang Anda.")
            println("Silahkan masukkan kembali uang Anda (mulai ulang program)")
        }
        return Uang
    }

    fun validasiMasukinPilihan(): String {
        var pilihan: String = ""
        try {
            println("Pilih satu dari tiga Vending Machine di bawah ini:")
            println("(Makanan) ----- (Minuman) ----- (Makanan Terolah) (Contoh: Pizza)")
            print("Apa pilihan Anda? (Ketik pilihan yang berada dalam tanda kurung) ")
            pilihan = readLine()!!.uppercase()
            println("")
            if (pilihan == "Makanan".uppercase() || pilihan == "Minuman".uppercase() || pilihan == "Makanan Terolah".uppercase()) {
                println("Anda memilih $pilihan")
            } else if (pilihan != "Makanan".uppercase()) {
                throw InvalidOption("Pilihan tidak tersedia.")
            } else if (pilihan != "Minuman".uppercase()) {
                throw InvalidOption("Pilihan tidak tersedia.")
            } else if (pilihan != "Makanan Terolah".uppercase()) {
                throw InvalidOption("Pilihan tidak tersedia.")
            }
            println("")
        } catch (e: InputMismatchException) {
            println("Tolong masukan PILIHAN Anda.")
            println("")
        } catch (e: InvalidOption) {
            println(e.message)
            println("Tolong masukan PILIHAN yang tersedia.")
            println("")
        }
        return pilihan
    }

    fun validasiPilihBarang(jumlahBarangVending: Int): Int {
        var reader = Scanner(System.`in`)
        var pilihanBarang: Int = 0
        try {
            print("Masukkan pilihan Anda: (Ketik nomor di atas barang) ")
            pilihanBarang = reader.nextInt()
            if (pilihanBarang > jumlahBarangVending) {
                throw InvalidOption("Vending belum diperbaharui...")
            } else if (pilihanBarang <= 0) {
                throw InvalidNumber("Pilihan tidak tersedia...")
            }
        } catch (e: InputMismatchException) {
            println("Tolong masukkan PILIHAN Anda.")

        } catch (e: InvalidNumber) {
            println(e.message)

        } catch (e: InvalidOption) {
            println(e.message)
        }
        return pilihanBarang
    }

    fun validasiBeliLagi(): String {
        var isBelilagi: String = ""
        try {
            print("Apakah Anda ingin membeli lagi? (Y/N) ")
            isBelilagi = readLine()!!.uppercase()
            if (isBelilagi != "Y" || isBelilagi != "N") {
                throw InvalidOption("Tolong masukkan pilihan Anda kembali.")
            }
        } catch (e: InputMismatchException) {
            println("Kesalahan dalam Input...")
        } catch (e: InvalidOption) {
            println(e.message)
        }

        return isBelilagi
    }

}