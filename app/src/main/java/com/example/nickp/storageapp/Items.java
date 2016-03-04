package com.example.nickp.storageapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import java.util.List;

/**
 * Created by nickp on 3/2/2016.
 */
public class Items extends AppCompatActivity implements OnClickListener
{
    List name, inv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.items);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Set the lists
        setItemList();
        setInvList();
    }


    @Override
    public void onClick(View v)
    {

    }

    private void setItemList()
    {

    }

    private void setInvList()
    {

    }
}
