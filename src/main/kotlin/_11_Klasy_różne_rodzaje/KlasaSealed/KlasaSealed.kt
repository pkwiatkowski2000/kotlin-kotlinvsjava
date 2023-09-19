package _11_Klasy_różne_rodzaje.KlasaSealed

fun main() {

}

fun handleUserResponse(userResult: UserResult) {
    when (userResult) {
        is UserResult.Success -> userResult.save()
        is UserResult.Failure -> userResult.showError()
    }
}