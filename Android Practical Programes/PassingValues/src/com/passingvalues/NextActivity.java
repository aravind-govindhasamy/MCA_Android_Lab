package com.passingvalues;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.passingvalues.R;

public class NextActivity extends Activity {
	private String userName, password;
	private TextView txtUsername, txtPassword;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_next);

		Bundle b = getIntent().getExtras();
		userName = b.getString("Name");
		password = b.getString("Psw");

		int color = b.getInt("Color");

		setvalues();

	}

	private void setvalues() {
		txtUsername = (TextView) findViewById(R.id.txtUsername);
		txtPassword = (TextView) findViewById(R.id.txtpassword);
		txtUsername.setText(userName);
		txtPassword.setText(password);
	}

	public void GoBack(View v) {

		startActivity(new Intent(this, MainActivity.class));
	}

}
