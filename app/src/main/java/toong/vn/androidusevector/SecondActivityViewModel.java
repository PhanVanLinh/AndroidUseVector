package toong.vn.androidusevector;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.graphics.drawable.Drawable;
import android.support.v7.content.res.AppCompatResources;

/**
 * Created by PhanVanLinh on 20/11/2017.
 * phanvanlinh.94vn@gmail.com
 */

public class SecondActivityViewModel extends BaseObservable{
    Context mContext;

    public SecondActivityViewModel(Context context) {
        mContext = context;
    }

    @Bindable
    public Drawable getBackground(){
//        return Context.getDrawable(mContext, R.drawable.ic_announcement_black_24dp); => using like this will make app with API < 5 crash
        return AppCompatResources.getDrawable(mContext, R.drawable.ic_announcement_black_24dp);
    }
}
