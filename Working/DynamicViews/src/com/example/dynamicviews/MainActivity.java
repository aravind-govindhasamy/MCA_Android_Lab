package com.example.dynamicviews;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity  {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
}
	public void clickMe(View v) {
		LinearLayout hiddenLayout = (LinearLayout) findViewById(R.id.hiddenLayout);
		if (hiddenLayout == null) {
			LinearLayout myLayout = (LinearLayout) findViewById(R.id.linearLayout2);
			View hiddenInfo = getLayoutInflater().inflate(R.layout.hidden,
					myLayout, false);
			myLayout.addView(hiddenInfo);
		}
		TextView myTextView = (TextView) findViewById(R.id.textView1);
		myTextView
				.setText("This is not the original Text defined in the XML layout !");
	}
}