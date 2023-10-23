package com.androidexample.splashscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainSplashScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_splash_screen);
		Thread background = new Thread() {
			public void run() {
				try {
					sleep(5 * 1000);
					Intent i = new Intent(getBaseContext(), FirstScreen.class);
					startActivity(i);
					finish();
				} catch (Exception e) {
				}
			}
		};
		background.start();
	}
}
