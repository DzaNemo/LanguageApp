package link.languageapp.English;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import link.languageapp.R;

public class AnimalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<EnglishWord> englishWords = new ArrayList<>();

        englishWords.add(new EnglishWord("pas","dog"));
        englishWords.add(new EnglishWord("mačka","cat"));
        englishWords.add(new EnglishWord("krava","cow"));
        englishWords.add(new EnglishWord("konj","horse"));
        englishWords.add(new EnglishWord("lav","lion"));
        englishWords.add(new EnglishWord("tigar","tiger"));
        englishWords.add(new EnglishWord("slon","elephant"));
        englishWords.add(new EnglishWord("medvjed","bear"));
        englishWords.add(new EnglishWord("orao","eagle"));
        englishWords.add(new EnglishWord("delfin","dolphin"));
        englishWords.add(new EnglishWord("riba","fish"));
        englishWords.add(new EnglishWord("pingvin","penguin"));

        EnglishWordAdapter englishWordAdapter = new EnglishWordAdapter(this,englishWords,R.color.category_animals);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(englishWordAdapter);
    }
}
