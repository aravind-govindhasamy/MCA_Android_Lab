package com.example.font;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TextView tx = (TextView) findViewById(R.id.hello);
		Typeface custom_font = Typeface.createFromAsset(getAssets(),
				"Chiller.ttf");
		tx.setTypeface(custom_font);
	}
	
}