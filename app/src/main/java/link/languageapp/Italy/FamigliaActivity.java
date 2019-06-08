package link.languageapp.Italy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import link.languageapp.R;

public class FamigliaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<ItalianWord> italianWords = new ArrayList<>();

        italianWords.add(new ItalianWord("otac","padre"));
        italianWords.add(new ItalianWord("majka","madre"));
        italianWords.add(new ItalianWord("sin","figlio"));
        italianWords.add(new ItalianWord("kćerka","figlia"));
        italianWords.add(new ItalianWord("brat","frattelo"));
        italianWords.add(new ItalianWord("sestra","sorella"));
        italianWords.add(new ItalianWord("deda","nonno"));
        italianWords.add(new ItalianWord("baba","nonna"));

        ItalianWordAdapter italianWordAdapter = new ItalianWordAdapter(this,italianWords,R.color.category_family);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(italianWordAdapter);
    }

}
