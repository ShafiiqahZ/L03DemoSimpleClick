package sg.edu.rp.c346.id20037987.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    //Step 1: Declare the field variables
    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tbEnabler;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.textView);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        tbEnabler = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.radioGroupGender);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //code for the action
                String stringResponse = etInput.getText().toString();

                /*if (stringResponse.isEmpty()){
                    tvDisplay.setText("Nothing has been entered");
                    Toast.makeText(MainActivity.this,"Please input something", Toast.LENGTH_SHORT).show();
                } else {
                    tvDisplay.setText(stringResponse);
                } */

                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.radioButtonGenderMale) {
                    //Write the code when male selected
                    stringResponse = "He says " + stringResponse;
                } else {
                    //Write the code when female selected
                    stringResponse = "She says " + stringResponse;
                }
                tvDisplay.setText(stringResponse);

            }
        });

        tbEnabler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //code for the action
                if (tbEnabler.isChecked() == true) {
                    etInput.setEnabled(true);
                    etInput.setBackgroundColor(Color.TRANSPARENT);
                } else {
                    etInput.setEnabled(false);
                    etInput.setBackgroundColor(Color.GRAY);
                }
            }
        });
    }
}