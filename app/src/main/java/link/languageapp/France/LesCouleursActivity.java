package link.languageapp.France;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import link.languageapp.R;

public class LesCouleursActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<FrenchWord> frenchWords = new ArrayList<FrenchWord>();
        //words.add("one");
        frenchWords.add(new FrenchWord("bijela","blanc"));
        frenchWords.add(new FrenchWord("crvena","rouge"));
        frenchWords.add(new FrenchWord("crna","noir"));
        frenchWords.add(new FrenchWord("žuta","jaune"));
        frenchWords.add(new FrenchWord("plava","bleu"));
        frenchWords.add(new FrenchWord("zelena","vert"));
        frenchWords.add(new FrenchWord("narandžasta","orange"));
        frenchWords.add(new FrenchWord("ljubičasta","violet"));
        frenchWords.add(new FrenchWord("smeđa","marron"));

        /*
        moglo se uraditi i na ovaj nacin ali je gornji primjer mnogo bolji
        Word word = new Word("lutti","one");
        words.add(word);
         */


        FrenchWordArdapter adapterFrench = new FrenchWordArdapter(this,frenchWords,R.color.category_colors);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapterFrench);
    }
}
