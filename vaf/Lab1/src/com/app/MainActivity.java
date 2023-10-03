package com.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button btn = (Button) findViewById(R.id.button1);
		final EditText et1 = (EditText) findViewById(R.id.editText1);
		final EditText et2 = (EditText) findViewById(R.id.editText2);
		final TextView result = (TextView) findViewById(R.id.textView1);

		btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				int x = Integer.valueOf(et1.getText().toString());
				int y = Integer.valueOf(et2.getText().toString());
				int sum = x + y;
				result.setText("The Sum of " + x + " and " + y + " is " + sum);
			}
		});
	}

}
