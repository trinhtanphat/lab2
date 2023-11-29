package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText editHoTen, editMSSV, editTuoi;
    RadioGroup radioGroup;
    RadioButton radiobtnNam, radiobtnNu;
    CheckBox checkboxBong, checkBoxGame;
    Button btnSave;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editHoTen = findViewById(R.id.edtTen);
        editMSSV = findViewById(R.id.edtMSSV);
        editTuoi = findViewById(R.id.edtTuoi);
        //radioGroup = findViewById(R.id.radioGroup2);
        radiobtnNam = findViewById(R.id.rdbNam);
        radiobtnNu = findViewById(R.id.rdbNu);
        checkboxBong = findViewById(R.id.cbDB);
        checkBoxGame = findViewById(R.id.cbCG);
        btnSave = findViewById(R.id.btnLuu);
        textViewResult = findViewById(R.id.kq);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hoTen = editHoTen.getText().toString();
                String mssv = editMSSV.getText().toString();
                String tuoi = editTuoi.getText().toString();
                String gioiTinh = (radiobtnNam.isChecked()) ? "Nam" : "Nữ";
                boolean daBong = checkboxBong.isChecked();
                boolean choiGame = checkBoxGame.isChecked();

                String message = "Họ tên: " + hoTen +
                        "\nMSSV: " + mssv +
                        "\nTuổi: " + tuoi +
                        "\nGiới tính: " + gioiTinh +
                        "\nSở thích: " +
                        (daBong ? "Đá Bóng" : "") +
                        (choiGame ? "Chơi Game" : "");

                textViewResult.setText(message);
                Toast.makeText(MainActivity.this, "Thông tin đã được lưu", Toast.LENGTH_SHORT).show();
            }
        });


        }
}