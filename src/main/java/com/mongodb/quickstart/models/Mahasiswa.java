package com.mongodb.quickstart.models;

import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Objects;

public class Mahasiswa{
	
    private String idMahasiswa;
    private String nim;
    private String nama;
    private int semester;
    private String jurusan;
    private String alamat;
    
    public Mahasiswa() {
  
    }

    public Mahasiswa(String idMahasiswa, final String nim, final String nama, final int semester, final String jurusan, final String alamat) {
        super();

        this.idMahasiswa = idMahasiswa;
        this.nim = nim;
        this.nama = nama;
        this.semester = semester;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }
    
    public String getIdMahasiswa() {
		return idMahasiswa;
	}

	public void setIdMahasiswa(final String idMahasiswa) {
		this.idMahasiswa = idMahasiswa;
    }
    
    public String getNim() {
		return nim;
	}

	public void setNim(final String nim) {
		this.nim = nim;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(final String nama) {
		this.nama = nama;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(final int semester) {
		this.semester = semester;
	}

	public String getJurusan() {
		return jurusan;
	}

	public void setJurusan(final String jurusan) {
		this.jurusan = jurusan;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(final String alamat) {
		this.alamat = alamat;
	}
}