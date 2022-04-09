package com.shayekh.android.students;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PojoAdapter  extends ArrayAdapter<Pojo> {
    private int mColorResourceId;



    public PojoAdapter(Context context, ArrayList<Pojo> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Pojo currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView time = (TextView) listItemView.findViewById(R.id.time);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        time.setText(currentWord.getTime());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView route = (TextView) listItemView.findViewById(R.id.route);
        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        route.setText(currentWord.getRoute());

        TextView number = (TextView) listItemView.findViewById(R.id.number);
        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        number.setText(currentWord.getNumber());

        TextView day = (TextView) listItemView.findViewById(R.id.day);
        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        day.setText(currentWord.getDay());




        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }






}
