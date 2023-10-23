package com.example.sendsms;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.telephony.SmsManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	public Button btnsms;
	public EditText phoneno, message;
	SmsManager smsManager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		phoneno = (EditText) findViewById(R.id.EditText2);
		message = (EditText) findViewById(R.id.EditText1);
		btnsms = (Button) findViewById(R.id.button1);
		smsManager = SmsManager.getDefault();
		btnsms.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				smsManager.sendTextMessage(phoneno.getText().toString(), null,
						message.getText().toString(), null, null);
				Toast.makeText(getApplicationContext(), "Send Sms",
						Toast.LENGTH_LONG).show();

			}
		});
	}

}
