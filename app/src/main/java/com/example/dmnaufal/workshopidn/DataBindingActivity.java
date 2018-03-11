package com.example.dmnaufal.workshopidn;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dmnaufal.workshopidn.databinding.ActivityDataBindingBinding;
import com.example.dmnaufal.workshopidn.model.Peserta;

public class DataBindingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDataBindingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding);

        Peserta p = new Peserta("andi","18","padang");
        binding.setPesertas(p);
    }
}
