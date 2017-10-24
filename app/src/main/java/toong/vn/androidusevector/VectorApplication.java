package toong.vn.androidusevector;

import android.app.Application;
import android.support.v7.app.AppCompatDelegate;

/**
 * Created by PhanVanLinh on 08/02/2018.
 * phanvanlinh.94vn@gmail.com
 */

public class VectorApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true); // enable it will make ResourceCompat work in API < 4.4
    }
}
