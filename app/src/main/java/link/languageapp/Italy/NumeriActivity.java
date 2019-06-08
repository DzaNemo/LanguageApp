package link.languageapp.Italy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import link.languageapp.R;

public class NumeriActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<ItalianWord> italianWords = new ArrayList<>();

        italianWords.add(new ItalianWord("jedan","uno"));
        italianWords.add(new ItalianWord("dva","due"));
        italianWords.add(new ItalianWord("tri","tre"));
        italianWords.add(new ItalianWord("četiri","quattro"));
        italianWords.add(new ItalianWord("pet","cinque"));
        italianWords.add(new ItalianWord("šest","sei"));
        italianWords.add(new ItalianWord("sedam","sette"));
        italianWords.add(new ItalianWord("osam","otto"));
        italianWords.add(new ItalianWord("devet","nove"));
        italianWords.add(new ItalianWord("deset","dieci"));

        ItalianWordAdapter italianWordAdapter = new ItalianWordAdapter(this,italianWords,R.color.category_numbers);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(italianWordAdapter);

    }
}
