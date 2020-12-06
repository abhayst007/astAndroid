package com.sunilos.ncslogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList extends AppCompatActivity {

    ListView contList = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_list);
        contList =  (ListView) findViewById(R.id.contList);

        ArrayList<String> employees = new ArrayList<>();
        employees.add("Abhay");
        employees.add("Nayna");
        employees.add("Rekha");
        employees.add("Sunil");
        employees.add("Bhaskar");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, employees);
        contList.setAdapter(adapter);

        contList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Context msg= getApplicationContext();
                CharSequence text ="You clicked Item "+ adapter;
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(msg, text, duration);
                toast.show();

            }
        });




    }
}