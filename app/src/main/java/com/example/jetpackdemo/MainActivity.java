package com.example.jetpackdemo;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvShow;
    private EditText etInput;
    private Button   btnSure;
    private Button   btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initEvent();
    }


    private void initView() {
        tvShow = findViewById(R.id.tv_show);
        etInput = findViewById(R.id.et_input);
        btnSure = findViewById(R.id.btn_sure);
        btnClear = findViewById(R.id.btn_clear);
    }

    private void initEvent() {
        btnSure.setOnClickListener(this);
        btnClear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_sure:
                Editable inputText = etInput.getText();
                tvShow.setText(inputText);
                etInput.setText("");
                break;
            case R.id.btn_clear:
                etInput.setText("");
                tvShow.setText("");
                break;
        }
    }
}