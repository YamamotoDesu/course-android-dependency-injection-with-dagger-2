package com.techyourchance.dagger2course.screens.common

import android.app.Activity
import android.content.Context
import com.techyourchance.dagger2course.screens.questiondetails.QuestionDetailsActivity

class ScreenNavigator(private val activity: Activity) {

    fun navigatorBack() {
        activity.onBackPressed()
    }

    fun toQuestionDetails(questionId: String) {
        QuestionDetailsActivity.start(activity, questionId)
    }
}