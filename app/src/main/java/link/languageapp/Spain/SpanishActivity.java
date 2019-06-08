package link.languageapp.Spain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import link.languageapp.R;

public class SpanishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spanish);

        TextView numerosActivity = findViewById(R.id.números);
        numerosActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent spanishIntent = new Intent(SpanishActivity.this,NumerosActivity.class);
                startActivity(spanishIntent);
            }
        });

        TextView familiaActivity = findViewById(R.id.familia);
        familiaActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent spanishIntent = new Intent(SpanishActivity.this,FamiliaActivity.class);
                startActivity(spanishIntent);
            }
        });

        TextView coloresActivity = findViewById(R.id.colores);
        coloresActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent spanishIntent = new Intent(SpanishActivity.this,ColoresActivity.class);
                startActivity(spanishIntent);
            }
        });

        TextView animalesTextView= findViewById(R.id.animales);
        animalesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent animalesIntent = new Intent(SpanishActivity.this,AnimalesActivity.class);
                startActivity(animalesIntent);
            }
        });

        TextView frasesActivity = findViewById(R.id.frases);
        frasesActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent spanishIntent = new Intent(SpanishActivity.this,FrasesActivity.class);
                startActivity(spanishIntent);
            }
        });

    }
}
