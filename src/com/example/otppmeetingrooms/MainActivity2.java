package com.example.otppmeetingrooms;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.*;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;

public class MainActivity2 extends Activity {
	
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity2);
		
		
		Button button1 = (Button) findViewById(R.id.button1);
		button1.setOnClickListener(new View.OnClickListener() {
		    public void onClick(View v) {
		    	Intent intent = new Intent(com.example.otppmeetingrooms.MainActivity2.this, com.example.otppmeetingrooms.SettingsActivity.class);
			    startActivity(intent);
		    }
		});

		Button button2 = (Button) findViewById(R.id.button2);
		button2.setOnClickListener(new View.OnClickListener() {
		    public void onClick(View v) {
		    	Intent intent = new Intent(com.example.otppmeetingrooms.MainActivity2.this, com.example.otppmeetingrooms.FloorPlan.class);
			    startActivity(intent);
		    }
		});

		Button button3 = (Button) findViewById(R.id.button3);
		button3.setOnClickListener(new View.OnClickListener() {
		    public void onClick(View v) {
		    	Intent intent = new Intent(com.example.otppmeetingrooms.MainActivity2.this, com.example.otppmeetingrooms.BookRoom.class);
			    startActivity(intent);
		    }
		});
		
		Button button4 = (Button) findViewById(R.id.button4);
		button4.setOnClickListener(new View.OnClickListener() {
		    public void onClick(View v) {
		    	Intent intent = new Intent(com.example.otppmeetingrooms.MainActivity2.this, com.example.otppmeetingrooms.DirectoryListActivity.class);
			    startActivity(intent);
		    }
		});
		
		Button button5 = (Button) findViewById(R.id.button5);
		button5.setOnClickListener(new View.OnClickListener() {
		    public void onClick(View v) {
		    	Intent intent = new Intent(com.example.otppmeetingrooms.MainActivity2.this, com.example.otppmeetingrooms.MainActivity.class);
			    startActivity(intent);
		    }
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
