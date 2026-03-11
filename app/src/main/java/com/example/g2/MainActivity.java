package com.example.g2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText name,password;
    TextView reset;
    Button login;
    public String username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("lifecycle", "on create executed");
        setContentView(R.layout.activity_main);


        name = findViewById(R.id.et_name);
        password = findViewById(R.id.et_pass);

        reset = findViewById(R.id.tv_reset);

        login = findViewById(R.id.btn_login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = name.getText().toString();
                String p = password.getText().toString();

                if(n.equals("SI26") && p.equals("1234")){
                    Intent intent = new Intent(MainActivity.this,WelcomeActivity.class);
                    intent.putExtra("username",n);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "name or password is wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle" ,"On pause Executed" );
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle" ,"On resume Executed" );
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle" ,"On start Executed" );
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle" ,"On stop Executed" );
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle" ,"On restart Executed" );
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
        Log.d("lifecycle" ,"On destroy Executed" );

    }
}