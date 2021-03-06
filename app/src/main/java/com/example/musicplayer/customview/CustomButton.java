package com.example.musicplayer.customview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class CustomButton extends android.support.v7.widget.AppCompatButton {
    public CustomButton(Context context) {
        super(context);
    }

    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void setTypeface(Typeface tf, int style) {
        super.setTypeface(tf,style);

        Typeface face = Typeface.createFromAsset(getContext().getAssets(),"fonts/BebasNeue.otf");
        setTypeface(face);
    }

    @Override
    public void setTextColor(int color) {
        super.setTextColor(color);

        setTextColor(Color.WHITE);
    }
}
