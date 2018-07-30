package com.powerdev.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView textView_email;
    TextView textView_pass;
    TextView textView_mob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView_email = findViewById(R.id.email_view);
        textView_pass = findViewById(R.id.pass_view);
        textView_mob =findViewById(R.id.mob_view);
        textView_email.setText("Email : "+ getIntent().getExtras().getString("email_value"));
        textView_pass.setText("password : "+ getIntent().getExtras().getString("pass_value"));
        textView_mob.setText("mobile : "+ getIntent().getExtras().getString("mob_value"));

    }
}
