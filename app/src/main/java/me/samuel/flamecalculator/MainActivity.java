package me.samuel.flamecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText male, female;
    TextView text;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calc(View view) {
        male = (EditText) findViewById(R.id.mmale);
        female = (EditText) findViewById(R.id.mfemale);
        text = (TextView) findViewById(R.id.tv);
        String f = female.getText().toString();
        String m = male.getText().toString();
        String sum = m + f;
        sum = sum.toLowerCase();
        int value = sum.hashCode();

        Random random = new Random(value);
        result = (random.nextInt(100) + 1) + "%";
        if (m.equals("") || f.equals("")) {
            Toast.makeText(MainActivity.this, "Enter names....", Toast.LENGTH_SHORT).show();

        } else {
            text.setText(result);

        }
    }
}
