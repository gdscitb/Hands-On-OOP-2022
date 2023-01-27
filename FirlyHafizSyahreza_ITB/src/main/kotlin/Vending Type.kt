abstract class ItemFactory() {
    abstract val jumlahBarang: Int
}

class FoodVending(): ItemFactory() {

    override val jumlahBarang: Int = 1

    fun makeFood(food: Food) {
        when (food) {
            is DoritosBr -> DoritosBr.setItem(15000, "Doritos Rasa Barbeque")
        }
    }

    fun buyFood(food: Food, uang: Int): Int {
        var Uang: Int
        println("1")
        println("...")
        println("2")
        println("...")
        println("Silahkan ambil ${food.getItemName()} di bagian bawah vending machine.")

        Uang = uang - food.getItemPrice()

        return Uang
    }

}

class DrinkVending(): ItemFactory() {

    override val jumlahBarang: Int = 1

    fun makeDrink(drink: Drink) {
        when(drink) {
            is Pocari -> Pocari.setItem(6500, "Pocari Sweat")
        }
    }

    fun buyDrink(drink: Drink, uang: Int): Int {
        var Uang: Int
        println("1")
        println("...")
        println("2")
        println("...")
        println("3")
        println("...")
        println("4")
        println("...")
        println("Silahkan ambil ${drink.getItemName()} di bagian bawah vending machine.")

        Uang = uang - drink.getItemPrice()

        return Uang
    }

}

class ProcessedFoodVending(): ItemFactory() {

    override val jumlahBarang: Int = 1

    fun makeProcessedFood(processedFood: ProcessedFood) {
        when (processedFood) {
            is Pizza -> Pizza.setItem(50000, "Pizza")
        }
    }

    fun buyProcessedFood(processedFood: ProcessedFood, uang: Int): Int {
        var Uang: Int
        println("1")
        println("...")
        println("2")
        println("...")
        println("3")
        println("...")
        println("4")
        println("...")
        println("5")
        println("...")
        println("6")
        println("...")
        println("7")
        println("...")
        println("8")
        println("...")
        println("Silahkan ambil ${processedFood.getItemName()} di bagian tengah vending machine.")

        Uang = uang - processedFood.getItemPrice()

        return Uang
    }

}

