package toong.vn.androidusevector;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.graphics.drawable.VectorDrawableCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.content.res.AppCompatResources;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);

        //        testImage(R.drawable.ic_vector_all_out);
        testImage(R.drawable.ic_next);
    }

    private void testImage(int drawableRes) {
        Drawable drawable = useContextCompat(drawableRes);
        //                                Drawable drawable = useResourceCompat(drawableRes);
        //                                Drawable drawable = useAppCompatResources(drawableRes);
        //        Drawable drawable = useVectorDrawableCompat(drawableRes);
        imageView.setImageDrawable(drawable);
    }

    private Drawable useResourceCompat(int drawableRes) {
        return ResourcesCompat.getDrawable(getResources(), drawableRes, getTheme());
    }

    public Drawable useContextCompat(int drawableRes) {
        return ContextCompat.getDrawable(this, drawableRes);
    }

    public Drawable useAppCompatResources(int drawableRes) {
        return AppCompatResources.getDrawable(this, drawableRes);
    }

    public Drawable useVectorDrawableCompat(int drawableRes) {
        return VectorDrawableCompat.create(getResources(), drawableRes, getTheme());
    }
}