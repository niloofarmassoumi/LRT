package com.example.niloofar.listnerradiotextview;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText inputObj=findViewById(R.id.txt_input);

        RadioButton shortObj=findViewById(R.id.rb_short);
        RadioButton longObj=findViewById(R.id.rb_long);

        RadioGroup mainObj=findViewById(R.id.rg_main);

        final TextView textObj=findViewById(R.id.txv_text);

        mainObj.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                String tmp=inputObj.getText().toString();

                if(i==R.id.rb_long){

                    textObj.setText(tmp+"\n with long");
                    Toast.makeText(getApplicationContext(), tmp, Toast.LENGTH_SHORT).show();

                }else{

                    textObj.setText(tmp+"\n with short");
                    Toast.makeText(getApplicationContext(), tmp, Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}
