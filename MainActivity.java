package com.example.timesetting;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editText1,editText2;
    Button btn_p,btn_s,btn_m,btn_d;
    TextView textView;
    int num1,num2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.number_one);
        editText2 = findViewById(R.id.number_two);
        btn_p = findViewById(R.id.plus);
        btn_s = findViewById(R.id.subtraction);
        btn_m = findViewById(R.id.multy);
        btn_d = findViewById(R.id.division);
        textView=findViewById(R.id.Answer);

        btn_p.setOnClickListener(this);
        btn_s.setOnClickListener(this);
        btn_m.setOnClickListener(this);
        btn_d.setOnClickListener(this);

    }

        public int getIntFromEdittext(EditText editText)
        {
            if(editText.getText().toString().equals(""))
            {
                Toast.makeText(MainActivity.this,"please enter number",Toast.LENGTH_SHORT).show();
                return 0;
            }
            else
                return Integer.parseInt(editText.getText().toString());
        }

    @Override
    public void onClick(View view) {

        num1=getIntFromEdittext(editText1);
        num2=getIntFromEdittext(editText2);

        if(view.getId()==R.id.plus)
                textView.setText("Answer: "+(num1+num2));
        else if(view.getId()==R.id.subtraction)
                textView.setText("Answer: "+(num1-num2));
        else if (view.getId()==R.id.multy)
            textView.setText("Answer: "+(num1*num2));
        else
            textView.setText("Answer: "+((float)num1/(float) num2));
    }
}