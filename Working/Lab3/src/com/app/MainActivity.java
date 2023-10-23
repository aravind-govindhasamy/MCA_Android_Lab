package com.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

	private LinearLayout layout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		layout = (LinearLayout) findViewById(R.id.lay_scroll);
		for (int i = 0; i < 50; i++) {
			TextView txView = new TextView(this);
			txView.setText("view Id:" + i);
			layout.addView(txView);
		}
	}
}
