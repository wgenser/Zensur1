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

        // Buttons und Methoden verknÃ¼pfen
        OkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Zahl Ã¼bernehmen

                String Txt = Eingabe1.getText().toString();

                                // Zahl auswerten
                try {
                    int Zensur = Integer.valueOf(Txt);
                    switch (Zensur) {
                        case 1:
                            Anzeige1.setText(R.string.Sehr_gut);
                            break;
                        case 2:
                            Anzeige1.setText(R.string.Gut);
                            break;
                        case 3:
                            Anzeige1.setText(R.string.Befriedigend);
                            break;
                        case 4:
                            Anzeige1.setText(R.string.Ausreichend);
                            break;
                        case 5:
                            Anzeige1.setText(R.string.Mangelhaft);
                            break;
                        case 6:
                            Anzeige1.setText(R.string.Ungenuegend);
                            break;
                        default:
                            Anzeige1.setText(R.string.Unsinn);
                    }
                }catch (Exception e) {
                    Anzeige1.setText(R.string.Unsinn);
                }
                            }
        });

    }
}
