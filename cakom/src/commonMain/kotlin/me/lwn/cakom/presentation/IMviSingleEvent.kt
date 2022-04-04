package me.lwn.cakom.presentation

/**
 * 不可变对象，[IMviView]响应[IMviViewModel]派发的单次事件
 * 如Toast、Dialog、Snack等
 *
 * Created by fatterx on 2022/4/04
 *
 */
interface IMviSingleEvent

object EmptySingleEvent : IMviSingleEvent