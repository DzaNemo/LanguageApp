package link.languageapp.English;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import link.languageapp.R;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<EnglishWord> englishWords = new ArrayList<>();

        englishWords.add(new EnglishWord("otac","father"));
        englishWords.add(new EnglishWord("majka","mother"));
        englishWords.add(new EnglishWord("sin","son"));
        englishWords.add(new EnglishWord("kćerka","daughter"));
        englishWords.add(new EnglishWord("brat","brother"));
        englishWords.add(new EnglishWord("sestra","sister"));
        englishWords.add(new EnglishWord("deda","grandfather"));
        englishWords.add(new EnglishWord("baba","grandmother"));

        EnglishWordAdapter englishWordAdapter = new EnglishWordAdapter(this,englishWords,R.color.category_family);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(englishWordAdapter);
    }
}
