package me.lwn.cakom.result

/**
 * 不可变对象，一次请求的结果
 * 把UI显示的状态转为数据描述，通过数据驱动UI的变化
 *
 * Created by fatterx on 2022/4/04
 *
 */
sealed class Result<DomainModel>(
    val data: DomainModel? = null,
    val error: Throwable? = null
) {
    /**
     * 返回Loading的数据，在ViewModel中转为LoadingState
     */
    object Loading : Result<Nothing>()

    /**
     * 返回Empty数据，在ViewModel中转为EmptyState
     */
    object Empty : Result<Nothing>()

    /**
     * 返回请求数据
     */
    class Success<DomainModel>(data: DomainModel?) : Result<DomainModel>(data)

    /**
     * 返回请求错误
     */
    class Error(error: Throwable) : Result<Nothing>(error = error)
}