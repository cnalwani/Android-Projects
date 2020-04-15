package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.TextView;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button, button1;
    EditText editText;
    CheckBox checkBox;
    RadioGroup radioGroup;
    ProgressBar progressBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.btnHello);

        button1 = (Button) findViewById(R.id.btn1);

        editText = (EditText) findViewById(R.id.editText);
        String text = editText.getText().toString();

        checkBox = (CheckBox) findViewById(R.id.check);

        radioGroup = (RadioGroup) findViewById(R.id.radioGP);

        progressBar = (ProgressBar) findViewById(R.id.prgBar);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(MainActivity.this , Main2Activity.class);
                startActivity(intent);

            }
        });

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 10; i++) {
                    progressBar.incrementProgressBy(10);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread.start();

//        setOnClickListener();
    }
//
//    public void setOnClickListener()
//    {
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//                Intent intent = new Intent(MainActivity.this , Main2Activity.class);
//                startActivity(intent);
//
//            }
//        });
//
//    }

    public void onClick(View view){


        if(checkBox.isChecked()){

            System.out.println("It it checked");
        }
        else {
            System.out.println("it's not checked");
        }

        int id = radioGroup.getCheckedRadioButtonId();

        switch (id){

            case R.id.radio1:
                editText.setText("Male");
                break;

            case R.id.radio2:
                editText.setText("Famle");
                break;
            case R.id.radio3:
                editText.setText("Other");
                break;
            default:
                break;
        }
    }
}


