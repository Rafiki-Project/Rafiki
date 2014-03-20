package com.iti.eg.rafikilauncher;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Toast;

public class RafikiMainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rafiki_main);
		Toast.makeText(getApplicationContext(), "Hello", Toast.LENGTH_SHORT)
				.show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.rafiki_main, menu);
		return true;
	}

}
