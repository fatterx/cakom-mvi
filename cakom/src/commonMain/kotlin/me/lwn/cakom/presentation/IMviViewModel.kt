package me.lwn.cakom.presentation

import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow

/**
 * 1.维护[IMviView]的状态[IMviState]，解决旋转屏、后台恢复等场景状态丢失的问题
 * 2.响应[IMviView]的动作[IMviIntent]，转发给UseCase(s)
 * 3.拉取数据后通过Flow通知[IMviView]重绘
 *
 * 此类（子类）为平台相关类，会继承[androidx.lifecycle.ViewModel]
 *
 * --- Platform Specific ----|----------------------  Multiple Platform ----------------------
 *                           |
 *       IntentFlow          |  dispatch         reduce            delegate
 *      ---------->          | --------->      --------->         --------->      ---> remote
 * View            ViewModel |            Store           UseCase            Repo
 *      <----------          | <--------       <--------          <--------       ---> local
 *       StateFlow           |   update         suspend fun       suspend fun
 *       or                  |   state          or                or
 *       SharedFlow          |                  dataFlow          dataFlow
 *
 * Created by fatterx on 2022/4/04
 *
 */
interface IMviViewModel<Intent : IMviIntent, State : IMviState, Event : IMviSingleEvent> {
    /**
     * 描述View状态的流
     */
    val state: StateFlow<State>

    /**
     * ViewModel推给View的单次事件流(Single Event StateFlow)
     */
    val singleEvent: SharedFlow<Event>

    /**
     * 响应View的Intent
     */
    suspend fun handleIntent(intent: Intent)
}