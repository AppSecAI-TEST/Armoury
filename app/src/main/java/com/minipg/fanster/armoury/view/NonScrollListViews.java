package com.minipg.fanster.armoury.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by Knot on 8/7/2017.
 */

class NonScrollListViews extends ListView {

    public NonScrollListViews(Context context) {
        super(context);
    }

    public NonScrollListViews(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NonScrollListViews(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int heightMeasureSpec_custom = MeasureSpec.makeMeasureSpec(
                Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec_custom);
        ViewGroup.LayoutParams params = getLayoutParams();
        params.height = getMeasuredHeight();
    }
}

