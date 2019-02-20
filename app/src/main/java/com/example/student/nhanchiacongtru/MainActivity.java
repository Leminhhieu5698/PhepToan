package com.example.student.nhanchiacongtru;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText so_x,so_y;
    TextView kq;
    Button cong,tru,nhan,chia;
    float x,y,z;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       so_x = (EditText) findViewById(R.id.soa);
       so_y = (EditText) findViewById(R.id.sob);
       kq = (TextView) findViewById(R.id.ketq);
       cong = (Button) findViewById(R.id.cong);
        tru = (Button) findViewById(R.id.tru);
        nhan = (Button) findViewById(R.id.nhan);
        chia = (Button) findViewById(R.id.chia);
        cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           //     if(so_x.getText().toString().equals(""));{
          //          Toast.makeText(MainActivity.this,"Hãy nhập số a", Toast.LENGTH_SHORT).show();
            //    }
            //    else if(so_y.getText().toString().equals("")){
            //        Toast.makeText(MainActivity.this,"Hãy nhập số b", Toast.LENGTH_SHORT).show();
            //    }
                x = Float.parseFloat(so_x.getText().toString());
                y = Float.parseFloat(so_y.getText().toString());
                z=x+y;
                kq.setText(String.valueOf(z));
            }
        });
        tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  x = Float.parseFloat(so_x.getText().toString());
                y = Float.parseFloat(so_y.getText().toString());
                z=x-y;
                kq.setText(String.valueOf(z));
            }
        });
        nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x = Float.parseFloat(so_x.getText().toString());
                y = Float.parseFloat(so_y.getText().toString());
                z=x*y;
                kq.setText(String.valueOf(z));
            }
        });


    }
}
