/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author Pranata
 */
public class Anggota {

    private int idanggota;
    private String nama;
    private String alamat;
    private String telepon;

    public Anggota() {

    }

    public Anggota(int idanggota, String nama, String alamat, String telepon) {
        this.idanggota = idanggota;
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    public int getIdanggota() {
        return idanggota;
    }

    public void setIdanggota(int idanggota) {
        this.idanggota = idanggota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public Anggota getById(int id) {
        Anggota kat = new Anggota();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM anggota "
                + " WHERE idanggota = ' " + id + "'");

        try {
            while (rs.next()) {
                kat = new Anggota();
                kat.setIdanggota(rs.getInt("idanggota"));
                kat.setNama(rs.getString("nama"));
                kat.setAlamat(rs.getString("alamat"));
                kat.setTelepon(rs.getString("telepon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kat;
    }

    public ArrayList<Anggota> getAll() {
        ArrayList<Anggota> Listanggota = new ArrayList();

        ResultSet rs = DBHelper.selectQuery("SELECT * FROM anggota");

        try {
            while (rs.next()) {
                Anggota kat = new Anggota();
                kat.setIdanggota(rs.getInt("idanggota"));
                kat.setNama(rs.getString("nama"));
                kat.setAlamat(rs.getString("alamat"));
                kat.setTelepon(rs.getString("telepon"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Listanggota;
    }

    public ArrayList<Anggota> search(String keyword) {
        ArrayList<Anggota> Listanggota = new ArrayList();

        String sql = "SELECT * FROM anggota WHERE "
                + "     nama Like '%" + keyword + "%' "
                + "     OR alamat like '%" + keyword + "%' "
                + "     OR telepon like '%" + keyword + "%' ";

        ResultSet rs = DBHelper.selectQuery(sql);

        try {
            while (rs.next()) {
                Anggota kat = new Anggota();
                kat.setIdanggota(rs.getInt("idanggota"));
                kat.setNama(rs.getString("nama"));
                kat.setAlamat(rs.getString("alamat"));
                kat.setTelepon(rs.getString("telepon"));
                
                Listanggota.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Listanggota;
    }

    public void save() {
        if (getById(idanggota).getIdanggota() == 0) {
            String SQL = "INSERT INTO anggota (nama, alamat) VALUES("
                    + "     '" + this.nama + "',"
                    + "     '" + this.alamat + "',"
                    + "     '" + this.telepon + "',"
                    + "     )";
            this.idanggota = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE anggota SET "
                    + "     nama = '" + this.nama + "',"
                    + "     alamat = '" + this.alamat + "',"
                    + "     '" + this.telepon + "',"
                    + "     Where idanggota = '" + this.idanggota + "'";
            DBHelper.executeQuery(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM anggota WHERE idanggota = '" + this.idanggota + "'";
        DBHelper.executeQuery(SQL);
    }
}
