package link.languageapp.Spain;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import link.languageapp.Germany.GermanWord;
import link.languageapp.R;

public class SpanishWordAdapter extends ArrayAdapter<SpanishWord> {

    private int resourceColor;

    public SpanishWordAdapter(@NonNull Context context,@NonNull List<SpanishWord> objects,int resourceColor) {
        super(context, 0, objects);
        this.resourceColor = resourceColor;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_view,parent,false);
        }

        SpanishWord currentSpanishWord = getItem(position);

        //find the TextView in the list_item.xml layout with the ID for the default

        TextView defaultLanguageTextView = listItemView.findViewById(R.id.default_language);
        defaultLanguageTextView.setText(currentSpanishWord.getLanguageDefault());

        //find the TextView in the list_item.xml layout with the ID for the spanish language
        TextView spanishTextView = listItemView.findViewById(R.id.chosen_language);
        spanishTextView.setText(currentSpanishWord.getLanguageSpanish());

        ImageView imageView = listItemView.findViewById(R.id.image);
        if (currentSpanishWord.hasImage()){
            imageView.setImageResource(currentSpanishWord.getImageResourceID());
            imageView.setVisibility(View.VISIBLE);
        }else{
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),resourceColor);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
