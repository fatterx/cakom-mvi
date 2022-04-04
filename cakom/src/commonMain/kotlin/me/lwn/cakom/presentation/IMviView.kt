package me.lwn.cakom.presentation

import kotlinx.coroutines.flow.Flow

/**
 * MVI中的View，负责渲染界面，响应用户的交互操作，通常为[android.app.Activity]/[androidx.fragment.Fragment]/[Component]
 * 把交互操作转化为Intent通知ViewModel
 *
 * Created by fatterx on 2022/4/04
 *
 */
interface IMviView<
        out Intent : IMviIntent, in State : IMviState,
        in Event : IMviSingleEvent> {

    /**
     * 绑定ViewModel
     */
    fun bindViewModel()

    /**
     * 根据[IMviState]绘制（刷新）界面
     *
     * 是[IMviViewModel] -> [IMviView] 唯一刷新页面入口
     *
     * @param state 界面的状态（包含页面渲染所需的domain model）
     */
    fun render(state: State)

    /**
     * 响应单次事件，如显示Tips、Dialog、SnackBar
     *
     */
    fun handleSingleEvent(event: Event)

    /**
     * 把[IMviView]上一些事件如点击、滚动转成[IMviIntent]通知[IMviViewModel]
     *
     * 是View -> ViewModel 唯一的Intent流
     */
    fun viewIntents(): Flow<Intent>
}