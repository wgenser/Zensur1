package com.example.david_genser.zensur1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TextView/EditText-Variablen erzeugen
        final TextView Anzeige1 =
                (TextView) findViewById(R.id.textView);

        final EditText Eingabe1 =
                (EditText) findViewById(R.id.editText);

        //Button-Variablen erzeugen
        Button OkButton = (Button) findViewById(R.id.button);

    }
}
