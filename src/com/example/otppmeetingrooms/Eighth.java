package com.example.otppmeetingrooms;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Eighth extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_eighth);
		
		Button button = (Button) findViewById(R.id.eighth);
		button.setOnClickListener(new View.OnClickListener() {
		    public void onClick(View v) {
		    	Intent intent = new Intent(com.example.otppmeetingrooms.Eighth.this, com.example.otppmeetingrooms.FloorPlan.class);
			    startActivity(intent);
		    }
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.eighth, menu);
		return true;
	}

}
