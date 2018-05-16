package com.example.log4j;

import android.app.Application;

public class App extends Application
{

    @Override
    public void onCreate()
    {       
        super.onCreate();

      //  CrashHandler crashHandler = CrashHandler.getInstance();
      //  crashHandler.init(this);

        Log4jConfigure.configure(this);
    }
    
}
