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
public class Kategori {

    private int idkategori;
    private String jenis;
    private String detail;
    
    public Kategori() {

    }
        public Kategori(String jenis, String detail) {
        this.jenis = jenis;
        this.detail = detail;
    }
    public int getIdkategori() {
        return idkategori;
    }

    public void setIdkategori(int idkategori) {
        this.idkategori = idkategori;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }


    public Kategori getById(int id) {
        Kategori kat = new Kategori();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM kategori "
                                            + " WHERE idkategori = '" + id + "'");

        try {
            while(rs.next()) 
            {
                kat = new Kategori();
                kat.setIdkategori(rs.getInt("idkategori"));
                kat.setJenis(rs.getString("jenis"));
                kat.setDetail(rs.getString("detail"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kat;
    }

    public ArrayList<Kategori> getAll() 
    {
        ArrayList<Kategori> ListKategori = new ArrayList();

        ResultSet rs = DBHelper.selectQuery("SELECT * FROM kategori");

        try {
            while(rs.next()) 
            {
                Kategori kat = new Kategori();
                kat.setIdkategori(rs.getInt("idkategori"));
                kat.setJenis(rs.getString("jenis"));
                kat.setDetail(rs.getString("detail"));
                
                ListKategori.add(kat);
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        
        return ListKategori;
    }

    public ArrayList<Kategori> search(String keyword) {
        ArrayList<Kategori> ListKategori = new ArrayList();

        String sql = "SELECT * FROM kategori WHERE "
                    + "     jenis LIKE '%" + keyword + "%' "
                    + "     OR detail LIKE '%" + keyword + "%' ";

        ResultSet rs = DBHelper.selectQuery(sql);

        try {
            while (rs.next()) 
            {
                Kategori kat = new Kategori();
                kat.setIdkategori(rs.getInt("idkategori"));
                kat.setJenis(rs.getString("jenis"));
                kat.setDetail(rs.getString("detail"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public void save() {
        if (getById(idkategori).getIdkategori() == 0) {
            String SQL = "INSERT INTO kategori (jenis, detail) VALUES("
                    + "     '" + this.jenis+ "', "
                    + "     '" + this.detail + "' "
                    + "     )";
            this.idkategori = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE kategori SET "
                    + "     jenis = '" + this.jenis + "', "
                    + "     detail = '" + this.detail + "' "
                    + "     WHERE idkategori = '" + this.idkategori + "'";
            DBHelper.executeQuery(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM kategori WHERE idkategori = '" + this.idkategori + "'";
        DBHelper.executeQuery(SQL);
    } 
    public String toString() {
        return jenis;
    }
}
