package com.cm.clamdigger4;

import java.util.Random;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ClammersFragment extends Fragment {
	Button infoButton, tipsButton, browse;
	TextView clammersTip;
	//hold ui and interface elements
	
	
	//utilize primary method to instantiate a view
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		//create a view by overriding superclass
		super.onCreateView(inflater, container, savedInstanceState);
		clammersTip = (TextView) getActivity().findViewById(R.id.clamTips);//replace getActivity with view?
		tipsButton = (Button) getActivity().findViewById(R.id.tButton);//replace getActivity with view?
		clammersTip = (TextView) getActivity().findViewById(R.id.clamTips);//replace getActivity with view? Is it necessary?
		
		//inflate view into current context...goes in xml file and make into usable view
		LinearLayout view = (LinearLayout) inflater.inflate(R.layout.tide, container, false);
		
//		return view;
	
		/*
		 * Clamming Tips: Randomly selects tips on clamming.
		 */
		
		tipsButton.setOnClickListener(new OnClickListener(){
			
			@Override
			public void onClick(View arg2) {
			
			String[] tips ={//array to hold data
					"The best time to dig for clams is low tide",
					"Clamming Season begins at the end of this month!",
					"The Department of fish and wildlife offers resources with detailed maps of where to dig at each beach, instructions for digging, guides to identifying clam species, plus links to tide tables.  ",
					"Don't forget your liscense! Shellfish licenses can be purchased online, by mail or fax.",
					"Read the tides, you can find them by clicking 'Get Tidal Information' button above.",
					"Cockies are commonly used in chowders.",
					"Small clams can be used for pasta or chowders",
					"Digging for clams is messy.",
					"Razor clams in the Northwest can reach 6 inches long.",
					"Washington Department of Fish and Wildlife Shellfish Rule Change Hotline, 1-866-880-5431."};
					
			// The button was clicked, so update the answer label with a random tip
			String tip = "";//blank string
			
			//Randomly select a tip
			Random randomGenerator = new Random();  // Construct a new Random number generator and assign it to the variable declared.
			int randomTip = randomGenerator.nextInt(tips.length);
			tip = tips[randomTip]; //get elements at index randomNumber
			
			//Update the label with our dynamic answer
			clammersTip.setText(tip);
			
			
		}
		
		});
		/*
		 * Implicit Intent: Launches Web browsers to open website.
		 */
		
		browse.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View interwebs) {
			// sends user to site that shows more information on Digging for razor clams
			Uri uriUrl = Uri.parse("http://wdfw.wa.gov/fishing/shellfish/razorclams/howto_dig.html");
			
			Intent browse_intent = new Intent(Intent.ACTION_VIEW, uriUrl);
			
			startActivity(browse_intent);
			
		}
	});
		return view;
	};
	

}
