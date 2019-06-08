package link.languageapp.Italy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import link.languageapp.R;

public class ItalianActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian);

        TextView numeriTextView = findViewById(R.id.numeri);
        numeriTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numeriIntent = new Intent(ItalianActivity.this,NumeriActivity.class);
                startActivity(numeriIntent);
            }
        });

        TextView famigliaTextView = findViewById(R.id.famiglia);
        famigliaTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent famigliaIntent = new Intent(ItalianActivity.this,FamigliaActivity.class);
                startActivity(famigliaIntent);
            }
        });

        TextView coloreTextView = findViewById(R.id.colore);
        coloreTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent coloreIntent = new Intent(ItalianActivity.this,ColoreActivity.class);
                startActivity(coloreIntent);
            }
        });

        TextView animaliTextView = findViewById(R.id.animali);
        animaliTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent animaliIntent = new Intent(ItalianActivity.this,AnimaliActivity.class);
                startActivity(animaliIntent);
            }
        });

        TextView frasiTextView = findViewById(R.id.frasi);
        frasiTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent frasiIntent = new Intent(ItalianActivity.this,FrasiActivity.class);
                startActivity(frasiIntent);
            }
        });
    }
}
