package toong.vn.androidusevector;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.content.res.AppCompatResources;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ResourcesCompat.getDrawable(getResources(), R.drawable.ic_all_out_black_24dp, getTheme());

//        ResourcesCompat.getDrawable(((ImageView)findViewById(R.id.imageView)).getContext().getResources(), R.drawable.ic_all_out_black_24dp, ((ImageView)findViewById(R.id.imageView)).getContext().getTheme());

        ResourcesCompat.getDrawable(findViewById(R.id.textView).getResources(), R.drawable.ic_arrow_right_white,
                findViewById(R.id.textView).getContext().getTheme());

//        vectorDrawableStart((TextView) findViewById(R.id.textView), R.drawable.ic_all_out_black_24dp);

        AppCompatResources.getDrawable(this, R.drawable.ic_all_out_black_24dp);

        /*ImageView imageView = findViewById(R.id.imageView);
        Drawable drawableAppCompatResources =
                AppCompatResources.getDrawable(this, R.drawable.ic_all_out_black_24dp);

        imageView.setImageDrawable(drawableAppCompatResources);*/
    }

    public static void vectorDrawableStart(TextView textView, @DrawableRes int drawable) {
        try {
            Drawable d = ResourcesCompat.getDrawable(textView.getResources(), drawable,
                    textView.getContext().getTheme());
            Drawable[] drawables = textView.getCompoundDrawables();
            textView.setCompoundDrawablesWithIntrinsicBounds(d, drawables[1], drawables[2],
                    drawables[3]);
        } catch (Resources.NotFoundException e) {
            e.printStackTrace();
        }
    }
}