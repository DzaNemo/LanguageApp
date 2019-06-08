package link.languageapp.France;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import link.languageapp.R;

public class DesChiffresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<FrenchWord> frenchWords = new ArrayList<FrenchWord>();
        //words.add("one");
        frenchWords.add(new FrenchWord("jedan","un"));
        frenchWords.add(new FrenchWord("dva","deux"));
        frenchWords.add(new FrenchWord("tri","trois"));
        frenchWords.add(new FrenchWord("četiri","quatre"));
        frenchWords.add(new FrenchWord("pet","cinq"));
        frenchWords.add(new FrenchWord("šest","six"));
        frenchWords.add(new FrenchWord("sedam","sept"));
        frenchWords.add(new FrenchWord("osam","huit"));
        frenchWords.add(new FrenchWord("devet","neuf"));
        frenchWords.add(new FrenchWord("deset","dix"));

        /*
        moglo se uraditi i na ovaj nacin ali je gornji primjer mnogo bolji
        Word word = new Word("lutti","one");
        words.add(word);
         */


        FrenchWordArdapter adapterFrench = new FrenchWordArdapter(this,frenchWords,R.color.category_numbers);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapterFrench);

    }
}
