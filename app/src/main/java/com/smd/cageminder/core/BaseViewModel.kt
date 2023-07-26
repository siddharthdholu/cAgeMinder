package com.smd.cageminder.core

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch

abstract class BaseViewModel<State, ScreenEvent> : ViewModel() {

    protected val _state = MutableStateFlow(this.defaultState())
    val state = _state.asStateFlow()

    private val _uiEventChannel = Channel<UiEvent>()
    val uiEvent = _uiEventChannel.receiveAsFlow()

    protected abstract fun defaultState(): State

    abstract fun onEvent(event: ScreenEvent)

    protected fun sendEvent(event: UiEvent) {
        viewModelScope.launch {
            _uiEventChannel.send(event)
        }
    }
}