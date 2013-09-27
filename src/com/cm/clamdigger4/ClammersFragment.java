package com.cm.clamdigger4;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class ClammersFragment extends Fragment {
	public static final String TAG = "CLAMMERS FRAGMENT";
//	
	private ClammerTipsListener listener;
	
	public interface ClammerTipsListener {
		public String onClammerTipsRequest();
		public void onLaunchImplicitIntent();
		public void onLaunchSecondActivity();
	}
//private PredictionListener listener;
//	
//	public interface PredictionListener{
//		public String onGrabPrediction();
//		public void onGrabLocation();
//	}

//	Button b,bLow, bPrediction;
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
//		b = (Button)findViewById(R.id.bPrediction);
//    	bLow = (Button)findViewById(R.id.bPredictionLow);
//    	bPrediction5 = (Button)findViewById(R.id.bPrediction);
//		etCity = (EditText)findViewById(R.id.etCity);
    
//    tvCity = (TextView)findViewById(R.id.tvCity);
//    tvPrediction = (TextView)findViewById(R.id.tvPrediction);
//    tvWater = (TextView)findViewById(R.id.tvWater);
//    tidesite = (TextView)findViewById(R.id.tidesite);//location
//    calendar = (TextView)findViewById(R.id.calendar);//date
//    tidepre = (TextView)findViewById(R.id.tidepre);//high or low tide
//    waveheight = (TextView)findViewById(R.id.waveheight);//swell height
		return view;
	}
//	
//		/*
//		 * Tide Predictions:Get current tide.
//		 */
//		
//		b.setOnClickListener(new OnClickListener(){
//			
//			@Override
//			public void onClick(View arg2) {
//			
//			Toast.makeText(getActivity(), TAG, Toast.LENGTH_SHORT).show();
//			String predict = listener.onGrabPrediction();
//			
//			//update label with dynamic answer
//			bPrediction.setText(predict);
	 		//Displays update text here.
//    		tidesite.setText("Location:              " +tideInfo);//location
//    		calendar.setText("Date:                     "+date);//date
//    		tidepre.setText("Tide Prediction:   "+tideType);//hi/lo 
//    		waveheight.setText("Swell:                    "+tideHeight);//swell
//			}
//		
//		});
//		
//		/*
//		 * Tide Location: Get Location
//		 */
//		bLow.setOnClickListener(new OnClickListener(){
//			@Override
//			public void onClick(View v){
//				
//				listener.onLaunchSecondActivity();
//			}
//		});
//		
//		

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
