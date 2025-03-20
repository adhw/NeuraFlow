package app.neuraflow.android.navigation

import androidx.compose.material.icons.Icons
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import app.neuraflow.android.R
import kotlinx.serialization.Serializable

sealed interface Route {
    @Serializable
    data object Home : Route
    @Serializable
    data object AI : Route
    @Serializable
    data object Promotion : Route
    @Serializable
    data object AITools : Route
    @Serializable
    data object My : Route
}

data class ReplyTopLevelDestination(
    val route: Route,
    val selectedIcon: Int,
    val unselectedIcon: Int,
    val iconTextId: Int
)

class ReplyNavigationActions(private val navController: NavController) {
    fun navigateTo(destination: ReplyTopLevelDestination) {
        navController.navigate(destination.route) {
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
            launchSingleTop = true
            restoreState = true
        }

    }
}
val TOP_LEVEL_DESTINATIONS = listOf(
    ReplyTopLevelDestination(
        route = Route.Home,
        selectedIcon = R.drawable.slc_home,
        unselectedIcon = R.drawable.home,
        iconTextId = R.string.home
    ),
    ReplyTopLevelDestination(
        route = Route.AI,
        selectedIcon = R.drawable.ai,
        unselectedIcon = R.drawable.slc_ai,
        iconTextId = R.string.ai
    ),
    ReplyTopLevelDestination(
        route = Route.Promotion,
        selectedIcon = R.drawable.promotion,
        unselectedIcon = R.drawable.scl_promotion,
        iconTextId = R.string.promotion
    ),
    ReplyTopLevelDestination(
        route = Route.AITools,
        selectedIcon = R.drawable.ai_tools,
        unselectedIcon = R.drawable.slc_ai_tools,
        iconTextId = R.string.ai_tools
    ),
    ReplyTopLevelDestination(
        route = Route.My,
        selectedIcon = R.drawable.my,
        unselectedIcon = R.drawable.scl_my,
        iconTextId = R.string.my
    )

)