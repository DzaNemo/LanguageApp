package link.languageapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import link.languageapp.English.EnglishActivity;
import link.languageapp.France.FrenchActiivity;
import link.languageapp.Germany.GermanyActivity;
import link.languageapp.Italy.ItalianActivity;
import link.languageapp.Russia.RussianActivity;
import link.languageapp.Spain.SpanishActivity;

public class ChooseLanguageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_language);

        TextView chooseEnglish = findViewById(R.id.english_language);
        chooseEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent englishIntent = new Intent(ChooseLanguageActivity.this, EnglishActivity.class);
                startActivity(englishIntent);
            }
        });

        TextView chooseFrench = findViewById(R.id.french_language);
        chooseFrench.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent frenchIntent = new Intent(ChooseLanguageActivity.this, FrenchActiivity.class);
                startActivity(frenchIntent);
            }
        });

        TextView chooseGerman = findViewById(R.id.germany_language);
        chooseGerman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent germanIntent = new Intent(ChooseLanguageActivity.this, GermanyActivity.class);
                startActivity(germanIntent);
            }
        });

        TextView chooseSpanish = findViewById(R.id.spain_language);
        chooseSpanish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent spanishIntent = new Intent(ChooseLanguageActivity.this, SpanishActivity.class);
                startActivity(spanishIntent);
            }
        });

        TextView chooseItalian = findViewById(R.id.italy_language);
        chooseItalian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent italianIntent = new Intent(ChooseLanguageActivity.this, ItalianActivity.class);
                startActivity(italianIntent);
            }
        });

        TextView chooseRussian = findViewById(R.id.russia_language);
        chooseRussian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent russianIntent = new Intent(ChooseLanguageActivity.this, RussianActivity.class);
                startActivity(russianIntent);
            }
        });
    }
}
