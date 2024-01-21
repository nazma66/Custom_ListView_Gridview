package com.example.custom_and_image_adapter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity1 extends AppCompatActivity {

    ListView list;
    Spinner spinner;
    String[] headline = {
            "Phillips, Santner rescue New Zealand to level series after Ajaz six-for",
            "The UN General Assembly will meet on Tuesday to discuss the humanitarian crisis in Gaza, officials and diplomats said Sunday, after the United States last week vetoed a Security Council resolution for a ceasefire.",
            "No gender justice without climate justice"
    };
    String[] repname = {"Mohammad Isam", "AFP", "Pavel Partha"};
    String[] details = {"New Zealand 180 (Phillips 87, Mehidy 3-53, Taijul 3-64) and 139 for 6 (Phillips 40*, Santner 35*, Mehidy 3-52) beat Bangladesh 172 (Mushfiqur 35, Phillips 3-31, Santner 3-65) and 144 (Zakir 59, Ajaz 6-57, Santner 3-51) by four wickets\n" +
            "\n" +
            "New Zealand aced a thrilling fourth-innings chase in the Dhaka Test, beating Bangladesh by four wickets. They leveled the series 1-1, as Glenn Phillips was once again in the thick of things, guiding the visitors with an unbeaten 40, the runs coming against the spinning and fizzing red ball. Phillips hit the winning runs with his fifth boundary.\n" +
            "\n" +
            "The match will be remembered as a low-scoring affair, with the two sides aggregating to face just 1069 balls, the seventh-lowest ever in a Test that had at least 36 wickets falling.\n" +
            "\n" +
            "The hosts dominated the contest when they reduced New Zealand to 69 for 6, before Phillips and Mitchell Santner took the visitors home with an unbroken seventh-wicket stand of 70. However, New Zealand's win was setup by Ajaz Patel's 6 for 57 on the fourth morning. It was only the third time that three or fewer New Zealand bowlers took all ten wickets in an overseas Test innings, as Bangladesh were bowled out for 144 following a batting collapse in the second innings.\n" +
            "\n" +
            "Despite the low target, New Zealand fell into big trouble early. Shoriful Islam once again got Bangladesh their first breakthrough. He had Devon Conway lbw for 2 as the ball kept low, thus ending the opener's struggle.",
            "According to diplomatic sources, the General Assembly, whose resolutions are nonbinding, could vote on a text for a ceasefire resolution at the meeting.\n" +
                    "\n" +
                    "A draft of the text seen by AFP closely follows the language of Friday's vetoed Security Council resolution, \"expressing grave concern over the catastrophic humanitarian situation in the Gaza Strip.\"It calls for \"an immediate humanitarian cease-fire\" as well as the \"immediate and unconditional release of all hostages.\"\n" +
                    "\n" +
                    "On Friday the United States blocked the ceasefire resolution which came after UN Secretary-General Antonio Guterres called an emergency meeting of the Security Council, deploying the rarely-used Article 99 of the UN Charter to bring to the council's attention \"any matter which in his opinion may threaten the maintenance of international peace and security.\"\n" +
                    "\n" +
                    "The body's \"authority and credibility\" have been \"severely undermined\" by its delayed response to the war, Guterres said afterward.At the end of October, in another of its resolutions, the General Assembly called for an \"immediate, durable and sustained humanitarian truce leading to a cessation of hostilities\" between Israel and Hamas.\n" +
                    "\n" +
                    "Two weeks later the Security Council broke its silence on the war for the first time by calling for \"extended pauses and humanitarian corridors\" -- using less clear language than a ceasefire or a truce.", "Whenever we discuss violence against women or gender-based violence, our point of view still seems to be patriarchal and limited. We fail to accommodate the existing structural discrimination and global risks, such as climate change, in the discussions. How are we supposed to study this \"violence\"? Should it be limited to domestic abuse, child marriage, dowry, sexual harassment, rape, and the absence of social rights? Women have been practising regenerative natural agriculture for millennia. In the 60s, we were forced to adopt the green revolution, and now, the threat of chemical toxins and plastic pollution is everywhere. Female health faces tremendous risks, so do their cultural rights. Then, should we not study this system of development as \"violence\" against women? From November 25 to December 10, the world observed 16 Days of Activism against Gender-Based Violence. Meanwhile, the 28th UN Climate Change Conference, or COP28, started on November 30 and will end tomorrow. I want to take this opportunity to speak about such risks, especially the oppression of women. Climate and gender activists worldwide are bringing up these topics in various ways. Climate justice is not possible without gender justice, and at the same time, if you want to establish gender justice, climate justice is a must-have. Let's try to understand this using the variety of experiences accumulated from various parts of the world at COP28.Yet, rural women are one of the most notable architects of agriculture and natural conservation around the world. For the women who rely on agriculture and natural resources, their livelihoods, conventional knowledge, social harmony, and cultural heritage are all under threat because of climate change. This is why climate change is an instance of patriarchal oppression. It is impossible to combat climate change through the lens of patriarchy; society, the state and agencies must be freed of this discriminatory lens. "};
    Integer[] imageId = {
            R.drawable.news01,
            R.drawable.news02,
            R.drawable.news03,


    };

    String[] date = {
            "09-Dec-2023", "Mon Dec 11, 2023 12:45 PM Last update on: Mon Dec 11, 2023 12:47 PM",
            "Mon Dec 11, 2023 07:00 AM Last update on: Mon Dec 11, 2023 07:00 AM"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);


        list = (ListView) findViewById(R.id.list);
        BA_MyCustomAdapter01 listAdapter = new BA_MyCustomAdapter01(MainActivity1.this, headline, imageId, date, repname, details);
        list.setAdapter(listAdapter);

        spinner = (Spinner) findViewById(R.id.spinner);
        BA_MyCustomAdapter01 spinnerAdapter = new BA_MyCustomAdapter01(MainActivity1.this, headline, imageId, date, repname,details);
        spinner.setAdapter(spinnerAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedHeadline = headline[position];
                String selectedRepName = repname[position];
                String selectedDate = date[position];
                String selectedDetails = details[position];
                int selectedImageId = imageId[position];

                Intent intent = new Intent(getApplicationContext(), Detail_activity.class);
                intent.putExtra("headline", selectedHeadline);
                intent.putExtra("repname", selectedRepName);
                intent.putExtra("date", selectedDate);
                intent.putExtra("imageId", selectedImageId);
                intent.putExtra("details", selectedDetails);
                startActivity(intent);

                list.setSelector(R.color.blue);


            }
        });
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedHeadline = headline[position];
                String selectedRepName = repname[position];
                String selectedDate = date[position];
                String selectedDetails = details[position];
                int selectedImageId = imageId[position];

                Intent intent = new Intent(getApplicationContext(), Detail_activity.class);
                intent.putExtra("headline", selectedHeadline);
                intent.putExtra("repname", selectedRepName);
                intent.putExtra("date", selectedDate);
                intent.putExtra("imageId", selectedImageId);
                intent.putExtra("details", selectedDetails);
                startActivity(intent);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
            }
        });

    }
}
