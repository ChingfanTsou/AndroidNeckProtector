package org.footoo.cjflsq.neck;

import android.app.Application;
import android.content.Context;

public class MyApplication extends Application {
	
	private static Context context = null;
	
	public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }
	
	public static Context getAppContext() {
	    return context;
	}
	
}
