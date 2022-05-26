package com.example.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ModuleDetailActivity extends AppCompatActivity {
    TextView tvanswer1;
    TextView tvanswer2;
    TextView tvanswer3;
    TextView tvanswer4;
    TextView tvanswer5;
    TextView tvanswer6;
    Button btnback;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvanswer1= findViewById(R.id.textView2);
        tvanswer2= findViewById(R.id.textView3);
        tvanswer3= findViewById(R.id.textView4);
        tvanswer4= findViewById(R.id.textView5);
        tvanswer5= findViewById(R.id.textView6);
        tvanswer6= findViewById(R.id.textView7);
        btnback=findViewById(R.id.button);


        //to receive from main activity
        Intent intentReceived = getIntent();
        int value = intentReceived.getIntExtra("value", 0);

        if (value==1){
            tvanswer1.setText("Module code: " + "c346");
            tvanswer2.setText("Module Name: Android Programming");
            tvanswer3.setText("Academic Year: 2020" );
            tvanswer4.setText("Semester: 1" );
            tvanswer5.setText("Module Credit: 4" );
            tvanswer6.setText("Venue: W66M" );

/*          //dont need
            tvanswer1 = findViewById(R.id.textView2);
            Intent intentReceived1 = getIntent();
            String value1 = intentReceived1.getIntExtra("value1", "C346: ");
            tvanswer1.setText("Module Code: " + value1);

            tvanswer2 = findViewById(R.id.textView3);
            Intent intentReceived2 = getIntent();
            String value2 = intentReceived2.getIntExtra("value2", "Android Programing: ");
            tvanswer2.setText("Module Name: " + value2);

            tvanswer2 = findViewById(R.id.textView4);
            Intent intentReceived3 = getIntent();
            int value3 = intentReceived3.getIntExtra("value3", 2020);
            tvanswer2.setText("Academic Year: " + value3);

            tvanswer2 = findViewById(R.id.textView5);
            Intent intentReceived4 = getIntent();
            int value4 = intentReceived4.getIntExtra("value4", 1);
            tvanswer2.setText("Semester: " + value4);

            tvanswer2 = findViewById(R.id.textView5);
            Intent intentReceived5 = getIntent();
            int value5 = intentReceived5.getIntExtra("value5", 4);
            tvanswer2.setText("Module Credit: " + value5);

            tvanswer2 = findViewById(R.id.textView5);
            Intent intentReceived6 = getIntent();
            String value6 = intentReceived4.getIntExtra("value6", "W66M");
            tvanswer2.setText("Venue: " + value6);*/



        }else if(value==2){
            tvanswer1.setText("Module code: " + "c349");
            tvanswer2.setText("Module Name: ipad Programming");
            tvanswer3.setText("Academic Year: 2020" );
            tvanswer4.setText("Semester: 1" );
            tvanswer5.setText("Module Credit: 4" );
            tvanswer6.setText("Venue: W66A" );


/* //dont need
            tvanswer1 = findViewById(R.id.textView2);
            Intent intentReceived1 = getIntent();
            String value1 = intentReceived1.getStringExtra("value1","C349");
            tvanswer1.setText("Module Code: " + value1);

            tvanswer2 = findViewById(R.id.textView3);
            Intent intentReceived2 = getIntent();
            String value2 = intentReceived2.getStringExtra("value2", "ipad Programing: ");
            tvanswer2.setText("Module Name: " + value2);

            tvanswer2 = findViewById(R.id.textView4);
            Intent intentReceived3 = getIntent();
            int value3 = intentReceived3.getIntExtra("value3", 2020);
            tvanswer2.setText("Academic Year: " + value3);

            tvanswer2 = findViewById(R.id.textView5);
            Intent intentReceived4 = getIntent();
            int value4 = intentReceived4.getIntExtra("value4", 1);
            tvanswer2.setText("Semester: " + value4);

            tvanswer2 = findViewById(R.id.textView5);
            Intent intentReceived5 = getIntent();
            int value5 = intentReceived5.getIntExtra("value5", 4);
            tvanswer2.setText("Module Credit: " + value5);

            tvanswer2 = findViewById(R.id.textView5);
            Intent intentReceived6 = getIntent();
            String value6 = intentReceived4.getIntExtra("value6", "W66A");
            tvanswer2.setText("Venue: " + value6);
*/
        }
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ModuleDetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}