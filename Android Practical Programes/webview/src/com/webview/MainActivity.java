package com.webview;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;

public class MainActivity extends Activity {
	private EditText field;
	private WebView browser;
	String Url;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		field = (EditText) findViewById(R.id.urlField);
		browser = (WebView) findViewById(R.id.webView1);

	}

	@SuppressLint("SetJavaScriptEnabled")
	public void open(View view) {
		Url = "http://" + field.getText().toString();
		browser.getSettings().setJavaScriptEnabled(true);
		browser.loadUrl(Url);

	}

}
