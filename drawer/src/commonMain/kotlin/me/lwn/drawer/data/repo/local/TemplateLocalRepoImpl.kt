package me.lwn.drawer.data.repo.local

import me.lwn.drawer.data.model.Template
import me.lwn.drawer.domain.repo.ITemplateRepo

/**
 * Created by fatterx on 2022/4/4
 */
class TemplateLocalRepoImpl : ITemplateRepo {
    override suspend fun getTemplates(): List<Template> {
        TODO("Not yet implemented")
    }
}