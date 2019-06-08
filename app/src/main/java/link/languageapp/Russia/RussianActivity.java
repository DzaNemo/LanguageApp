package link.languageapp.Russia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import link.languageapp.R;

public class RussianActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_russian);

        TextView russianNumTextView = findViewById(R.id.numbers_rus);
        russianNumTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent russianIntent = new Intent(RussianActivity.this,NumbersRusActivity.class);
                startActivity(russianIntent);
            }
        });

        TextView russianFamilyTextView = findViewById(R.id.family_rus);
        russianFamilyTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent russianIntent = new Intent(RussianActivity.this,FamilysRusActivity.class);
                startActivity(russianIntent);
            }
        });

        TextView russianColorsTextView = findViewById(R.id.colors_rus);
        russianColorsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent russianIntent = new Intent(RussianActivity.this,ColorsRusActivity.class);
                startActivity(russianIntent);
            }
        });

        final TextView animalsRusTextView = findViewById(R.id.animals_rus);
        animalsRusTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent animalsRusIntent = new Intent(RussianActivity.this,AnimalsRusActivity.class);
                startActivity(animalsRusIntent);
            }
        });

        TextView russianPhrasesTextView = findViewById(R.id.phrases_rus);
        russianPhrasesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent russianIntent = new Intent(RussianActivity.this,PhrasesRusActivity.class);
                startActivity(russianIntent);
            }
        });
    }
}
