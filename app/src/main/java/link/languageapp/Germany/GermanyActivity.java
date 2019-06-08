package link.languageapp.Germany;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import link.languageapp.R;

public class GermanyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_germany);

        TextView zahlenTextView = findViewById(R.id.zahlen);
        zahlenTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent zahlenIntent = new Intent(GermanyActivity.this,ZahlenActivity.class);
                startActivity(zahlenIntent);
            }
        });

        TextView dieFamilietextView = findViewById(R.id.die_familie);
        dieFamilietextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent diefamilieIintent = new Intent(GermanyActivity.this,DieFamilieActivity.class);
                startActivity(diefamilieIintent);
            }
        });

        TextView farbenTextView = findViewById(R.id.farben);
        farbenTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent farbenIntent = new Intent(GermanyActivity.this,FarbenActivity.class);
                startActivity(farbenIntent);
            }
        });

        TextView tiereTextView = findViewById(R.id.tiere);
        tiereTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tiereIntent = new Intent(GermanyActivity.this,TiereActivity.class);
                startActivity(tiereIntent);
            }
        });

        TextView diePhraseTextView = findViewById(R.id.die_phrase);
        diePhraseTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent diePhraseIntent = new Intent(GermanyActivity.this,DiePhraseActivity.class);
                startActivity(diePhraseIntent);
            }
        });
    }
}
