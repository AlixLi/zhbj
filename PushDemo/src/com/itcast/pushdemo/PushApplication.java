package com.itcast.pushdemo;

import android.app.Application;
import cn.jpush.android.api.JPushInterface;

public class PushApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		JPushInterface.setDebugMode(true);
	    JPushInterface.init(this);
	}
}
