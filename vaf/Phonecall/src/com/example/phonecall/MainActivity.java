package com.example.phonecall;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {
	public Button btncall = null;
	public EditText phoneno = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		phoneno = (EditText) findViewById(R.id.phonecall);
		btncall = (Button) findViewById(R.id.btncall);
		btncall.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String no = phoneno.getText().toString();
				Intent callIntent = new Intent(Intent.ACTION_CALL);
				callIntent.setData(Uri.parse("tel:" + no));
				startActivity(callIntent);
			}
		});
	}

}
