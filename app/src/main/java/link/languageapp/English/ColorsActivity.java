package link.languageapp.English;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import link.languageapp.R;


public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<EnglishWord> englishWords = new ArrayList<>();

        englishWords.add(new EnglishWord("bijela","white"));
        englishWords.add(new EnglishWord("crvena","red"));
        englishWords.add(new EnglishWord("crna","black"));
        englishWords.add(new EnglishWord("žuta","yellow"));
        englishWords.add(new EnglishWord("plava","blue"));
        englishWords.add(new EnglishWord("zelena","green"));
        englishWords.add(new EnglishWord("narandžasta","orange"));
        englishWords.add(new EnglishWord("ljubičasta","purple"));
        englishWords.add(new EnglishWord("smeđa","brown"));

        EnglishWordAdapter englishWordAdapter = new EnglishWordAdapter(this,englishWords,R.color.category_colors);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(englishWordAdapter);
    }
}
