package link.languageapp.English;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

import link.languageapp.R;

public class EnglishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);

        TextView numbersTextView = findViewById(R.id.numbers);
        numbersTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(EnglishActivity.this,NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });

        TextView familyTextView = findViewById(R.id.family);
        familyTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(EnglishActivity.this,FamilyActivity.class);
                startActivity(familyIntent);
            }
        });

        TextView colorsTextView = findViewById(R.id.colors);
        colorsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(EnglishActivity.this,ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });

        TextView animalsTextView = findViewById(R.id.animals);
        animalsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent animalsIntent = new Intent(EnglishActivity.this,AnimalsActivity.class);
                startActivity(animalsIntent);
            }
        });


        TextView phrasesTextView = findViewById(R.id.phrases);
        phrasesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(EnglishActivity.this,PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });

    }
}
