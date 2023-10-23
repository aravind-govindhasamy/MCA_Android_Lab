package com.androidexample.notification;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	private static final int NOTIFY_ME_ID = 1337;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.notification_alert);
	}

	@SuppressWarnings("deprecation")
	public void clickMe(View v) {
		final NotificationManager mgr = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
		Notification note = new Notification(R.drawable.stat_notify_chat,
				"Android Example Status message!", System.currentTimeMillis());
		PendingIntent i = PendingIntent.getActivity(getBaseContext(), 0,
				new Intent(getBaseContext(), MainActivity.class), 0);

		note.setLatestEventInfo(getBaseContext(),
				"Android Example Notification Title",
				"This is the android example notification message", i);
		mgr.notify(NOTIFY_ME_ID, note);
	}
}
