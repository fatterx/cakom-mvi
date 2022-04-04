package me.lwn.cakom.data.dto

import java.io.Serializable

/**
 * Data Transfer Object，与接入层/数据库交互的Model，与接口数据一一对应
 *
 * 不可变对象，纯Kotlin data类，只提供数据，不应包含业务逻辑
 *
 * Created by fatterx on 2022/4/04
 *
 */
interface IDto : Serializable