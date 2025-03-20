package app.neuraflow.android.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import app.neuraflow.android.ui.screens.AIScreen
import app.neuraflow.android.ui.screens.AIToolsScreen
import app.neuraflow.android.ui.screens.HomeScreen
import app.neuraflow.android.ui.screens.MyScreen
import app.neuraflow.android.ui.screens.PromotionScreen

@Composable
fun NavGraph(navController: NavHostController) {

    NavHost(navController = navController, startDestination = Screens.Home.route) {
        composable(Screens.Home.route) { HomeScreen() }
        composable(Screens.AIAssistant.route) { AIScreen() }
        composable(Screens.Promotion.route) { PromotionScreen() }
        composable(Screens.AITools.route) { AIToolsScreen() }
        composable(Screens.My.route) { MyScreen() }
    }
}
