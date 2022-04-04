package me.lwn.cakom.android.presentation.drawer

import me.lwn.cakom.presentation.IMviIntent

/**
 * Created by fatterx on 2022/4/4
 */
sealed class DrawerIntent : IMviIntent {
    class Share(val title: String, val image: String) : DrawerIntent()
    object GetBitmap : DrawerIntent()
}