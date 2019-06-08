package link.languageapp.Russia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import link.languageapp.R;

public class PhrasesRusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<RussianWord> russianWords = new ArrayList<>();

        russianWords.add(new RussianWord("Dobar dan","Добрый день"));
        russianWords.add(new RussianWord("Zovem se...","Меня зовут ..."));
        russianWords.add(new RussianWord("Kako ste?","Как дела?"));
        russianWords.add(new RussianWord("Hvala","Спасибо"));
        russianWords.add(new RussianWord("Ne znam","Я не знаю"));
        russianWords.add(new RussianWord("Oprostite","Простите "));
        russianWords.add(new RussianWord("Govorite li ruski?","Вы говорите по-русски?"));
        russianWords.add(new RussianWord("Molim vas","Пожалуйста"));
        russianWords.add(new RussianWord("Gdje si","Где ты?"));

        RussianWordAdapter russianWordAdapter = new RussianWordAdapter(this,russianWords,R.color.category_phrases);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(russianWordAdapter);

    }
}
