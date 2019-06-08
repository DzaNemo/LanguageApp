package link.languageapp.English;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import link.languageapp.R;


public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<EnglishWord> englishWords = new ArrayList<>();

        englishWords.add(new EnglishWord("jedan","one"));
        englishWords.add(new EnglishWord("dva","two"));
        englishWords.add(new EnglishWord("tri","three"));
        englishWords.add(new EnglishWord("četiri","four"));
        englishWords.add(new EnglishWord("pet","five"));
        englishWords.add(new EnglishWord("šest","six"));
        englishWords.add(new EnglishWord("sedam","seven"));
        englishWords.add(new EnglishWord("osam","eight"));
        englishWords.add(new EnglishWord("devet","nine"));
        englishWords.add(new EnglishWord("deset","ten"));

        EnglishWordAdapter englishWordAdapter = new EnglishWordAdapter(this,englishWords,R.color.category_numbers);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(englishWordAdapter);
    }
}
