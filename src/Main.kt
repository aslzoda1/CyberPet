import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    print("🐾 Uy hayvoningizga ism qo'ying: ")
    val petName = scanner.nextLine()
    val myPet = CyberPet(petName)

    println("\nTabriklaymiz! Endi sizda $petName bor. Unga g'amxo'rlik qiling!")

    while (true) {
        myPet.status()
        println("\nNima qilamiz?")
        println("1. Ovqatlantirish | 2. O'ynash | 3. Uxlatish | 0. Chiqish")
        print("Tanlov: ")

        when (scanner.next()) {
            "1" -> myPet.feed()
            "2" -> myPet.play()
            "3" -> myPet.sleep()
            "0" -> {
                println("Xayr! $petName sizni sog'inadi! 👋")
                return
            }
            else -> println("⚠️ Noto'g'ri buyruq!")
        }

         myPet.hunger = (myPet.hunger + 5).coerceAtMost(100)
        myPet.happiness = (myPet.happiness - 5).coerceAtLeast(0)

        if (myPet.hunger >= 100) {
            println("\n💀 Afsuski, $petName ochlikdan vafot etdi... O'yin tugadi.")
            break
        }
    }
}