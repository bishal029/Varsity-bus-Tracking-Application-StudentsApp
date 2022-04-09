package com.shayekh.android.students;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class SCampusToDhaka extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scampus_to_dhaka);

        final ArrayList<Pojo> words = new ArrayList<Pojo>();
        words.add(new Pojo("Time: 03.05 pm", "Route: Jahir Raihan Auditorium-Manik Mia Avenue (only for 1st year students) ",
                "Day: Sunday-Thursday","Number of Buses: 02(double decker)"));
        words.add(new Pojo("Time: 03.05 pm", "Route: Jahir Raihan Auditorium-Bypail-Airport (only for 1st year students) ",
                "Day: Sunday-Thursday","Number of Buses: 01(double decker)"));
        words.add(new Pojo("Time: 03.05 pm", "Route: Campus-Mirpur (only for 1st year students) ",
                "Day: Sunday-Thursday","Number of Buses: 01(double decker)"));
        words.add(new Pojo("Time: 03.05 pm", "Route: Transport- Gabtoli-Asadgate-Sciencelab -Shahbag-Bango bazar ",
                "Day: Sunday-Thursday","Number of Buses: 02"));

        words.add(new Pojo("Time: 05.00 pm", "Route: Jahir Raihan Auditorium-Uttora Shyaora ",
                "Day: Sunday-Thursday","Number of Buses: 01(double decker)"));

        words.add(new Pojo("Time: 05.00 pm", "Route: Jahir Raihan Auditorium-Mirpur 14 ",
                "Day: Sunday-Thursday","Number of Buses: 01"));

        words.add(new Pojo("Time: 05.00 pm", "Route: Transport- Gabtoli-Asadgate-Sciencelab -Shahbag-Bango bazar ",
                "Day: Sunday-Thursday","Number of Buses: 02"));

        words.add(new Pojo("Time: 08.00 pm", "Route: Transport- Gabtoli-Asadgate-Sciencelab -Shahbag-Bango bazar ",
                "Day: Sunday-Thursday","Number of Buses: 01"));

        words.add(new Pojo("Time: 09.30 am", "Route: Transport-Gabtoli-Asadgate-Sciencelab-Shahbag-Bango bazar ",
                "Day: Friday & Saturday","Number of Buses: 02"));

        words.add(new Pojo("Time: 04.05 pm", "Route: Transport-Gabtoli-Asadgate-Sciencelab-Shahbag-Bango bazar ",
                "Day: Friday & Saturday","Number of Buses: 02"));

        words.add(new Pojo("Time: 08.05 pm", "Route: Transport-Gabtoli-Asadgate-Sciencelab-Shahbag-Bango bazar ",
                "Day: Friday & Saturday","Number of Buses: 01"));












        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        PojoAdapter adapter = new PojoAdapter(this, words, R.color.category_numbers);


        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);




    }
}
