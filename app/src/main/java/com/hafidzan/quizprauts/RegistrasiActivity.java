package com.hafidzan.quizprauts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class RegistrasiActivity extends AppCompatActivity {


    private String pilihanKelas;
    private String pilihanWaktu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);

    }


    public void onRadioButtonClickedWaktu(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.pagi:
                if (checked) {
                    pilihanWaktu = "PAGI";
                }
                    break;
            case R.id.malam:
                if (checked){
                    pilihanWaktu = "MALAM";
                }
                    break;
        }
    }

    public void onRadioButtonClickedKelas(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.regular:
                if (checked)
                    pilihanKelas = "REGULAR";
                    break;
            case R.id.karyawan:
                if (checked)
                    pilihanKelas = "KARYAWAN";
                    break;
        }
    }

    public void simpanData(View view) {

        final EditText npm = (EditText) findViewById(R.id.et_npm);
        final EditText nama = (EditText) findViewById(R.id.et_nama);
        final Spinner program = (Spinner) findViewById(R.id.spinner_program);
        final Spinner jurusan = (Spinner) findViewById(R.id.spinner_jurusan);
        final Spinner semester= (Spinner) findViewById(R.id.spinner_semester);


        final String npmMahasiswaNew = npm.getText().toString();
        final String namaMahasiswaNew = nama.getText().toString();
        String pilihJenjang = String.valueOf(program.getSelectedItem());
        String pilihJurusan = String.valueOf(jurusan.getSelectedItem());
        String pilihSemester = String.valueOf(semester.getSelectedItem());

        DataMahasiswa mahasiswa = new DataMahasiswa(npmMahasiswaNew,
                namaMahasiswaNew,pilihJenjang,pilihJurusan,pilihanKelas,pilihanWaktu,pilihSemester);

        Intent intent = new Intent(RegistrasiActivity.this, RegistrasiDetailActivity.class);
        intent.putExtra("Data", mahasiswa);
        startActivity(intent);
    }
}