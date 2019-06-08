package link.languageapp.France;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import link.languageapp.R;

public class LaFamilleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<FrenchWord> frenchWords = new ArrayList<FrenchWord>();
        //words.add("one");
        frenchWords.add(new FrenchWord("otac","le père"));
        frenchWords.add(new FrenchWord("majka","la mère"));
        frenchWords.add(new FrenchWord("sin","le fils"));
        frenchWords.add(new FrenchWord("kćerka","la fille"));
        frenchWords.add(new FrenchWord("brat","frère"));
        frenchWords.add(new FrenchWord("sestra","soeur"));
        frenchWords.add(new FrenchWord("deda","le grand-père "));
        frenchWords.add(new FrenchWord("baba","la grand-mère "));

        /*
        moglo se uraditi i na ovaj nacin ali je gornji primjer mnogo bolji
        Word word = new Word("lutti","one");
        words.add(word);
         */


        FrenchWordArdapter adapterFrench = new FrenchWordArdapter(this,frenchWords,R.color.category_family);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapterFrench);
    }
}
