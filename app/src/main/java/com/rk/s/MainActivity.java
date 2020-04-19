package com.rk.s;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Switch S_1_IDJAVA;
    TextView TV_1_IDJAVA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        S_1_IDJAVA = findViewById(R.id.S_1_IDXML);
        TV_1_IDJAVA = findViewById(R.id.TV_1_IDXML);
    }

    public void KetikaDiKlik(View Lihat) {
        if (S_1_IDJAVA.isChecked()) {
            TV_1_IDJAVA.setText("ON");
        } else {
            TV_1_IDJAVA.setText("OFF");
        }
    }

}
