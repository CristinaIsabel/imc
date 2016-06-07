package com.example.walmart.myapplication;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mEditTextPeso;
    private EditText mEditTextEsstatura;
    private Button mButtonCalcular;
    private TextView mTextViewImc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditTextPeso = (EditText)findViewById(R.id.edit_text_peso);
        mEditTextEsstatura = (EditText)findViewById(R.id.edit_text_estatura);
        mButtonCalcular = (Button) findViewById(R.id.button_calcular);
        mTextViewImc = (TextView) findViewById(R.id.text_view_imc);

        mButtonCalcular.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String s = mEditTextPeso.getText().toString();
                double peso = Double.parseDouble(s);
                s = mEditTextEsstatura.getText().toString();
                double estatura = Double.parseDouble(s);
                double imc = peso / (estatura*estatura);

                mTextViewImc.setText(Double.toString(imc));
            }
        });
    }
}

