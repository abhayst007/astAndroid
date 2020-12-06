package com.sunilos.ncslogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class StudentList extends AppCompatActivity {

    ListView studentlist = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        studentlist = (ListView) findViewById(R.id.studentList);

    }
}