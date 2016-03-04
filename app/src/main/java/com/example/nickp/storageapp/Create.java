package com.example.nickp.storageapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.common.api.GoogleApiClient;

public class Create extends AppCompatActivity implements  View.OnClickListener{

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    EditText name;
    Button finish;
    String invName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        name = (EditText)findViewById(R.id.invName);
        finish = (Button) findViewById(R.id.nextButt);
        finish.setOnClickListener(this);
        name.setOnClickListener(this);
    }


    @Override
    public void onClick(View v)
    {
        if(v == finish)
        {
            invName = name.getText().toString();

            if(invName != "")
            {

            }
        }
    }
}
