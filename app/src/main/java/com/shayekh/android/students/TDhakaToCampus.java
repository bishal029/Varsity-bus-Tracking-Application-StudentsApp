package com.shayekh.android.students;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class TDhakaToCampus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tdhaka_to_campus);

        final ArrayList<Pojo> words = new ArrayList<Pojo>();
        words.add(new Pojo("Time: 07.30 am", "Route: National museum-Sciencelab-Asad gate-Gabtoli-Campus (during class)",
                "Day: Sunday-Thursday","Number of Buses: 01"));

        words.add(new Pojo("Time: 07.45 am", "Route: Mirpur route (01 Bus), Malibag route (01 Bus), Zigatola route (01 Bus), Uttora route (01 Bus)",
                "Day: Sunday-Thursday","Number of Buses: 04"));

        words.add(new Pojo("Time: 08.00 am", "Route:Asad gate-Shyamoli- Gabtoli-Campus (during class)",
                "Day: Sunday-Thursday","Number of Buses: 01"));

        words.add(new Pojo("Time: 10.00 am", "Route: Bango bazar-Shahbag-New market-Sciencelab-Asad gate-Gabtoli-Campus",
                "Day: Sunday-Thursday","Number of Buses: 01"));

        words.add(new Pojo("Time: 04.00 pm", "Route: Asad gate- Gabtoli- Cammpus",
                "Day: Sunday-Thursday","Number of Buses: 01"));

        words.add(new Pojo("Time: 04.45 pm", "Route:Bango bazar-Shahbag-New market-Sciencelab-Asad gate-Gabtoli-Campus",
                "Day: Sunday-Thursday","Number of Buses: 01"));

        words.add(new Pojo("Time: 06.00 pm", "Route: Bango bazar-Shahbag-Sciencelab-Asad gate-Gabtoli-Campus",
                "Day: Sunday-Thursday","Number of Buses: 01"));

        words.add(new Pojo("Time: 07.30 pm", "Route: Bango bazar-Polashi-Neelkhet-New market-Asad gate-Gabtoli-Campus",
                "Day: Sunday-Thursday","Number of Buses: 01"));

        words.add(new Pojo("Time: 08.30 pm", "Route: Bango bazar-Shahbag -Sciencelab-Asad gate-Gabtoli-Campus",
                "Day: Sunday-Thursday","Number of Buses: 01"));

        words.add(new Pojo("Time: 02.15 pm", "Route: Bango bazar-Shahbag-Neelkhet-Sciencelab-Asad gate-Gabtoli-Campus",
                "Day: Friday & Saturday","Number of Buses: 03"));

        words.add(new Pojo("Time: 06.00 pm", "Route:Bango bazar-Shahbag- Sciencelab-Asad gate-Gabtoli-Campus",
                "Day: Friday & Saturday","Number of Buses: 01"));

        words.add(new Pojo("Time: 07.30 pm", "Route:Bango bazar-Polashi-Neelkhet-new market-Asad gate-Gabtoli-Campus",
                "Day: Friday & Saturday","Number of Buses: 01"));

        words.add(new Pojo("Time: 08.30 pm", "Route:Bango bazar-Shahbag- Sciencelab-Asad gate-Gabtoli-Campus",
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
