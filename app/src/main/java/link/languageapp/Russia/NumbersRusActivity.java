package link.languageapp.Russia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import link.languageapp.R;

public class NumbersRusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<RussianWord> russianWords = new ArrayList<>();

        russianWords.add(new RussianWord("jedan","один"));
        russianWords.add(new RussianWord("dva","два"));
        russianWords.add(new RussianWord("tri","три"));
        russianWords.add(new RussianWord("četiri","четыре"));
        russianWords.add(new RussianWord("pet","пять"));
        russianWords.add(new RussianWord("šest","шесть"));
        russianWords.add(new RussianWord("sedam","семь"));
        russianWords.add(new RussianWord("osam","восемь"));
        russianWords.add(new RussianWord("devet","девять"));
        russianWords.add(new RussianWord("deset","десять"));

        RussianWordAdapter russianWordAdapter = new RussianWordAdapter(this,russianWords,R.color.category_numbers);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(russianWordAdapter);
    }
}
