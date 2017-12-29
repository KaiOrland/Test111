package com.example.madaim.test111;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener{

    int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button1).setOnClickListener(new HandleClick());

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0) {
                Button btn = (Button)arg0;
                TextView tv = (TextView) findViewById(R.id.textView);
                counter++;
                tv.setText(Integer.toString(counter));
            }
        });


        findViewById(R.id.button5).setOnClickListener(this);


        View.OnClickListener handleClick2 = new View.OnClickListener() {
            public void onClick(View arg0) {
                Button bottun6 = (Button) arg0;
                TextView tv = (TextView) findViewById(R.id.textView);
                counter++;
                tv.setText(Integer.toString(counter));
            }
        };

        findViewById(R.id.button6).setOnClickListener(handleClick2);
    }
    public void onClick(View arg0) {
        Button btn = (Button)arg0;
        TextView tv = (TextView) findViewById(R.id.textView);
        counter++;
        tv.setText(Integer.toString(counter));
    }




    private class HandleClick implements View.OnClickListener {
        public void onClick(View arg0) {
            Button btn = (Button) arg0;
            TextView tv = (TextView) findViewById(R.id.textView);
            counter++;
            tv.setText(Integer.toString(counter));
        }
    }




}
