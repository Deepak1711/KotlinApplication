package com.example.deepak.kotlintrial.Presenter

import com.example.deepak.kotlintrial.Util.Constant

/**
 * Created by webonise on 13/7/17.
 */
class MainPresenter{
    var samples: MutableList<Triple<String, String, String>> = ArrayList()
    var question: MutableList<String> = ArrayList()

    init{
        initializeList()
    }

    private fun initializeList() {
        val constant = Constant()
        samples.add(Triple(constant.CODE_1,constant.OUTPUT_1,constant.DESCRIPTION_1))
        question.add(constant.QUESTION_1)
        samples.add(Triple(constant.CODE_2,constant.OUTPUT_2,constant.DESCRIPTION_2))
        question.add(constant.QUESTION_2)
    }
}