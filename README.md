# AndroidLogger
[![](https://jitpack.io/v/mukesh4u/AndroidLogger.svg)](https://jitpack.io/#mukesh4u/AndroidLogger)

Android Logger library project that works with jitpack.io.

# Step 1. Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
# Step 2. Add the dependency

	dependencies {
	        compile 'com.github.mukesh4u:AndroidLogger:1.0'
	}

# Step 3. Add In yoor Application class
   
```
public class LoggerApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //Logger.init(BuildConfig.DEBUG, getString(R.string.app_name));
        Logger.init(true, getString(R.string.app_name));
    }
}
```

 
# Step 4. Finally in your activity you can use like:
   ```
   Logger.d(getLocalClassName(),"debug mode");
   ```
