package me.lwn.drawer.domain.repo

import me.lwn.drawer.data.model.Template

/**
 * Created by fatterx on 2022/4/4
 */
interface ITemplateRepo {
    suspend fun getTemplates(): List<Template>
}