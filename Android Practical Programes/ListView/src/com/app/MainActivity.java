package com.app;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		String[] values = new String[] { "Android List View",
				"Adapter implementation", "Simple List View In Android",
				"Create List View Android", "Android Example",
				"List View Source Code", "List View Array Adapter",
				"Android Example List View" };

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, android.R.id.text1, values);
		setListAdapter(adapter);
	}

}
