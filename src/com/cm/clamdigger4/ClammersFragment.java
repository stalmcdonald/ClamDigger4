package com.cm.clamdigger4;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.cm.clamdigger4.ClammersFragment.ClammerTipsListener;

public class ClammersFragment extends Fragment {
	public static final String TAG = "CLAMMERS FRAGMENT";
//	
	private ClammerTipsListener listener;
	
	public interface ClammerTipsListener {
		public String onClammerTipsRequest();
		public void onLaunchImplicitIntent();
		public void onLaunchSecondActivity();
	}


//	Button infoButton, tipsButton, browse;
//	TextView clammersTip;
	//hold ui and interface elements
	
	
	//utilize primary method to instantiate a view
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		//create a view by overriding superclass
		super.onCreateView(inflater, container, savedInstanceState);
		
		//inflate view into current context...goes in xml file and make into usable view
	LinearLayout view = (LinearLayout) inflater.inflate(R.layout.activity_two, container, false);
//		clammersTip = (TextView) getActivity().findViewById(R.id.clamTips);//replace getActivity with view?
//		tipsButton = (Button) getActivity().findViewById(R.id.tButton);//replace getActivity with view?
//		clammersTip = (TextView) getActivity().findViewById(R.id.clamTips);//replace getActivity with view? Is it necessary?
//		
		return view;
	}
//	
//		/*
//		 * Clamming Tips: Randomly selects tips on clamming.
//		 */
//		
//		tipsButton.setOnClickListener(new OnClickListener(){
//			
//			@Override
//			public void onClick(View arg2) {
//			
//			Toast.makeText(getActivity(), TAG, Toast.LENGTH_SHORT).show();
//			String tip = listener.onClammerTipsRequest();
//			
//			//update label with dynamic answer
//			clammersTip.setText(tip);
//			}
//		
//		});
//		
//		/*
//		 * Intent: Launches Second Activity
//		 */
//		infoButton.setOnClickListener(new OnClickListener(){
//			@Override
//			public void onClick(View v){
//				
//				listener.onLaunchSecondActivity();
//			}
//		});
//		
//		
//		/*
//		 * Implicit Intent: Launches Web browsers to open website.
//		 */
//		
//		browse.setOnClickListener(new OnClickListener() {
//		@Override
//		public void onClick(View interwebs) {
//			// sends user to site that shows more information on Digging for razor clams
//			Uri uriUrl = Uri.parse("http://wdfw.wa.gov/fishing/shellfish/razorclams/howto_dig.html");
//			
//			Intent browse_intent = new Intent(Intent.ACTION_VIEW, uriUrl);
//			
//			startActivity(browse_intent);
//			
//		}
//	});
//		return view;
//	};
	/*
	 * Implement onAttach()
	 * call the super
	 * implement try catch block with a ClassCastException
	 * if the interface is not implemented
	 */
//	@Override
//	public void onAttach(Activity activity){
//		super.onAttach(activity);
//		try{
//			listener = (ClammerTipsListener) activity;
//		}catch (ClassCastException e){
//			throw new ClassCastException(activity.toString()+ "must implement the Interface ClammerTipsListener");
//		}
//	}
}
