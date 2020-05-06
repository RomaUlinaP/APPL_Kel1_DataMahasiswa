package com.javacodegeeks.snippets.enterprise.impl;

import com.javacodegeeks.snippets.enterprise.SimpleService;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.InsertManyOptions;
import com.mongodb.quickstart.models.Mahasiswa;

import org.bson.Document;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SimpleServiceImpl implements SimpleService {
	MongoDatabase dataMahasiswaDB;
	MongoCollection<Mahasiswa> MahasiswaCollection;
	public SimpleServiceImpl(){

	 Logger.getLogger("org.mongodb.driver").setLevel(Level.WARNING);
        try (MongoClient mongoClient = MongoClients.create("mongodb+srv://uli:231407Jerapah99.@firstcluster-6mqrj.mongodb.net/test")) {

            dataMahasiswaDB = mongoClient.getDatabase("datamahasiswa");
            MahasiswaCollection = dataMahasiswaDB.getCollection("mahasiswaCollection", Mahasiswa.class);

        }
	}

	public boolean createMahasiswa(String nim,String nama,int semester, String jurusan, String alamat) {
		String idMahasiswa = new ObjectId().toString();
		try {
			Mahasiswa mahasiswa = new Mahasiswa(idMahasiswa, nim, nama, semester,jurusan, alamat);
			MahasiswaCollection.insertOne(mahasiswa);
			System.out.println("[Account Created]");
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}	
		
		return true;
	}
    


}