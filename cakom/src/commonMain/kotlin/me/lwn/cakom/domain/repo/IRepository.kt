package me.lwn.cakom.domain.repo

/**
 * 数据仓库，数据流的最上游。
 *
 * 应包含拉取/读取数据的suspend方法，供UseCase调用
 *
 * Created by fatterx on 2022/4/04
 *
 */
interface IRepository