package com.shayekh.android.students;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class SDhakaToCampus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sdhaka_to_campus);



        final ArrayList<Pojo> words = new ArrayList<Pojo>();
        words.add(new Pojo("Time: 06.45 am", "Route: Uttora Shyaora-Ashulia-Campus ",
                "Day: Sunday-Thursday","Number of Buses: 01 (double decker)"));
        words.add(new Pojo("Time: 07.00 am", "Route: Airport-Ashulia-Campus (only for 1st year students)",
                "Day: Sunday-Thursday","Number of Buses: 01(double decker)"));
        words.add(new Pojo("Time: 07.15 am", "Route: Mirpur 14-Jahir Raihan Auditorium ",
                "Day: Sunday-Thursday","Number of Buses: 01"));
        words.add(new Pojo("Time: 07.30 am", "Route: Manik Mia Avenue-Gabtoli-Campus ",
                "Day: Sunday-Thursday","Number of Buses: 02 (double decker)"));

        words.add(new Pojo("Time: 07.30 am", "Route: Mirpur-Campus  (only for 1st year students)",
                "Day: Sunday-Thursday","Number of Buses: 01(double decker)"));

        words.add(new Pojo("Time: 05.00 pm", "Route: Bango bazar-Shahbag-Sciencelab-Asad gate-Gabtoli-Campus",
                "Day: Sunday-Thursday","Number of Buses: 01"));

        words.add(new Pojo("Time: 06.05 pm", "Route: Bango bazar-Shahbag-Sciencelab-Asad gate-Gabtoli-Campus",
                "Day: Sunday-Thursday","Number of Buses: 02"));

        words.add(new Pojo("Time: 07.30 pm", "Route: Bango bazar-Shahbag-Sciencelab-Asad gate-Gabtoli-Campus ",
                "Day: Sunday-Thursday","Number of Buses: 01"));

        words.add(new Pojo("Time: 08.30 pm", "Route: Bango bazar-Shahbag-Sciencelab-Asad gate-Gabtoli-Campus",
                "Day: Sunday-Thursday","Number of Buses: 01"));

        words.add(new Pojo("Time: 02.20 pm", "Route:Bango bazar-Shahbag- Sciencelab-Asad gate-Gabtoli-Campus",
                "Day: Friday & Saturday","Number of Buses: 02"));

        words.add(new Pojo("Time: 06.05 pm", "Route:Bango bazar-Shahbag- Sciencelab-Asad gate-Gabtoli-Campus",
                "Day: Friday & Saturday","Number of Buses: 02"));

        words.add(new Pojo("Time: 07.30 pm", "Route:Bango bazar-Shahbag- Sciencelab-Asad gate-Gabtoli-Campus",
                "Day: Friday & Saturday","Number of Buses: 01"));

        words.add(new Pojo("Time: 08.30 pm", "Route:Bango bazar-Shahbag- Sciencelab-Asad gate-Gabtoli-Campus",
                "Day: Friday & Saturday","Number of Buses: 01"));













        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        PojoAdapter adapter = new PojoAdapter(this, words, R.color.category_colors);


        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

    }
}
