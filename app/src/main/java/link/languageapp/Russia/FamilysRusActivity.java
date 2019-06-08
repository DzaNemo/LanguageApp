package link.languageapp.Russia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import link.languageapp.R;

public class FamilysRusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<RussianWord> russianWords = new ArrayList<>();

        russianWords.add(new RussianWord("otac","отец"));
        russianWords.add(new RussianWord("majka","мать"));
        russianWords.add(new RussianWord("sin","сын"));
        russianWords.add(new RussianWord("kćerka","дочь"));
        russianWords.add(new RussianWord("brat","брат"));
        russianWords.add(new RussianWord("sestra","сестра"));
        russianWords.add(new RussianWord("deda","дед"));
        russianWords.add(new RussianWord("baba","бабушка"));

        RussianWordAdapter russianWordAdapter = new RussianWordAdapter(this,russianWords,R.color.category_family);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(russianWordAdapter);
    }
}
