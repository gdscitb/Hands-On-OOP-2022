import kotlin.system.exitProcess
val inputToggle = Input()
val outputToggle = Output()
val FoodVendingToggle = FoodVending()
val DrinkVendingToggle = DrinkVending()
val ProcessedFoodVendingToggle = ProcessedFoodVending()
var jumlahBarangVending: Int = 0
var barangTerpilih: Int = 0
var isBelilagi: String = ""
val listbarangFoodVending = listOf(DoritosBr)
val listbarangDrinkVending = listOf(Pocari)
val listbarangProcessedFoodVending = listOf(Pizza)
fun main(args: Array<String>) {

    var uang: Int = inputToggle.validasiMasukinUang()
    println("")
    var pilihanVending: String = inputToggle.validasiMasukinPilihan()

    while (true) {
        if (pilihanVending == "Makanan".uppercase()) {
            outputToggle.foodVendingDisplay()
            break
        } else if (pilihanVending == "Minuman".uppercase()) {
            outputToggle.drinkVendingDisplay()
            break
        } else if (pilihanVending == "Makanan Terolah".uppercase()) {
            outputToggle.processedFoodVendingDisplay()
            break
        }
        pilihanVending = inputToggle.validasiMasukinPilihan()
    }

    when (pilihanVending) {
        "MAKANAN" -> jumlahBarangVending = FoodVendingToggle.jumlahBarang
        "MINUMAN" -> jumlahBarangVending = DrinkVendingToggle.jumlahBarang
        "MAKANAN TEROLAH" -> jumlahBarangVending = ProcessedFoodVendingToggle.jumlahBarang
    }

    var pilihanBarang: Int = inputToggle.validasiPilihBarang(jumlahBarangVending)

    while (true) {
        while (pilihanBarang > jumlahBarangVending || pilihanBarang <= 0) {
            pilihanBarang = inputToggle.validasiPilihBarang(jumlahBarangVending)
        }

        when (pilihanVending) {
            "MAKANAN" -> {
                var barangTerbeli: Food = listbarangFoodVending[pilihanBarang-1]
                FoodVendingToggle.makeFood(barangTerbeli)
                uang = FoodVendingToggle.buyFood(barangTerbeli, uang)
            }
            "MINUMAN" -> {
                var barangTerbeli: Drink = listbarangDrinkVending[pilihanBarang-1]
                DrinkVendingToggle.makeDrink(barangTerbeli)
                uang = DrinkVendingToggle.buyDrink(barangTerbeli, uang)
            }
            "MAKANAN TEROLAH" -> {
                var barangTerbeli: ProcessedFood = listbarangProcessedFoodVending[pilihanBarang-1]
                ProcessedFoodVendingToggle.makeProcessedFood(barangTerbeli)
                uang = ProcessedFoodVendingToggle.buyProcessedFood(barangTerbeli, uang)
            }
        }

        barangTerpilih++

        if (barangTerpilih < jumlahBarangVending) {
            isBelilagi = inputToggle.validasiBeliLagi()
            while (true) {
                if (isBelilagi == "Y") {
                    break
                } else if (isBelilagi == "N") {
                    println("Terima kasih telah membeli!")
                    exitProcess(0)
                }
                isBelilagi = inputToggle.validasiBeliLagi()
            }
        } else if (barangTerpilih == jumlahBarangVending) {
            break
        }

        pilihanBarang = inputToggle.validasiPilihBarang(jumlahBarangVending)
    }
    println("Terima kasih telah membeli!")
}