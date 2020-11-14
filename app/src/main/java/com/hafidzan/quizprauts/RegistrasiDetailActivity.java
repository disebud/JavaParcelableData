package com.hafidzan.quizprauts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RegistrasiDetailActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi_detail);

        final TextView npmHasil = (TextView) findViewById(R.id.result_npm);
        final TextView namaHasil = (TextView) findViewById(R.id.result_nama);
        final TextView studiHasil = (TextView) findViewById(R.id.result_studi);
        final TextView jurusanHasil = (TextView) findViewById(R.id.result_jurusan);
        final TextView waktuHasil = (TextView) findViewById(R.id.result_kelas_waktu);
        final TextView semesterHasil = (TextView) findViewById(R.id.result_semester);

        Intent intent = getIntent();
        DataMahasiswa mahasiswaNew = intent.getParcelableExtra("Data");

        npmHasil.setText(mahasiswaNew.getNpm());
        namaHasil.setText(mahasiswaNew.getNama());
        studiHasil.setText(mahasiswaNew.getStudi());
        jurusanHasil.setText(mahasiswaNew.getJurusan());
        waktuHasil.setText(mahasiswaNew.getKelas() + "(" + mahasiswaNew.getWaktu() + ")");
        semesterHasil.setText(mahasiswaNew.getSemester());

        Button button = (Button) findViewById(R.id.button_lanjut);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegistrasiDetailActivity.this, PenutupActivity.class);
                startActivity(intent);
            }
        });


    }
}