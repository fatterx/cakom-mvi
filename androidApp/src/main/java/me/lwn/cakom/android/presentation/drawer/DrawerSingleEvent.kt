package me.lwn.cakom.android.presentation.drawer

import me.lwn.cakom.presentation.IMviSingleEvent

/**
 * Created by fatterx on 2022/4/4
 */
sealed class DrawerSingleEvent : IMviSingleEvent {
    object ShowShareDialog : DrawerSingleEvent()
}
