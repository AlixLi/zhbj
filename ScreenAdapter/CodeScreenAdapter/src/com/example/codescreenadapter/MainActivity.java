package com.example.codescreenadapter;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		WindowManager wm = getWindowManager();
		int width = wm.getDefaultDisplay().getWidth();
		int height = wm.getDefaultDisplay().getHeight();

		TextView tvText = (TextView) findViewById(R.id.tv_text);

		LinearLayout.LayoutParams params = (LayoutParams) tvText
				.getLayoutParams();
		params.width = width / 3;
		params.height = height / 5;

		tvText.setLayoutParams(params);
	}

}
