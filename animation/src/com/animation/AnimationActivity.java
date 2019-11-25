package com.animation;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AnimationActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        BitmapDrawable frame1 = (BitmapDrawable)getResources().getDrawable(R.drawable.desert);
        BitmapDrawable frame2 = (BitmapDrawable)getResources().getDrawable(R.drawable.koala);
        BitmapDrawable frame3 = (BitmapDrawable)getResources().getDrawable(R.drawable.lighthouse);
        BitmapDrawable frame4 = (BitmapDrawable)getResources().getDrawable(R.drawable.penguins);
        
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final AnimationDrawable ani = new AnimationDrawable();
        final Button bStart = (Button) findViewById(R.id.button1);
        final Button bStop = (Button) findViewById(R.id.button2);
        ani.addFrame(frame1, 1000);
        ani.addFrame(frame2, 1000);
        ani.addFrame(frame3, 1000);
        ani.addFrame(frame4, 1000);
        ani.setOneShot(false);
        iv.setBackgroundDrawable(ani);
        bStart.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ani.start();
			}
		});
        bStop.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ani.stop();
			}
		});
        
    }
}