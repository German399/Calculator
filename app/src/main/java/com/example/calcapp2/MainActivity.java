package com.example.calcapp2;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Plus(View view) {

        int a = 0;
        int b = 0;

        try {
            a = Integer.parseInt( ((EditText)
                    findViewById(R.id.arg1)).getText().toString());
            b = Integer.parseInt( ((EditText)
                    findViewById(R.id.arg2)).getText().toString());


        }     catch (Exception e) {
            TextView result = (TextView) findViewById(R.id.answer);
            String h = "Input Error";
            result.setText(String.valueOf(h));
            return;
        }

        double a1 = a - ((int)a);
        double b1 = b - ((int)b);

        TextView result = (TextView) findViewById(R.id.answer);



        if  (((a1 != 0) || (b1 != 0)) || (b == 0)) {
            String h = "Input Error";
            result.setText(String.valueOf(h));

        }

        else  {
            int S = a + b;
            result.setText(String.valueOf(S));


        }
    }


    public void Sub (View view) {


        int a = 0;
        int b = 0;

        try {
            a = Integer.parseInt( ((EditText)
                    findViewById(R.id.arg1)).getText().toString());
            b = Integer.parseInt( ((EditText)
                    findViewById(R.id.arg2)).getText().toString());


        }     catch (Exception e) {
            TextView result = (TextView) findViewById(R.id.answer);
            String h = "Input Error";
            result.setText(String.valueOf(h));
            return;
        }

        double a1 = a - ((int)a);
        double b1 = b - ((int)b);

        TextView result = (TextView) findViewById(R.id.answer);



        if  (((a1 != 0) || (b1 != 0)) || (b == 0)) {
            String h = "Input Error";
            result.setText(String.valueOf(h));

        }

        else  {
            int S = a - b;
            result.setText(String.valueOf(S));


        }
    }


    public void Multi (View view) {
        int a = 0;
        int b = 0;

        try {
            a = Integer.parseInt( ((EditText)
                    findViewById(R.id.arg1)).getText().toString());
            b = Integer.parseInt( ((EditText)
                    findViewById(R.id.arg2)).getText().toString());


        }     catch (Exception e) {
            TextView result = (TextView) findViewById(R.id.answer);
            String h = "Input Error";
            result.setText(String.valueOf(h));
            return;
        }

        double a1 = a - ((int)a);
        double b1 = b - ((int)b);

        TextView result = (TextView) findViewById(R.id.answer);



        if  (((a1 != 0) || (b1 != 0)) || (b == 0)) {
            String h = "Input Error";
            result.setText(String.valueOf(h));

        }

        else  {
            int S = a * b;
            result.setText(String.valueOf(S));


        }


    }


    public void Division (View view)  {
        boolean D = true;
        boolean E = true;

        int a = 0;
        int b = 0;

        try {
            a = Integer.parseInt( ((EditText)
                    findViewById(R.id.arg1)).getText().toString());
            b = Integer.parseInt( ((EditText)
                    findViewById(R.id.arg2)).getText().toString());


        }     catch (Exception e) {
            TextView result = (TextView) findViewById(R.id.answer);
            String h = "Input Error";
            result.setText(String.valueOf(h));
            return;
        }

        double a1 = a - ((int)a);
        double b1 = b - ((int)b);

        TextView result = (TextView) findViewById(R.id.answer);



        if  (((a1 != 0) || (b1 != 0))) {
            String h = "Input Error";
            result.setText(String.valueOf(h));

        }


        else if (b == 0) {
            String I = "Div by zero";
            result.setText(String.valueOf(I));
            D = false;
        }



        else  {
            int S = a / b;
            result.setText(String.valueOf(S));


        }
    }


}




