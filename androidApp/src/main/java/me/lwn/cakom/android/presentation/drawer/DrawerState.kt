package me.lwn.cakom.android.presentation.drawer

import me.lwn.cakom.android.domain.model.XhubEntity
import me.lwn.cakom.presentation.IMviState

/**
 * Created by fatterx on 2022/4/4
 */
data class DrawerState(
    val entity: XhubEntity,
    val isSharing: Boolean
) : IMviState
