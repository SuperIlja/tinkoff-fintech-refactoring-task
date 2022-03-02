package ru.tinkoff.fintech.refactoring

interface IngredientList {
    fun getIngredient(): List<Pair<String, Int>>
}

abstract class Pizza(val name: String) : IngredientList {
    companion object {
        private val pizzaName = listOf(Carbonara(), Marinara(), Sardinia(), Valtellina(), Peasant())
        fun getPizza (name: String): Pizza? {
            return pizzaName.find { it.name == name }
        }
    }
}

class Carbonara : Pizza("карбонара") {
    override fun getIngredient() = listOf("яйца" to 1, "бекон" to 2, "тесто" to 1, "сыр" to 2)
}

class Marinara : Pizza("маринара") {
    override fun getIngredient() = listOf("томат" to 2, "оливки" to 3, "тесто" to 1)
}

class Sardinia : Pizza("сардиния") {
    override fun getIngredient() = listOf("салями" to 3, "оливки" to 1, "тесто" to 1, "сыр" to 3)
}

class Valtellina : Pizza("вальтеллина") {
    override fun getIngredient() = listOf("вяленая говядина" to 1, "зелень" to 1, "тесто" to 1, "пармезан" to 2)
}

class Peasant : Pizza("крестьянская") {
    override fun getIngredient() =
        listOf("грибы" to 3, "томат" to 1, "тесто" to 1, "спаржа" to 1, "мясное ассорти" to 1)
}