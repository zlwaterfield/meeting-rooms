package com.example.otppmeetingrooms;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnMenuItemClickListener;
import android.widget.TextView;


public class BookRoom extends Activity implements OnClickListener, OnMenuItemClickListener {

	private PopupMenu popupMenu;
    private final static int BOARDROOM = 1;
    private final static int ROOM1 = 2;
    private final static int ROOM2 = 3;
	private static final int ROOM3 = 4;
	private static final int ROOM4 = 5;
	private final static int RECCESS = 6;
    private final static int PLAYGROUND = 7;
    private final static int CLAUDE_LAMOUREUX = 8;
	private static final int BARON = 9;
	private static final int CORTLAND = 10;
	private final static int  EMPIRE= 11;
    private final static int  MACINTOSH= 12;
    private final static int ONTARIO_DEB = 13;
	private static final int SPARTAN = 14;
	private static final int GALA = 15;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_book_room);
		
		 popupMenu = new PopupMenu(this, findViewById(R.id.anchor));
         popupMenu.getMenu().add(Menu.NONE, BOARDROOM, Menu.NONE, "BOARDROOM");
         popupMenu.getMenu().add(Menu.NONE, ROOM1, Menu.NONE, "ROOM 1");
         popupMenu.getMenu().add(Menu.NONE, ROOM2, Menu.NONE, "ROOM 2");
         popupMenu.getMenu().add(Menu.NONE, ROOM3, Menu.NONE, "ROOM 3");
         popupMenu.getMenu().add(Menu.NONE, ROOM4, Menu.NONE, "ROOM 4");
         popupMenu.getMenu().add(Menu.NONE, RECCESS, Menu.NONE, "RECCESS");
         popupMenu.getMenu().add(Menu.NONE, PLAYGROUND, Menu.NONE, "PLAYGROUND");
         popupMenu.getMenu().add(Menu.NONE, CLAUDE_LAMOUREUX, Menu.NONE, "CLAUDE LAMOUREUX");
         popupMenu.getMenu().add(Menu.NONE, BARON, Menu.NONE, "BARON");
         popupMenu.getMenu().add(Menu.NONE, CORTLAND, Menu.NONE, "CORTLAND");
         popupMenu.getMenu().add(Menu.NONE, EMPIRE, Menu.NONE, "EMPIRE");
         popupMenu.getMenu().add(Menu.NONE, MACINTOSH, Menu.NONE, "MACINTOSH");
         popupMenu.getMenu().add(Menu.NONE, ONTARIO_DEB, Menu.NONE, "ONTARIO DEBENTURE");
         popupMenu.getMenu().add(Menu.NONE, SPARTAN, Menu.NONE, "SPARTAN");
         popupMenu.getMenu().add(Menu.NONE, GALA, Menu.NONE, "GALA");
         popupMenu.setOnMenuItemClickListener(this);
         findViewById(R.id.anchor).setOnClickListener(this);
		
		Button button = (Button) findViewById(R.id.submit_button);
		button.setOnClickListener(new View.OnClickListener() {
		    public void onClick(View v) {
		    	Intent intent = new Intent(com.example.otppmeetingrooms.BookRoom.this, com.example.otppmeetingrooms.Successful.class);
			    startActivity(intent);
		    }
		});
		
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.book_room, menu);
		return true;
	}
	
	@Override
	public void onClick(View v) {
	       popupMenu.show();
	}
	@Override
	public boolean onMenuItemClick(MenuItem item) {
	       TextView tv = (TextView) findViewById(R.id.selection);
	       switch (item.getItemId()) {
	       case BOARDROOM:
	              tv.setText("BOARDROOM");
	              break;
	       case ROOM1:
	              tv.setText("ROOM 1");
	              break;
	       case ROOM2:
	              tv.setText("ROOM 2");
	              break;
	       case ROOM3:
	              tv.setText("ROOM 3");
	              break;
	       case ROOM4:
	              tv.setText("ROOM 4");
	              break;
	       case RECCESS:
	              tv.setText("RECCESS");
	              break;
	       case PLAYGROUND:
	              tv.setText("PLAYGROUND");
	              break;
	       case CLAUDE_LAMOUREUX:
	              tv.setText("CLAUDE LAMOUREUX");
	              break;
	       case BARON:
	              tv.setText("BARON");
	              break;
	       case CORTLAND:
	              tv.setText("CORTLAND");
	              break;
	       case EMPIRE:
	              tv.setText("EMPIRE");
	              break;
	       case MACINTOSH:
	              tv.setText("MACINTOSH");
	              break;
	       case ONTARIO_DEB:
	              tv.setText("ONTARIO DEBENTURE");
	              break;
	       case SPARTAN:
	              tv.setText("SPARTAN");
	              break;
	       case GALA:
	              tv.setText("GALA");
	              break;
	       }
	       return false;
	}

}

