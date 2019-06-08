package link.languageapp.Germany;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import link.languageapp.France.FrenchWord;
import link.languageapp.France.FrenchWordArdapter;
import link.languageapp.R;

public class DiePhraseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<GermanWord> germanWords = new ArrayList<GermanWord>();
        //germanWords.add("one");
        germanWords.add(new GermanWord("Dobar dan","Guten Tag"));
        germanWords.add(new GermanWord("Zovem se...","Ich heiße ..."));
        germanWords.add(new GermanWord("Kako ste?","Wie geht es dir"));
        germanWords.add(new GermanWord("Hvala","Danke schön"));
        germanWords.add(new GermanWord("Ne znam","Ich weiß nicht"));
        germanWords.add(new GermanWord("Oprostite","Entschuldigen sie bitte"));
        germanWords.add(new GermanWord("Govorite li njemački?","Sprechen sie Deutsch?"));
        germanWords.add(new GermanWord("Molim Vas","bitte"));
        germanWords.add(new GermanWord("Gdje si?","Wo bist du?"));

        /*
        moglo se uraditi i na ovaj nacin ali je gornji primjer mnogo bolji
        Word word = new Word("lutti","one");
        germanWords.add(word);
         */


        GermanWordAdapter adapterGerman = new GermanWordAdapter(this,germanWords,R.color.category_phrases);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapterGerman);
    }
}
