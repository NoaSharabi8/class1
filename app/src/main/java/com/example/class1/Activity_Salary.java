package com.example.class1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;
import java.util.List;

public class Activity_Salary extends AppCompatActivity {

    private MaterialTextView salary_LBL_title;
    private TextInputLayout salary_EDT_gross;
    private MaterialButton salary_BTN_calculate;
    private MaterialTextView salary_LBL_result;
    Spinner spinner ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_salary);
        spinner = findViewById(R.id.spinner_options);

        List<String> colorList = new ArrayList<>();
        colorList = getColorList();

        // 🔹 יצירת Adapter ושיוך ל-Spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, colorList);
        spinner.setAdapter(adapter);

        // 🔹 קבלת הפריט שנבחר
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), "Selected: " + selectedItem, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // אם לא נבחר כלום, אפשר להשאיר ריק
            }
        });

    }

    private List<String> getColorList() {
        List list= new ArrayList<>();

        return list;
    }

    private void calculateClicked() {
        salary_EDT_gross.setError("");
        String grossInput = salary_EDT_gross.getEditText().getText().toString();
        int gross = 0;
        try {
            gross = Integer.parseInt(grossInput);
        } catch (NumberFormatException ex) {
            salary_EDT_gross.setError("wrong input");
            Toast.makeText(this, "Wrong Input", Toast.LENGTH_SHORT).show();
        }

        if (gross > 0) {
            double result = calculate(gross);
            salary_LBL_result.setText("" + result);
        }



        hideKeyboard();
    }

    private double calculate(int gross) {
        double result = 0;


        return result;
    }

    private void hideKeyboard() {
        InputMethodManager inputManager = (InputMethodManager)this.getSystemService(Context.INPUT_METHOD_SERVICE);
        if (inputManager != null) {
            inputManager.hideSoftInputFromWindow(this.getCurrentFocus().getWindowToken(), 0);
        }
    }
}