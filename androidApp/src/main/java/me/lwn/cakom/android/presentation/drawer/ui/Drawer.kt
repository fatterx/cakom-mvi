package me.lwn.cakom.android.presentation.drawer.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import me.lwn.cakom.android.domain.model.XhubEntity
import me.lwn.cakom.android.domain.template.XhubRectangle

/**
 * Created by fatterx on 2022/4/4
 */
@Composable
fun Drawer(navController: NavHostController) {

    Surface(modifier = Modifier.padding(20.dp)) {
        XhubRectangle(entity = XhubEntity())
    }
}