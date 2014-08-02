package com.example.otppmeetingrooms;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class FloorPlan extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_floor_plan);
		
		setTitle("Floor Plans");
		
		
		Button home = (Button) findViewById(R.id.home);
		home.setOnClickListener(new View.OnClickListener() {
		    public void onClick(View v) {
		    	Intent intent = new Intent(com.example.otppmeetingrooms.FloorPlan.this, com.example.otppmeetingrooms.MainActivity.class);
			    startActivity(intent);
		    }
		});
		
		Button button2 = (Button) findViewById(R.id.button2);
		button2.setOnClickListener(new View.OnClickListener() {
		    public void onClick(View v) {
		    	Intent intent = new Intent(com.example.otppmeetingrooms.FloorPlan.this, com.example.otppmeetingrooms.Second.class);
			    startActivity(intent);
		    }
		});
		
		Button button3 = (Button) findViewById(R.id.button3);
		button3.setOnClickListener(new View.OnClickListener() {
		    public void onClick(View v) {
		    	Intent intent = new Intent(com.example.otppmeetingrooms.FloorPlan.this, com.example.otppmeetingrooms.Third.class);
			    startActivity(intent);
		    }
		});
		
		Button button4 = (Button) findViewById(R.id.button4);
		button4.setOnClickListener(new View.OnClickListener() {
		    public void onClick(View v) {
		    	Intent intent = new Intent(com.example.otppmeetingrooms.FloorPlan.this, com.example.otppmeetingrooms.Fourth.class);
			    startActivity(intent);
		    }
		});
		
		Button button5 = (Button) findViewById(R.id.button5);
		button5.setOnClickListener(new View.OnClickListener() {
		    public void onClick(View v) {
		    	Intent intent = new Intent(com.example.otppmeetingrooms.FloorPlan.this, com.example.otppmeetingrooms.Fifth.class);
			    startActivity(intent);
		    }
		});
		Button button6 = (Button) findViewById(R.id.button6);
		button6.setOnClickListener(new View.OnClickListener() {
		    public void onClick(View v) {
		    	Intent intent = new Intent(com.example.otppmeetingrooms.FloorPlan.this, com.example.otppmeetingrooms.Sixth.class);
			    startActivity(intent);
		    }
		});
		Button button7 = (Button) findViewById(R.id.button7);
		button7.setOnClickListener(new View.OnClickListener() {
		    public void onClick(View v) {
		    	Intent intent = new Intent(com.example.otppmeetingrooms.FloorPlan.this, com.example.otppmeetingrooms.Seventh.class);
			    startActivity(intent);
		    }
		});
		Button button8 = (Button) findViewById(R.id.button8);
		button8.setOnClickListener(new View.OnClickListener() {
		    public void onClick(View v) {
		    	Intent intent = new Intent(com.example.otppmeetingrooms.FloorPlan.this, com.example.otppmeetingrooms.Eighth.class);
			    startActivity(intent);
		    }
		});
		Button button12 = (Button) findViewById(R.id.button12);
		button12.setOnClickListener(new View.OnClickListener() {
		    public void onClick(View v) {
		    	Intent intent = new Intent(com.example.otppmeetingrooms.FloorPlan.this, com.example.otppmeetingrooms.Twelfth.class);
			    startActivity(intent);
		    }
		});
		
		Button button15 = (Button) findViewById(R.id.button15);
		button15.setOnClickListener(new View.OnClickListener() {
		    public void onClick(View v) {
		    	Intent intent = new Intent(com.example.otppmeetingrooms.FloorPlan.this, com.example.otppmeetingrooms.Fifteenth.class);
			    startActivity(intent);
		    }
		});
		
		Button button16 = (Button) findViewById(R.id.button16);
		button16.setOnClickListener(new View.OnClickListener() {
		    public void onClick(View v) {
		    	Intent intent = new Intent(com.example.otppmeetingrooms.FloorPlan.this, com.example.otppmeetingrooms.Sixteenth.class);
			    startActivity(intent);
		    }
		});
		
		Button button18 = (Button) findViewById(R.id.button18);
		button18.setOnClickListener(new View.OnClickListener() {
		    public void onClick(View v) {
		    	Intent intent = new Intent(com.example.otppmeetingrooms.FloorPlan.this, com.example.otppmeetingrooms.Eighteenth.class);
			    startActivity(intent);
		    }
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.floor_plan, menu);
		return true;
	}

}
