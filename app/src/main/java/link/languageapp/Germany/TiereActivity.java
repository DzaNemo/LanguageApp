package link.languageapp.Germany;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import link.languageapp.R;

public class TiereActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<GermanWord> germanWords = new ArrayList<GermanWord>();

        germanWords.add(new GermanWord("pas","hund"));
        germanWords.add(new GermanWord("mačka","katze"));
        germanWords.add(new GermanWord("krava","kuh"));
        germanWords.add(new GermanWord("konj","pferd"));
        germanWords.add(new GermanWord("lav","löwe"));
        germanWords.add(new GermanWord("tigar","tiger"));
        germanWords.add(new GermanWord("slon","elefant"));
        germanWords.add(new GermanWord("medvjed","bär"));
        germanWords.add(new GermanWord("orao","adler"));
        germanWords.add(new GermanWord("delfin","delphin"));
        germanWords.add(new GermanWord("riba","fisch"));
        germanWords.add(new GermanWord("pingvin","pinguin"));

        /*
        moglo se uraditi i na ovaj nacin ali je gornji primjer mnogo bolji
        Word word = new Word("lutti","one");
        germanWords.add(word);
         */


        GermanWordAdapter adapterGerman = new GermanWordAdapter(this,germanWords,R.color.category_animals);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapterGerman);
    }
}
