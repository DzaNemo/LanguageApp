package link.languageapp.Russia;

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

import link.languageapp.France.FrenchWord;
import link.languageapp.R;

public class RussianWordAdapter extends ArrayAdapter<RussianWord> {

    private int resourceColor;

    public RussianWordAdapter(@NonNull Context context,@NonNull List<RussianWord> objects, int resourceColor) {
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

        //get the  Word object located at this position in the list
        RussianWord currentRussianWord = getItem(position);

        //find the TextView in the list_item.xml layout with the ID for the default language
        TextView defaultLanguageTextView = listItemView.findViewById(R.id.default_language);
        defaultLanguageTextView.setText(currentRussianWord.getDefaultLanguage());

        //find the TextView in the list_item.xml layout with the ID for the russian language
        TextView russianTextView = listItemView.findViewById(R.id.chosen_language);
        russianTextView.setText(currentRussianWord.getRussianLanguage());

        ImageView imageView = listItemView.findViewById(R.id.image);
        if (currentRussianWord.hasImage()){
            imageView.setImageResource(currentRussianWord.getImageResourceID());
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
