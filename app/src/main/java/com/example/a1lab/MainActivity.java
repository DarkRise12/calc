package com.example.a1lab;

import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int flagO;
    public boolean flagT = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Made by Nikita and Lenya", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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

    public void Click1(View v){
        if(flagT == false){
            TextView t1 = (TextView)findViewById(R.id.textView);
            t1.setText(t1.getText() + "1");
        }
        else {
            TextView t2 = (TextView)findViewById(R.id.textView1);
            t2.setText(t2.getText() + "1");
        }
    }

    public void Click2(View v){
        if(flagT == false) {
            TextView t1 = (TextView)findViewById(R.id.textView);
            t1.setText(t1.getText() + "2");
        }
        else {
            TextView t2 = (TextView)findViewById(R.id.textView1);
            t2.setText(t2.getText() + "2");
        }
    }

    public void Click3(View v){
        if(flagT == false) {
            TextView t1 = (TextView) findViewById(R.id.textView);
            t1.setText(t1.getText() + "3");
        }
        else {
            TextView t2 = (TextView) findViewById(R.id.textView1);
            t2.setText(t2.getText() + "3");
        }
    }
    public void Click4(View v){
        if(flagT == false) {
            TextView t1 = (TextView) findViewById(R.id.textView);
            t1.setText(t1.getText() + "4");
        }
        else {
            TextView t2 = (TextView) findViewById(R.id.textView1);
            t2.setText(t2.getText() + "4");
        }
    }
    public void Click5(View v){
        if(flagT == false) {
            TextView t1 = (TextView) findViewById(R.id.textView);
            t1.setText(t1.getText() + "5");
        }
        else {
            TextView t2 = (TextView) findViewById(R.id.textView1);
            t2.setText(t2.getText() + "5");
        }
    }
    public void Click6(View v){
        if(flagT == false) {
            TextView t1 = (TextView) findViewById(R.id.textView);
            t1.setText(t1.getText() + "6");
        }
        else {
            TextView t2 = (TextView) findViewById(R.id.textView1);
            t2.setText(t2.getText() + "6");
        }
    }
    public void Click7(View v){
        if(flagT == false) {
            TextView t1 = (TextView) findViewById(R.id.textView);
            t1.setText(t1.getText() + "7");
        }
        else {
            TextView t2 = (TextView) findViewById(R.id.textView1);
            t2.setText(t2.getText() + "7");
        }
    }
    public void Click8(View v){
        if(flagT == false) {
            TextView t1 = (TextView) findViewById(R.id.textView);
            t1.setText(t1.getText() + "8");
        }
        else {
            TextView t2 = (TextView) findViewById(R.id.textView1);
            t2.setText(t2.getText() + "8");
        }
    }
    public void Click9(View v){
        if(flagT == false) {
            TextView t1 = (TextView) findViewById(R.id.textView);
            t1.setText(t1.getText() + "9");
        }
        else {
            TextView t2 = (TextView) findViewById(R.id.textView1);
            t2.setText(t2.getText() + "9");
        }
    }
    public void Click0(View v){
        if(flagT == false) {
            TextView t1 = (TextView) findViewById(R.id.textView);
            t1.setText(t1.getText() + "0");
        }
        else {
            TextView t2 = (TextView) findViewById(R.id.textView1);
            t2.setText(t2.getText() + "0");
        }
    }


    //smena operacii


    public void Plus(View v){
        flagO = 1;
        flagT = true;
    }
    public void Minus(View v){
        flagO = 2;
        flagT = true;
    }
    public void Umnoj(View v){
        flagO = 3;
        flagT = true;
    }
    public void Delen(View v){
        flagO = 4;
        flagT = true;
    }


    //znak ravno

    public void Ravno(View v) {
        float  Num1, Num2;
        float Num3;

        TextView t1 = (TextView) findViewById(R.id.textView);
        TextView t2 = (TextView) findViewById(R.id.textView1);
        TextView t3 = (TextView) findViewById(R.id.textView2);


        if (t2.getText() != "") {
            if(t1.getText() != "") {
                String t1v = t1.getText().toString();
                String t2v = t2.getText().toString();

                Num1 = Integer.parseInt(t1v);
                Num2 = Integer.parseInt(t2v);

                if (flagO == 1) {
                    if (t1.getText() != null || t2.getText() != null) {
                        Num3 = Num1 + Num2;
                        t3.setText(String.valueOf(Num3));
                    }
                }
                if (flagO == 2) {
                    if (t1.getText() != "" || t2.getText() != "") {
                        Num3 = Num1 - Num2;
                        t3.setText(String.valueOf(Num3));
                    }
                }
                if (flagO == 3) {
                    if (t1.getText() != "" || t2.getText() != "") {
                        Num3 = Num1 * Num2;
                        t3.setText(String.valueOf(Num3));
                    }
                }
                if (flagO == 4 && Num2 != 0) {
                    Num3 = Num1 / Num2;
                    t3.setText(String.valueOf(Num3));
                }
                if (flagO == 4 && Num2 == 0) {
                    t3.setText("Divided by 0");
                }
            }
            else t3.setText("Wrong value");
        }
        else t3.setText("Wrong value");
    }

    public void Del(View v)
    {
        flagT = false;
        flagO = 1;
        TextView t1 = (TextView) findViewById(R.id.textView);
        TextView t2 = (TextView) findViewById(R.id.textView1);
        TextView t3 = (TextView) findViewById(R.id.textView2);

        t1.setText("");
        t2.setText("");
        t3.setText("Result");
    }

}
