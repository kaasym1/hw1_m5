package com.example.hw1_m5

import android.content.Context
import android.widget.Toast

class Presenter(private val context: Context) {

    private val model = CounterModel()
    private var view: CounterView? = null

    fun attachView(view: CounterView) {
        this.view = view
    }

    fun onDecrementBtnClicked() {
        model.dec()
        change()
    }


    fun onIncrementBtnClicked() {
        model.inc()
        change()
    }

    private fun change() {
        val result = model.getResult()
        view?.updateCount(result)
        if (result == 10) {
            Toast.makeText(context, "Поздравляем", Toast.LENGTH_SHORT).show()
        }
        if (result == 15) {
            view?.changeTextColor(android.graphics.Color.GREEN)
        } else {
            view?.changeTextColor(android.graphics.Color.BLACK)
        }
    }

    fun detachView() {
        this.view = null
    }
}