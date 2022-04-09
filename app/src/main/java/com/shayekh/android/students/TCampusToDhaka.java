package com.shayekh.android.students;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class TCampusToDhaka extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tcampus_to_dhaka);
        final ArrayList<Pojo> words = new ArrayList<Pojo>();
        words.add(new Pojo("Time: 05.15 am", "Route: Teachers’ club-Gabtoli-Asadgate-Sciencelab-Pressclub-Purana polton police box",
                "Day: Sunday-Thursday","Number of Buses: 01"));
        words.add(new Pojo("Time: 07.00 am", "Route: JU school and college-Gabtoli-Asad gate-Science lab-New market-Shahbag-Bongobazar",
                "Day: Sunday-Thursday","Number of Buses: 01"));
        words.add(new Pojo("Time: 01.15 pm", "Route: Mirpur route (01 Bus), Malibag route (01 Bus), Zigatola route (01 Bus), Uttora route (01 Bus)",
                "Day: Sunday-Thursday","Number of Buses: 04"));
        words.add(new Pojo("Time: 02.50 pm", "Route: Campus- Gabtoli-Asadgate-Sciencelab-New  market-Neelkhet-Shahbag-Bango bazar",
                "Day: Sunday-Thursday","Number of Buses: 01"));

        words.add(new Pojo("Time: 04.45 pm", "Route: Mirpur route (01 Bus), Malibag route (02 Bus), Uttora route (01 Bus)",
                "Day: Sunday-Thursday","Number of Buses: 04"));

        words.add(new Pojo("Time: 08.00 pm", "Route: Campus- Gabtoli-Asadgate-Sciencelab-New  market-Neelkhet-Shahbag-Bango bazar",
                "Day: Sunday-Thursday","Number of Buses: 01"));

        words.add(new Pojo("Time: 09.30 am", "Route: Varsity club-Prantik gate-Gabtoli-Asadgate-New market-Shahbag-Bango bazar",
                "Day: Friday & Saturday","Number of Buses: 02"));

        words.add(new Pojo("Time: 04.00 pm", "Route: Varsity club-Prantik gate-Gabtoli-Asadgate-New market-Shahbag-Bango bazar",
                "Day: Friday & Saturday","Number of Buses: 02"));

        words.add(new Pojo("Time: 08.00 pm", "Route: Campus- Gabtoli-Asadgate-New market-Shahbag-Bango bazar",
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
