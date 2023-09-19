package _11_Klasy_różne_rodzaje.KlasaSealed

sealed class UserResult {
    class Success(val user: User) : UserResult() {
        fun save() {
            // ...
        }
    }

    class Failure(val message: String) : UserResult() {
        fun showError() {
            println("Wystapil blad podczas pobierania danych: $message")
        }
    }
}

class User {

}