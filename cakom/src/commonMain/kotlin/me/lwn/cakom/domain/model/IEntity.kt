package me.lwn.cakom.domain.model

import java.io.Serializable

/**
 * Domain Model, 为UI层提供数据的实体，与UI组件一一对应
 *
 * 不可变对象，纯Kotlin data类，只提供数据，不应包含业务逻辑
 *
 * Created by fatterx on 2022/4/04
 *
 */
interface IEntity : Serializable