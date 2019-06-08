package link.languageapp.France;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import link.languageapp.R;

public class FrenchActiivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_french_actiivity);

        TextView desChiffresTextView = findViewById(R.id.des_chiffres);
        desChiffresTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent desChiffresIntent = new Intent(FrenchActiivity.this,DesChiffresActivity.class);
                startActivity(desChiffresIntent);
            }
        });

        TextView laFamilleTextView = findViewById(R.id.la_famille);
        laFamilleTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent laFamilleIntent = new Intent(FrenchActiivity.this,LaFamilleActivity.class);
                startActivity(laFamilleIntent);
            }
        });

        TextView lesCouleursTextView = findViewById(R.id.les_couleurs);
        lesCouleursTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lesCouleursIntent = new Intent(FrenchActiivity.this,LesCouleursActivity.class);
                startActivity(lesCouleursIntent);
            }
        });

        TextView lesAnimauxTextView = findViewById(R.id.les_animaux);
        lesAnimauxTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lesAnimauxIntent = new Intent(FrenchActiivity.this,LesAnimauxActivity.class);
                startActivity(lesAnimauxIntent);
            }
        });

        TextView desPhrasesTextView = findViewById(R.id.des_phrases);
        desPhrasesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent desPhrasesIntentr = new Intent(FrenchActiivity.this,DesPhrasesActivity.class);
                startActivity(desPhrasesIntentr);
            }
        });
    }
}
