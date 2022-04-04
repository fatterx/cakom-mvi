package me.lwn.cakom.android.presentation.drawer.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import me.lwn.cakom.android.presentation.drawer.DrawerIntent
import me.lwn.cakom.android.presentation.drawer.DrawerSingleEvent
import me.lwn.cakom.android.presentation.drawer.DrawerState
import me.lwn.cakom.presentation.IMviViewModel
import me.lwn.drawer.domain.usecase.DrawerUseCases

/**
 * Created by fatterx on 2022/4/4
 */
class DrawerScreenVM(
    private val useCases: DrawerUseCases,
    override val state: StateFlow<DrawerState>,
    override val singleEvent: SharedFlow<DrawerSingleEvent>
) : ViewModel(),
    IMviViewModel<DrawerIntent, DrawerState, DrawerSingleEvent> {

    override suspend fun handleIntent(intent: DrawerIntent) {
        when (intent) {
            DrawerIntent.GetBitmap -> useCases.getImageBitmapUseCase()
            is DrawerIntent.Share -> useCases.shareImageUseCase(intent.image)
        }
    }
}