package com.prgguru.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class GreetingActivity extends Activity {
	TextView greetMsg;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.greeting);
		greetMsg = (TextView) findViewById(R.id.textView1);
		Intent intename = getIntent();
		String uname = (String) intename.getSerializableExtra("USERNAME");
		greetMsg.setText("Welcome " + uname);
	}

}
