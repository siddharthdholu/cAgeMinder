package com.smd.cageminder.core

sealed interface UiEvent {
    data class Navigate(val route: String) : UiEvent
    data class Error(val message: String) : UiEvent
}