package app.neuraflow.android.ui.navigation

sealed class Screens(val route: String) {
    object Home : Screens("home")
    object AIAssistant : Screens("ai_assistant")
    object Promotion : Screens("promotion")
    object AITools : Screens("ai_tools")
    object My : Screens("my")
}