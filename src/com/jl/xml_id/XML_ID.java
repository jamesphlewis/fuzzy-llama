package com.jl.xml_id;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class XML_ID extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_xml__id);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.xml__id, menu);
		return true;
	}
    public void onSubmitClick(View v)
    {
    	EditText nameField = (EditText) findViewById(R.id.nameField);
    	EditText passwordField = (EditText) findViewById(R.id.passwordField);
    	String toastText = "name " + nameField.getText().toString() + " password " + passwordField.getText().toString();
		Toast.makeText(this, toastText, Toast.LENGTH_LONG).show();
    }
    
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
