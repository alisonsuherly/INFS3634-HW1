package com.example.hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scrollview);
//        setContentView(R.layout.activity_main);
    }

    public void hideSydButton(View view) {
        Button sydneyButton = (Button) findViewById(R.id.syd_hide);
        String ButtonText = sydneyButton.getText().toString();
        if(ButtonText.equals("-")) {
            View v = (View) findViewById(R.id.sydney_layout);
            v.setVisibility(View.INVISIBLE);
            sydneyButton.setText("+");
        }
        else {
            View v = (View) findViewById(R.id.sydney_layout);
            v.setVisibility(View.VISIBLE);
            sydneyButton.setText("-");
        }
    }

    public void hideNyButton(View view) {
        Button nyButton = (Button) findViewById(R.id.ny_hide);
        String ButtonText2 = nyButton.getText().toString();
        if(ButtonText2.equals("-")) {
            View v = (View) findViewById(R.id.ny_layout);
            v.setVisibility(View.INVISIBLE);
            nyButton.setText("+");
        }
        else {
            View v = (View) findViewById(R.id.ny_layout);
            v.setVisibility(View.VISIBLE);
            nyButton.setText("-");
        }
    }

    public void hideTokyoButton(View view) {
        Button tokyoButton = (Button) findViewById(R.id.tokyo_hide);
        String ButtonText3 = tokyoButton.getText().toString();
        if(ButtonText3.equals("-")) {
            View v = (View) findViewById(R.id.tokyo_layout);
            v.setVisibility(View.INVISIBLE);
            tokyoButton.setText("+");
        }
        else {
            View v = (View) findViewById(R.id.tokyo_layout);
            v.setVisibility(View.VISIBLE);
            tokyoButton.setText("-");
        }
    }

    public void hideParisButton(View view) {
        Button parisButton = (Button) findViewById(R.id.paris_hide);
        String ButtonText3 = parisButton.getText().toString();
        if(ButtonText3.equals("-")) {
            View v = (View) findViewById(R.id.paris_layout);
            v.setVisibility(View.INVISIBLE);
            parisButton.setText("+");
        }
        else {
            View v = (View) findViewById(R.id.paris_layout);
            v.setVisibility(View.VISIBLE);
            parisButton.setText("-");
        }
    }

    public void hideMoscowButton(View view) {
        Button moscowButton = (Button) findViewById(R.id.moscow_hide);
        String ButtonText3 = moscowButton.getText().toString();
        if(ButtonText3.equals("-")) {
            View v = (View) findViewById(R.id.moscow_layout);
            v.setVisibility(View.INVISIBLE);
            moscowButton.setText("+");
        }
        else {
            View v = (View) findViewById(R.id.moscow_layout);
            v.setVisibility(View.VISIBLE);
            moscowButton.setText("-");
        }
    }

    public void buttonRespond(View view) {
//        TimeZone tz = TimeZone.getTimeZone("America/Los_Angles");
//        StringBuilder sb = new StringBuilder();
//        Formatter formatter = new Formatter(sb, Locale.US);

//        String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());
//        TextView sydney = findViewById(R.id.sydneyTime);
//        sydney.setText(currentDateTimeString);
        Calendar sydCal = Calendar.getInstance();
        DateFormat sydDate = new SimpleDateFormat("h:mm a");
        String sydString = sydDate.format(sydCal.getTime());
        TextView sydney = findViewById(R.id.sydneyTime);
        sydney.setText(sydString);

        String name = "bloop";
        System.out.print("hello");

        TextView newYork = findViewById(R.id.newYorkTime);
        Calendar nyCal = Calendar.getInstance();
        DateFormat nyDate = new SimpleDateFormat("h:mm a");
        nyDate.setTimeZone(TimeZone .getTimeZone("GMT-04:00"));
        String nyString = nyDate.format(nyCal.getTime());
        newYork.setText(nyString);

        TextView tokyo = findViewById(R.id.tokyoTime);
        Calendar tokyoCal = Calendar.getInstance();
        DateFormat tokyoDate = new SimpleDateFormat("h:mm a");
        tokyoDate.setTimeZone(TimeZone.getTimeZone("GMT+09:00"));
        String tokyoString = tokyoDate.format(tokyoCal.getTime());
        tokyo.setText(tokyoString);

        TextView paris = findViewById(R.id.parisTime);
        Calendar parisCal = Calendar.getInstance();
        DateFormat parisDate = new SimpleDateFormat("h:mm a");
        parisDate.setTimeZone(TimeZone.getTimeZone("GMT+02:00"));
        String parisString = parisDate.format(parisCal.getTime());
        paris.setText(parisString);

        TextView moscow = findViewById(R.id.moscowTime);
        Calendar mosCal = Calendar.getInstance();
        DateFormat mosDate = new SimpleDateFormat("h:mm a");
        mosDate.setTimeZone(TimeZone.getTimeZone("GMT+03:00"));
        String mosString = mosDate.format(mosCal.getTime());
        moscow.setText(mosString);
    }

    public void buttonRespond2(View view) {

        Calendar sydCal = Calendar.getInstance();
        DateFormat sydDate = new SimpleDateFormat("HH:mm");
        String sydString = sydDate.format(sydCal.getTime());
        TextView sydney = findViewById(R.id.sydneyTime);
        sydney.setText(sydString);

        TextView newYork = findViewById(R.id.newYorkTime);
        Calendar nyCal = Calendar.getInstance();
        DateFormat nyDate = new SimpleDateFormat("HH:mm");
        nyDate.setTimeZone(TimeZone .getTimeZone("GMT-04:00"));
        String nyString = nyDate.format(nyCal.getTime());
        newYork.setText(nyString);

        TextView tokyo = findViewById(R.id.tokyoTime);
        Calendar tokyoCal = Calendar.getInstance();
        DateFormat tokyoDate = new SimpleDateFormat("HH:mm");
        tokyoDate.setTimeZone(TimeZone.getTimeZone("GMT+09:00"));
        String tokyoString = tokyoDate.format(tokyoCal.getTime());
        tokyo.setText(tokyoString);

        TextView paris = findViewById(R.id.parisTime);
        Calendar parisCal = Calendar.getInstance();
        DateFormat parisDate = new SimpleDateFormat("HH:mm");
        parisDate.setTimeZone(TimeZone.getTimeZone("GMT+02:00"));
        String parisString = parisDate.format(parisCal.getTime());
        paris.setText(parisString);

        TextView moscow = findViewById(R.id.moscowTime);
        Calendar mosCal = Calendar.getInstance();
        DateFormat mosDate = new SimpleDateFormat("HH:mm");
        mosDate.setTimeZone(TimeZone.getTimeZone("GMT+03:00"));
        String mosString = mosDate.format(mosCal.getTime());
        moscow.setText(mosString);
    }


    public void testingTimeZones(View view) {
        TextView tv = findViewById(R.id.newYorkTime);
        TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
        String time_str = tz.getDisplayName();
        tv.setText(time_str);
    }

    public void setTimeZone(String timeZone) {

    }

    public void testingTimeZones2(View view) {
        TextView tv = findViewById(R.id.newYorkTime);
        setTimeZone("America/Los_Angles");
        String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());
        tv.setText(currentDateTimeString);
    }


}
