package com.example.dimenscreenadapter;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		float density = getResources().getDisplayMetrics().density;
		System.out.println("设备密度:" + density);
		
		//dp 和 px
		//dp = px/设备密度
		
	}

}
