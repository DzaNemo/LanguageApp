package link.languageapp.Russia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import link.languageapp.R;

public class ColorsRusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<RussianWord> russianWords = new ArrayList<>();

        russianWords.add(new RussianWord("bijela","белый"));
        russianWords.add(new RussianWord("crvena","красный"));
        russianWords.add(new RussianWord("crna","чёрный"));
        russianWords.add(new RussianWord("žuta","жёлтый"));
        russianWords.add(new RussianWord("plava","синий"));
        russianWords.add(new RussianWord("zelena","зелёный"));
        russianWords.add(new RussianWord("narandžasta","оранжевый"));
        russianWords.add(new RussianWord("ljubičasta","фиолетовый"));
        russianWords.add(new RussianWord("smeđa","коричневый"));

        RussianWordAdapter russianWordAdapter = new RussianWordAdapter(this,russianWords,R.color.category_colors);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(russianWordAdapter);
    }
}
