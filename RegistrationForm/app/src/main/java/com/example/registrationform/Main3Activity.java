package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener{

    private ImageView backArrow, Sting, Voice, Cart, Car;
    private EditText nameEdtxt, emailEdtxt, desEdtxt, webEdtxt;
    private Spinner spinner;
    private Button btnfinish;
    private RadioGroup radioGroup;

    String Country = " ";
    ArrayList<String> countries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        initWidgets();
        initClickListener();
        finishRegistration();

        countries = new ArrayList<>();

        countries.add("United States");
        countries.add("United Kingdom");
        countries.add("Switzerland");
        countries.add("Germany");
        countries.add("France");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, countries);
        spinner.setAdapter(adapter);

        btnfinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
    private void initWidgets() {

        backArrow = (ImageView) findViewById(R.id.backarrow);
        Sting = (ImageView) findViewById(R.id.setting);
        Voice = (ImageView) findViewById(R.id.voice);
        Cart = (ImageView) findViewById(R.id.cart);
        Car = (ImageView) findViewById(R.id.car);

        btnfinish = (Button) findViewById(R.id.BTfinish);
        radioGroup = (RadioGroup) findViewById(R.id.radioGP);
        spinner = (Spinner) findViewById(R.id.Spin);

        nameEdtxt = (EditText) findViewById(R.id.nameedittext);
        emailEdtxt = (EditText) findViewById(R.id.Emailedittext);
        desEdtxt = (EditText) findViewById(R.id.Description);
        webEdtxt = (EditText) findViewById(R.id.websiteEdit);
    }
    private void finishRegistration()
    {

        String name = nameEdtxt.getText().toString();
        String email = emailEdtxt.getText().toString();
        String des = desEdtxt.getText().toString();
        String website = webEdtxt.getText().toString();

        Toast.makeText(this, name, Toast.LENGTH_LONG).show();

        Toast.makeText(this, email, Toast.LENGTH_LONG).show();

        Toast.makeText(this, des, Toast.LENGTH_LONG).show();

        Toast.makeText(this, website, Toast.LENGTH_LONG).show();


        String gender = " ";
        int chekRB = radioGroup.getCheckedRadioButtonId();
        switch (chekRB) {

            case R.id.rbMale:
                gender = "Male";
                break;

            case R.id.rbFemale:
                gender = "Famale";
                break;

            case R.id.rbOther:
                 gender = "Other";
                 break;

                  default:
                      break;
        }

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Country = countries.get(position);

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

                Country = "No Country Selected";
            }
        });

    }
    private void initClickListener() {

        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(this, "back arrow tabebd", Toast.LENGTH_LONG).show();
            }
        });

    }



    @Override
    public void onClick(View v) {

        Toast.makeText(this, "back arrow tabebd", Toast.LENGTH_LONG).show();

    }

}
