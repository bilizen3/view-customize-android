package com.flores.view_customize_android

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout

class EditTextPassword(context: Context, attrs: AttributeSet?) : FrameLayout(context, attrs) {
    init {
        val inflater=context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.edit_text_customize, this, true)
    }


}