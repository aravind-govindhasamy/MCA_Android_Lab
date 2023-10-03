package com.passingvalues;

import com.example.passingvalues.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	private String userName, password;

	private EditText edtUsername, edtPassword;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		

	}

	public void onClick(View v) {
		edtUsername = (EditText) findViewById(R.id.Edt_lgn_emailid);
		edtPassword = (EditText) findViewById(R.id.edt_lgn_passwprd);
		userName = edtUsername.getText().toString();
		password = edtPassword.getText().toString();
		int color = edtUsername.getCurrentTextColor();
		Bundle b = new Bundle();
		b.putString("Name", userName);
		b.putString("Psw", password);
		b.putInt("Color", color);

		Intent t = new Intent(this, NextActivity.class);
		t.putExtras(b);
		startActivity(t);
	}

}
