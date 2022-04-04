package me.lwn.drawer.domain.usecase

import me.lwn.cakom.domain.usecase.IUseCase

/**
 * Created by fatterx on 2022/4/4
 */
class SaveImageUseCase : IUseCase {
    suspend operator fun invoke(image: ByteArray, path: String) {

    }
}