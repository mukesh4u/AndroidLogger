package android.com.androidlogger;

import android.app.Application;
import android.com.logger.Logger;


/**
 * Created by Mukesh on 4/8/17.
 * Affle Appstudioz S/W Pvt. Ltd.
 * mukesh.yadav@affle.com
 */

public class LoggerApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //Logger.init(BuildConfig.DEBUG, getString(R.string.app_name));
        Logger.init(true, getString(R.string.app_name));
    }
}
