package edu.continental.cafeapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Contactos extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contactos);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.contactos, menu);
		return true;
	}

}
