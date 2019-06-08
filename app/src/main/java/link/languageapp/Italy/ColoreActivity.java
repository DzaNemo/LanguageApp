package link.languageapp.Italy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import link.languageapp.R;

public class ColoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<ItalianWord> italianWords = new ArrayList<>();

        italianWords.add(new ItalianWord("bijela","bianco"));
        italianWords.add(new ItalianWord("crvena","rosso"));
        italianWords.add(new ItalianWord("crna","nero"));
        italianWords.add(new ItalianWord("žuta","giallo"));
        italianWords.add(new ItalianWord("plava","blu"));
        italianWords.add(new ItalianWord("zelena","verde"));
        italianWords.add(new ItalianWord("narandžasta","arancione"));
        italianWords.add(new ItalianWord("ljubičasta","viola"));
        italianWords.add(new ItalianWord("smeđa","marrone"));

        ItalianWordAdapter italianWordAdapter = new ItalianWordAdapter(this,italianWords,R.color.category_colors);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(italianWordAdapter);
    }
}
