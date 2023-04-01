package com.osama3meera.sliderbutton;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class SliderButton extends RelativeLayout {

    public SliderButton(Context context) {
        super(context);
        inflate(context, R.layout.slider_button_layout, this);
    }

    public SeekBar getSeekBar() {
        return findViewById(R.id.slider_bar);
    }

    public void setLabelText(String text) {
        TextView label = findViewById(R.id.slider_label);
        label.setText(text);
    }

    public void setProgressColor(int color) {
        SeekBar bar = findViewById(R.id.slider_bar);
        bar.getProgressDrawable().setColorFilter(color, PorterDuff.Mode.SRC_IN);
        bar.getThumb().setColorFilter(color, PorterDuff.Mode.SRC_IN);
    }
}
