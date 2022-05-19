package sg.edu.rp.c346.id20029699.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvMod1;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvMod1 = findViewById(R.id.textViewMod1);
        back = findViewById(R.id.buttonBack);

        Intent intentReceived = getIntent();
        String selected = intentReceived.getStringExtra("module");

        String msg = "";

        if (selected.equals("C346")){
            msg  = ("Module Code: " + selected +
                    "\nModule Name: Mobile App Development" +
                    "\nAcademic Year: 2022" +
                    "\nSemester: 1" +
                    "\nModule Credit: 4" +
                    "\nVenue: E62E");
        } else if (selected.equals("C322")){
            msg = ("Module Code: " + selected +
                    "\nModule Name: Data Centre and Cloud Management" +
                    "\nAcademic Year: 2022" +
                    "\nSemester: 1" +
                    "\nModule Credit: 4" +
                    "\nVenue: E61H");
        }
        tvMod1.setText(msg);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}