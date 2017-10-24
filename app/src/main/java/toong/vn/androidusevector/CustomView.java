package toong.vn.androidusevector;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.v7.content.res.AppCompatResources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CustomView extends LinearLayout {

    private ImageView imgImage;
    private TextView tvText;

    public CustomView(Context context) {
        this(context, null);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init(attrs);
    }

    private void init(AttributeSet attrs) {
        LayoutInflater.from(getContext()).inflate(R.layout.custom_layout, this, true);

        imgImage = (ImageView) findViewById(R.id.image);
        tvText = (TextView) findViewById(R.id.text);

        TypedArray ta = getContext().obtainStyledAttributes(attrs, R.styleable.CustomViewStyle);
        String text = ta.getString(R.styleable.CustomViewStyle_text);

        int resourceId = ta.getResourceId(R.styleable.CustomViewStyle_image, 0);
        Drawable drawable = null;
        if (resourceId != 0) {
            drawable = AppCompatResources.getDrawable(getContext(), resourceId);
        }
        //        Drawable drawable = ta.getDrawable(R.styleable.CustomViewStyle_image);
        ta.recycle();
        if (drawable != null) {
            imgImage.setBackground(drawable);
        }
        tvText.setText(text);
    }
}