package com.example.myapplication;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.Gravity;
import android.view.View;
import android.widget.GridLayout;
import android.widget.TextView;
import android.view.ViewGroup;

import static android.view.ViewGroup.LayoutParams.FILL_PARENT;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        GridLayout root = new GridLayout(this);
        ViewGroup.LayoutParams rParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );

        root.setLayoutParams(rParams);
        root.setOrientation(GridLayout.VERTICAL);
        root.setBackgroundColor(Color.WHITE);
        root.setColumnCount(6);
        root.setRowCount(11);

        // First row
        TextView tv = new TextView(this);
        tv.setText("Rules void hello1(int hour)");
        tv.setTextSize(11);
        tv.setTextColor(Color.WHITE);
        tv.setBackgroundColor(Color.BLACK);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);


        GridLayout.Spec row_spec = GridLayout.spec(0,1);
        GridLayout.Spec col_spec = GridLayout.spec(0, 6,1);
        GridLayout.LayoutParams cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        //Second row
        tv = new TextView(this);
        tv.setText("properties");
        tv.setTextSize(11);
        tv.setBackgroundColor(Color.WHITE);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);


        row_spec = GridLayout.spec(1,2,GridLayout.CENTER,1);
        col_spec = GridLayout.spec(0, 1,GridLayout.CENTER);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("name");
        tv.setTextSize(11);
        tv.setBackgroundColor(Color.WHITE);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);


        row_spec = GridLayout.spec(1,1);
        col_spec = GridLayout.spec(1, 2, GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("Day Hour Classification");
        tv.setTextSize(11);
        tv.setBackgroundColor(Color.WHITE);


        row_spec = GridLayout.spec(1,1);
        col_spec = GridLayout.spec(3, 2);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        // Row 3
        tv = new TextView(this);
        tv.setText("category");
        tv.setTextSize(11);
        tv.setBackgroundColor(Color.WHITE);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);


        row_spec = GridLayout.spec(2,1);
        col_spec = GridLayout.spec(1, 2,GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("Day and Time");
        tv.setTextSize(11);
        tv.setBackgroundColor(Color.WHITE);

        row_spec = GridLayout.spec(2,1);
        col_spec = GridLayout.spec(3, 2);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        //Row 4
        tv = new TextView(this);
        tv.setText("Rule");
        tv.setTextSize(11);
        tv.setBackgroundColor(Color.CYAN);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setTypeface(Typeface.DEFAULT_BOLD);


        row_spec = GridLayout.spec(3,3,GridLayout.FILL,1);
        col_spec = GridLayout.spec(0, 1, GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("C1");
        tv.setTextSize(11);
        tv.setBackgroundColor(Color.CYAN);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setTypeface(Typeface.DEFAULT_BOLD);

        row_spec = GridLayout.spec(3,1);
        col_spec = GridLayout.spec(1, 2,GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("A1");
        tv.setTextSize(11);
        tv.setBackgroundColor(Color.CYAN);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setTypeface(Typeface.DEFAULT_BOLD);

        row_spec = GridLayout.spec(3,1);
        col_spec = GridLayout.spec(3, 2,GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        //Row 5
        tv = new TextView(this);
        tv.setText("min <= hour && hour <= max");
        tv.setTextSize(11);
        tv.setBackgroundColor(Color.CYAN);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);


        row_spec = GridLayout.spec(4,1);
        col_spec = GridLayout.spec(1, 2);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("System.out.println(greeting + " + '"' + ", World!" + '"' + ")");
        tv.setTextSize(10);
        tv.setBackgroundColor(Color.CYAN);


        row_spec = GridLayout.spec(4,1);
        col_spec = GridLayout.spec(3, 2);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        //Row 6
        tv = new TextView(this);
        tv.setText("int min");
        tv.setTextSize(11);
        tv.setBackgroundColor(Color.CYAN);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);


        row_spec = GridLayout.spec(5,1);
        col_spec = GridLayout.spec(1, 1,GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("int max");
        tv.setTextSize(11);
        tv.setBackgroundColor(Color.CYAN);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        row_spec = GridLayout.spec(5,1);
        col_spec = GridLayout.spec(2, 1,GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("String greeting");
        tv.setTextSize(11);
        tv.setBackgroundColor(Color.CYAN);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);


        row_spec = GridLayout.spec(5,1);
        col_spec = GridLayout.spec(3, 2,GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        //Row 7
        tv = new TextView(this);
        tv.setText("Rule");
        tv.setTextSize(11);
        tv.setBackgroundColor(Color.WHITE);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setTypeface(Typeface.DEFAULT_BOLD);

        row_spec = GridLayout.spec(6,1);
        col_spec = GridLayout.spec(0, 1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("From");
        tv.setTextSize(11);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setTypeface(Typeface.DEFAULT_BOLD);

        row_spec = GridLayout.spec(6,1);
        col_spec = GridLayout.spec(1, 1,GridLayout.FILL,1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("To");
        tv.setTextSize(11);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setTypeface(Typeface.DEFAULT_BOLD);

        row_spec = GridLayout.spec(6,1);
        col_spec = GridLayout.spec(2, 1,GridLayout.FILL,1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("Greeting");
        tv.setTextSize(11);
        tv.setBackgroundColor(Color.rgb(242, 157, 39));
        tv.setTypeface(Typeface.DEFAULT_BOLD);

        row_spec = GridLayout.spec(6,1);
        col_spec = GridLayout.spec(3, 2,GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        //Row 8
        tv = new TextView(this);
        tv.setText("R10");
        tv.setTextSize(11);
        tv.setBackgroundColor(Color.WHITE);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);


        row_spec = GridLayout.spec(7,1);
        col_spec = GridLayout.spec(0, 1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("0");
        tv.setTextSize(11);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_VIEW_END);

        row_spec = GridLayout.spec(7,1);
        col_spec = GridLayout.spec(1, 1,GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("11");
        tv.setTextSize(11);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_VIEW_END);

        row_spec = GridLayout.spec(7,1);
        col_spec = GridLayout.spec(2, 1,GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Morning");
        tv.setTextSize(11);
        tv.setBackgroundColor(Color.rgb(242, 157, 39));


        row_spec = GridLayout.spec(7,1);
        col_spec = GridLayout.spec(3, 2,GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        //Row 9
        tv = new TextView(this);
        tv.setText("R20");
        tv.setTextSize(11);
        tv.setBackgroundColor(Color.WHITE);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);


        row_spec = GridLayout.spec(8,1);
        col_spec = GridLayout.spec(0, 1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("12");
        tv.setTextSize(11);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_VIEW_END);

        row_spec = GridLayout.spec(8,1);
        col_spec = GridLayout.spec(1, 1,GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("17");
        tv.setTextSize(11);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_VIEW_END);

        row_spec = GridLayout.spec(8,1);
        col_spec = GridLayout.spec(2, 1,GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Afternoon");
        tv.setTextSize(11);
        tv.setBackgroundColor(Color.rgb(242, 157, 39));


        row_spec = GridLayout.spec(8,1);
        col_spec = GridLayout.spec(3, 2,GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        //Row 10
        tv = new TextView(this);
        tv.setText("R30");
        tv.setTextSize(11);
        tv.setBackgroundColor(Color.WHITE);


        row_spec = GridLayout.spec(9,1);
        col_spec = GridLayout.spec(0, 1,GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("18");
        tv.setTextSize(11);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_VIEW_END);

        row_spec = GridLayout.spec(9,1);
        col_spec = GridLayout.spec(1, 1,GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("21");
        tv.setTextSize(11);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_VIEW_END);

        row_spec = GridLayout.spec(9,1);
        col_spec = GridLayout.spec(2, 1,GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Evening");
        tv.setTextSize(11);
        tv.setBackgroundColor(Color.rgb(242, 157, 39));


        row_spec = GridLayout.spec(9,1);
        col_spec = GridLayout.spec(3, 2,GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        //Row 11
        tv = new TextView(this);
        tv.setText("R40");
        tv.setTextSize(11);
        tv.setBackgroundColor(Color.WHITE);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);


        row_spec = GridLayout.spec(10,1);
        col_spec = GridLayout.spec(0, 1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("22");
        tv.setTextSize(11);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_VIEW_END);

        row_spec = GridLayout.spec(10,1);
        col_spec = GridLayout.spec(1, 1,GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("23");
        tv.setTextSize(11);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_VIEW_END);

        row_spec = GridLayout.spec(10,1);
        col_spec = GridLayout.spec(2, 1,GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Night");
        tv.setTextSize(11);
        tv.setBackgroundColor(Color.rgb(242, 157, 39));

        row_spec = GridLayout.spec(10,1);
        col_spec = GridLayout.spec(3, 2,GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10, 10, 10, 10);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        setContentView(root);
    }
}
