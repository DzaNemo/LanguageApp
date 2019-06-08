package link.languageapp.Germany;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import link.languageapp.France.FrenchWord;
import link.languageapp.France.FrenchWordArdapter;
import link.languageapp.R;

public class FarbenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<GermanWord> germanWords = new ArrayList<GermanWord>();
        //germanWords.add("one");
        germanWords.add(new GermanWord("bijela","weiß"));
        germanWords.add(new GermanWord("crvena","rot"));
        germanWords.add(new GermanWord("crna","schwarz"));
        germanWords.add(new GermanWord("žuta","gelb"));
        germanWords.add(new GermanWord("plava","blau"));
        germanWords.add(new GermanWord("zelena","grün"));
        germanWords.add(new GermanWord("narandžasta","orange"));
        germanWords.add(new GermanWord("ljubičasta","lila"));
        germanWords.add(new GermanWord("smeđa","braun"));

        /*
        moglo se uraditi i na ovaj nacin ali je gornji primjer mnogo bolji
        Word word = new Word("lutti","one");
        germanWords.add(word);
         */


        GermanWordAdapter adapterGerman = new GermanWordAdapter(this,germanWords,R.color.category_colors);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapterGerman);
    }
}
