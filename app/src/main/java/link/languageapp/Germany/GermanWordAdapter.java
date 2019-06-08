package link.languageapp.Germany;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import link.languageapp.R;

public class GermanWordAdapter extends ArrayAdapter<GermanWord> {

    private int resourceColor;

    public GermanWordAdapter(@NonNull Context context, @NonNull List<GermanWord> objects, int resourceColor) {
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

        GermanWord currentGermanWord = getItem(position);

        //find the TextView in the list_item.xml layout with the ID for the default

        TextView defaultLanguageTextView = listItemView.findViewById(R.id.default_language);
        defaultLanguageTextView.setText(currentGermanWord.getLanguageDefault());

        //find the TextView in the list_item.xml layout with the ID for the german language
        TextView germanTextView = listItemView.findViewById(R.id.chosen_language);
        germanTextView.setText(currentGermanWord.getLanguageGermany());

        ImageView imageView = listItemView.findViewById(R.id.image);
        if (currentGermanWord.hasImage()){
            imageView.setImageResource(currentGermanWord.getImageResourceID());
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
