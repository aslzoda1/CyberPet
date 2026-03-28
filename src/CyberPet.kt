class CyberPet(val name: String) {
    var hunger = 50
    var happiness = 50
    var energy = 100

    fun status() {
        println("\n--- 📊 $name ning holati ---")
        println("🍗 Qorin ochligi: $hunger/100")
        println("😊 Baxtiyorlik:  $happiness/100")
        println("⚡ Energiya:     $energy/100")

        when {
            hunger > 80 -> println("⚠️ $name juda och! Uni ovqatlantiring!")
            energy < 20 -> println("⚠️ $name juda charchadi, uxlashi kerak!")
        }
    }

    fun feed() {
        hunger = (hunger - 30).coerceAtLeast(0)
        energy = (energy - 10).coerceAtLeast(0)
        println("🍴 Siz $name ni ovqatlantirdingiz. Mazza qildi!")
    }

    fun play() {
        if (energy > 20) {
            happiness = (happiness + 30).coerceAtMost(100)
            hunger = (hunger + 20).coerceAtMost(100)
            energy = (energy - 30).coerceAtLeast(0)
            println("🎾 Siz $name bilan o'ynadingiz. U juda xursand!")
        } else {
            println("😴 $name o'ynashga juda charchagan...")
        }
    }

    fun sleep() {
        energy = 100
        hunger = (hunger + 40).coerceAtMost(100)
        println("💤 $name uxladi va quvvatga toldi.")
    }
}