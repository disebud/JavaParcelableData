package com.hafidzan.quizprauts;

import android.os.Parcel;
import android.os.Parcelable;

public class DataMahasiswa implements Parcelable {
    private String npm;
    private  String nama;
    private String studi;
    private String jurusan;
    private String kelas;
    private String waktu;
    private String semester;

    public DataMahasiswa(String npm, String nama, String studi, String jurusan, String kelas, String waktu, String semester) {
        this.npm = npm;
        this.nama = nama;
        this.studi = studi;
        this.jurusan = jurusan;
        this.kelas = kelas;
        this.waktu = waktu;
        this.semester = semester;
    }

    protected DataMahasiswa(Parcel in) {
        npm = in.readString();
        nama = in.readString();
        studi = in.readString();
        jurusan = in.readString();
        kelas = in.readString();
        waktu = in.readString();
        semester = in.readString();
    }

    public static final Creator<DataMahasiswa> CREATOR = new Creator<DataMahasiswa>() {
        @Override
        public DataMahasiswa createFromParcel(Parcel in) {
            return new DataMahasiswa(in);
        }

        @Override
        public DataMahasiswa[] newArray(int size) {
            return new DataMahasiswa[size];
        }
    };

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStudi() {
        return studi;
    }

    public void setStudi(String studi) {
        this.studi = studi;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(npm);
        parcel.writeString(nama);
        parcel.writeString(studi);
        parcel.writeString(jurusan);
        parcel.writeString(kelas);
        parcel.writeString(waktu);
        parcel.writeString(semester);
    }
}
