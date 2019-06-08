package link.languageapp.Germany;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import link.languageapp.France.FrenchWord;
import link.languageapp.France.FrenchWordArdapter;
import link.languageapp.R;

public class ZahlenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<GermanWord> germanWords = new ArrayList<GermanWord>();
        //germanWords.add("one");
        germanWords.add(new GermanWord("jedan","eins"));
        germanWords.add(new GermanWord("dva","zwei"));
        germanWords.add(new GermanWord("tri","drei"));
        germanWords.add(new GermanWord("četiri","vier "));
        germanWords.add(new GermanWord("pet","fünf "));
        germanWords.add(new GermanWord("šest","sechs "));
        germanWords.add(new GermanWord("sedam","sieben"));
        germanWords.add(new GermanWord("osam","acht "));
        germanWords.add(new GermanWord("devet","neun"));
        germanWords.add(new GermanWord("deset","zehn "));

        /*
        moglo se uraditi i na ovaj nacin ali je gornji primjer mnogo bolji
        Word word = new Word("lutti","one");
        germanWords.add(word);
         */


       GermanWordAdapter adapterGerman = new GermanWordAdapter(this,germanWords,R.color.category_numbers);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapterGerman);
    }
}
