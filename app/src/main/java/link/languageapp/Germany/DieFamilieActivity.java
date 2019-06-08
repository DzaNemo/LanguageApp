package link.languageapp.Germany;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import link.languageapp.France.FrenchWord;
import link.languageapp.France.FrenchWordArdapter;
import link.languageapp.R;

public class DieFamilieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<GermanWord> germanWords = new ArrayList<GermanWord>();
        //germanWords.add("one");
        germanWords.add(new GermanWord("otac","der vater"));
        germanWords.add(new GermanWord("majka","die mutter"));
        germanWords.add(new GermanWord("sin","der sohn"));
        germanWords.add(new GermanWord("kćerka","die tochter"));
        germanWords.add(new GermanWord("brat","der bruder"));
        germanWords.add(new GermanWord("sestra","die schwester "));
        germanWords.add(new GermanWord("deda","der großvater "));
        germanWords.add(new GermanWord("baba","die großmutter"));

        /*
        moglo se uraditi i na ovaj nacin ali je gornji primjer mnogo bolji
        Word word = new Word("lutti","one");
        germanWords.add(word);
         */


        GermanWordAdapter adapterGerman = new GermanWordAdapter(this,germanWords,R.color.category_family);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapterGerman);
    }
}
