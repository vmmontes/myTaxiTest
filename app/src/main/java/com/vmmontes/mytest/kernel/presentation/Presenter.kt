package com.vmmontes.mytest.kernel.presentation

abstract class Presenter<T> {
    protected var view: T? = null

    open fun onAttach(view: T) {
        this.view = view
    }

    open fun onDetach() {
        view = null
    }
}