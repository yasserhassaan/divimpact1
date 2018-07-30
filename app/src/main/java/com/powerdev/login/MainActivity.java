package com.powerdev.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText_email;
    EditText editText_pass;
    EditText editText_mobile;
    EditText editText_agian;
    Button cont;
    String email;
    String pass;
    String again;
    String mob;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText_email=findViewById(R.id.email);
        editText_pass =findViewById(R.id.pass);
        editText_mobile =findViewById(R.id.mob);
        editText_agian = findViewById(R.id.again);
        cont=findViewById(R.id.cont);


    }



    public void contin(View view) {

        email=editText_email.getText().toString();
        pass=editText_pass.getText().toString();
        mob=editText_mobile.getText().toString();
        again=editText_agian.getText().toString();

        if(pass.matches(again)){

        Intent intent= new Intent(this,Main2Activity.class);

        intent.putExtra("email_value",email);
        intent.putExtra("pass_value",pass);
        intent.putExtra("mob_value",mob);
        startActivity(intent);
    }
    else
        Toast.makeText(this,"password is not matches",Toast.LENGTH_LONG).show();



    }
}
