package toong.vn.androidusevector;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import toong.vn.androidusevector.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ActivitySecondBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_second);
        binding.setViewModel(new SecondActivityViewModel(this));
    }
}
