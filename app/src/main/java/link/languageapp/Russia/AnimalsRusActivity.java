package link.languageapp.Russia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;

import link.languageapp.R;

public class AnimalsRusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<RussianWord> russianWords = new ArrayList<>();

        russianWords.add(new RussianWord("pas","собака "));
        russianWords.add(new RussianWord("mačka","кошка "));
        russianWords.add(new RussianWord("krava","корова "));
        russianWords.add(new RussianWord("konj","лошадь"));
        russianWords.add(new RussianWord("lav","лев"));
        russianWords.add(new RussianWord("tigar","тигр"));
        russianWords.add(new RussianWord("slon","слон "));
        russianWords.add(new RussianWord("medvjed","медведь "));
        russianWords.add(new RussianWord("orao","орел"));
        russianWords.add(new RussianWord("delfin","дельфин "));
        russianWords.add(new RussianWord("riba","рыбы"));
        russianWords.add(new RussianWord("pingvin","пингвин "));

        RussianWordAdapter russianWordAdapter = new RussianWordAdapter(this,russianWords,R.color.category_animals);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(russianWordAdapter);
    }
}
