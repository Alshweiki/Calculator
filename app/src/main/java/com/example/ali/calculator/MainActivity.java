package com.example.ali.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void onClick(View v)
    {
        EditText n1 = (EditText) findViewById(R.id.editText);
        EditText n2 = (EditText) findViewById(R.id.editText2);
        TextView res = (TextView) findViewById(R.id.textView);
        TextView error = (TextView) findViewById(R.id.textView2);
        RadioButton sum = (RadioButton) findViewById(R.id.radioButton);
        RadioButton sub = (RadioButton) findViewById(R.id.radioButton2);
        RadioButton mul = (RadioButton) findViewById(R.id.radioButton3);
        float f = 0;
        if(sum.isChecked()){
            f = Float.valueOf(n1.getText().toString()) + Float.valueOf(n2.getText().toString());}
        if(sub.isChecked()){
            f = Float.valueOf(n1.getText().toString()) - Float.valueOf(n2.getText().toString());}
        if(mul.isChecked()){
            f = Float.valueOf(n1.getText().toString()) * Float.valueOf(n2.getText().toString());}
        else
        {
            error.setText("you have to chose on operation!!");

        }

        res.setText(String.valueOf(f));



    }




}
