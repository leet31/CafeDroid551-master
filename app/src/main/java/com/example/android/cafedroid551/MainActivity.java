package com.example.android.cafedroid551;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Spinner spoonSpinner=(Spinner) findViewById(R.id.spoon_spinner);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.spoon_array, R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spoonSpinner.setAdapter(adapter);

        Spinner hourSpinner=(Spinner) findViewById(R.id.hours_spinner);
        ArrayAdapter<CharSequence> hoursAdapter=ArrayAdapter.createFromResource(this,R.array.hours_array, R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        hourSpinner.setAdapter(hoursAdapter);

        Spinner minsSpinner=(Spinner) findViewById(R.id.mins_spinner);
        ArrayAdapter<CharSequence> minsAdapter=ArrayAdapter.createFromResource(this,R.array.mins_array, R.layout.support_simple_spinner_dropdown_item);
        minsAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        minsSpinner.setAdapter(minsAdapter);

    }

    public void onClickStatus(View v){

        Intent intent=new Intent(this, MachineStatus.class);
        startActivity(intent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
