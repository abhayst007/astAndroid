package com.sunilos.ncslogin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Username;
    private EditText Password;
    private CheckBox remember;
    private Button Login;
    private Button Fpass;
    private TextView Trial;
    private int a = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Username = (EditText) findViewById(R.id.Username);
        Password = (EditText) findViewById(R.id.Password);
        remember = (CheckBox) findViewById(R.id.Remember);
        Login = (Button) findViewById(R.id.Login);
        Fpass = (Button) findViewById(R.id.Fpass);
        Trial=(TextView)findViewById(R.id.Trial);


        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verify(Username.getText().toString(),Password.getText().toString());
            }
        });


    }
    private void verify(String Username,String Password){
        if ((Username.equals("abhayst2007"))&&((Password.equals("pass1234")))){
            /*NotificationCompat.Builder mBuilder =  new NotificationCompat.Builder(this);
            mBuilder.setSmallIcon(R.drawable.ic_launcher_background);
            mBuilder.setContentTitle("Congratulations !!");
            mBuilder.setContentText("You just logged in !!!");*/
        Intent start = new Intent(MainActivity.this, EmployeeList.class);
      startActivity(start);
     }else{
            a--;

            Trial.setText("No. of attempts remaining : "+ a);
        }if (a==0){
            Login.setEnabled(false);
            Intent failed = new Intent(MainActivity.this,LoginFailed.class);
            startActivity(failed);
        }
    }
}