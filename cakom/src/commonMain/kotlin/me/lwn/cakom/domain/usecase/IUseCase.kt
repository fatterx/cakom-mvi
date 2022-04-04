package me.lwn.cakom.domain.usecase

/**
 * 承担业务逻辑，每个UseCase中应只包含一个单一的逻辑。
 *
 * 如读取磁盘缓存、拉取网络数据，或逻辑计算
 *
 * 此类（子类）应为纯Kotlin/Java Module，不应包含Android平台的类
 *
 * Created by fatterx on 2022/4/04
 *
 */
interface IUseCase {
    /**
     * 实现具体业务逻辑的方法，重载()操作符，方便调用
     * 返回值需为Flow
     */
//    operator fun invoke(param: T? = null): Flow
}