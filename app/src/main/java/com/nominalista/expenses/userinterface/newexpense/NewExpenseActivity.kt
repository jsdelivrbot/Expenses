package com.nominalista.expenses.userinterface.newexpense

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.nominalista.expenses.R
import com.nominalista.expenses.userinterface.common.BaseActivity

class NewExpenseActivity : BaseActivity() {

    companion object {
        fun start(context: Context) {
            val intent = Intent(context, NewExpenseActivity::class.java)
            context.startActivity(intent)
        }
    }

    override var animationKind = ANIMATION_SLIDE_FROM_BOTTOM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_expense)
        setSupportActionBar(findViewById(R.id.toolbar))
    }
}