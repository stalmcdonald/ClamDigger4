/*
 * Crystal McDonald
 * Java II
 * 1309
 * Week 4
 * Fragments
 */
package com.cm.clamdigger4;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TideActivity extends FragmentActivity implements OnClickListener{
	Button infoButton, tipsButton, browse;
	TextView clammersTip;
	//checks network connection
	 Boolean _connected = false;
	 Context _context;
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		//super.onCreate(savedInstanceState);
		_context = this;
		setContentView(R.layout.clamfragment);
		infoButton = (Button) findViewById(R.id.infoButton);
		
		browse = (Button)findViewById(R.id.browse);
		
		
		
		/*
		 * Explicit Intent: Launches second activity.
		 */
		infoButton.setOnClickListener(new OnClickListener(){//setup onclick Listener

			@Override
			public void onClick(View v) {
				// second activity launch
				Intent intent = new Intent(TideActivity.this, SecondActivity.class);
				startActivity(intent);
			}
			
		});
		
		
		
			
}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tide, menu);
		return true;
	}
	
	//Retrieves state from second activity to be added to url
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data){
		super.onActivityResult(requestCode, resultCode, data);
		if(data.getExtras().containsKey("enteredInfo")){
			infoButton.setText(data.getStringExtra("enteredInfo"));
		}
	}

	@Override
	public void onClick(View v) {
				
	}


}//end
