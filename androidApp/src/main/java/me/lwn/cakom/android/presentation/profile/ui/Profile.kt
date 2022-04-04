package me.lwn.cakom.android.presentation.profile.ui

import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

/**
 * Created by fatterx on 2022/4/4
 */
@Composable
fun Profile(navController: NavHostController) {
    Surface {
        Text(text = "Profile")
    }
}