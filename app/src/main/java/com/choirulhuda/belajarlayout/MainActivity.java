package com.choirulhuda.belajarlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnRelLayout;
    ImageView imgConLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnRelLayout = findViewById(R.id.btn_rel_layout);
        imgConLayout = findViewById(R.id.img_cons_layout);

        btnRelLayout.setOnClickListener(this);
        imgConLayout.setOnClickListener(this);


    }

    public void actionLinLayout(View view) {
        Toast.makeText(this, "Ini adalah Linear Layout", Toast.LENGTH_SHORT).show();
        view.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(getApplicationContext(), "Ditekan lama", Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.btn_rel_layout:
                Toast.makeText(this, "Ini adalah Relatif Layout", Toast.LENGTH_SHORT).show();
                break;
            case R.id.img_cons_layout:
                Toast.makeText(this, "Ini adalah Constraint Layout", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}