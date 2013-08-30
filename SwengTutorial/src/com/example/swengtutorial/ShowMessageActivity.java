package com.example.swengtutorial;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

/**
 * Shows a message coming from MainActivity
 * @author slv
 *
 */
public class ShowMessageActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_show_message);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.show_message, menu);
		return true;
	}

}
