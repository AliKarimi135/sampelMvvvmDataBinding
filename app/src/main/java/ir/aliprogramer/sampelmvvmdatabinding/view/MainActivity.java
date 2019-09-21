package ir.aliprogramer.sampelmvvmdatabinding.view;

import android.app.Activity;
import android.database.DatabaseUtils;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ir.aliprogramer.sampelmvvmdatabinding.R;
import ir.aliprogramer.sampelmvvmdatabinding.databinding.ActivityMainBinding;
import ir.aliprogramer.sampelmvvmdatabinding.viewModel.MainActivityViewModel;

public class MainActivity extends AppCompatActivity {
 MainActivityViewModel mainActivityViewModel;
 ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainActivityViewModel=new MainActivityViewModel();
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setLogin(mainActivityViewModel);
    }
}
