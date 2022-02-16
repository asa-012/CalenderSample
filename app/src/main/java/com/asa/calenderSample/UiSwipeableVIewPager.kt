package com.asa.calenderSample

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import androidx.viewpager.widget.ViewPager

/**
 * スワイプ操作によるページ切り替えを抑止するViewPager
 */
class UnSwipeableViewPager : ViewPager {
    constructor(context: Context?) : super(context!!)
    constructor(context: Context?, attrs: AttributeSet?) : super(context!!, attrs)

    override fun onInterceptTouchEvent(arg0: MotionEvent): Boolean {
        // Never allow swiping to switch between pages
        return false
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        // Never allow swiping to switch between pages
        return false
    }

    override fun setCurrentItem(item: Int) {
        // スライドインするアニメーションを無効化する
        super.setCurrentItem(item, false)
    }
}