abstract class Item(_price: Int = 0, _name: String = "") {

    var price: Int
    var name: String

    init {
        this.price = _price
        this.name = _name
    }


    fun getItemName(): String {
        return this.name
    }

    fun getItemPrice(): Int {
        return this.price
    }

}

open class Drink(_price: Int = 0, _name: String = ""): Item(_price, _name) {

    fun setItem(_price: Int, _name: String) {
        this.price = _price
        this.name = _name
    }

}

open class Food(_price: Int = 0, _name: String = ""): Item(_price, _name) {

    fun setItem(_price: Int, _name: String) {
        this.price = _price
        this.name = _name
    }

}

open class ProcessedFood(_price: Int = 0, _name: String = ""): Item(_price, _name) {

    fun setItem(_price: Int, _name: String) {
        this.price = _price
        this.name = _name
    }

}

object DoritosBr: Food()
object Pocari: Drink()
object Pizza: ProcessedFood()




