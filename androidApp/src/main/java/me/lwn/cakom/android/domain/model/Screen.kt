package me.lwn.cakom.android.domain.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Explore
import androidx.compose.material.icons.outlined.Image
import androidx.compose.material.icons.outlined.Person
import androidx.compose.ui.graphics.vector.ImageVector
import me.lwn.cakom.android.BizApplication
import me.lwn.cakom.android.R

/**
 * Created by fatterx on 2022/4/4
 */
sealed class Screen(val route: String, val name: String, val icon: ImageVector) {
    object Drawer : Screen("drawer", drawerString, Icons.Outlined.Image)
    object Discovery : Screen("discovery", discoverString, Icons.Outlined.Explore)
    object Profile : Screen("profile", profileString, Icons.Outlined.Person)
}

val drawerString = BizApplication.getInstance().getString(R.string.drawer)
val discoverString = BizApplication.getInstance().getString(R.string.discovery)
val profileString = BizApplication.getInstance().getString(R.string.profile)