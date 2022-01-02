/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author Pranata
 */
public class Movie {
    private int idmovie;
    private Kategori kategori = new Kategori();
    private String nama;
    private String genre;
    private int harga;
    private String tahunRilis;
    
    public Movie() {
        
    }

    public Movie(Kategori kategori, String nama, String genre, int harga, String tahunRilis) {
        this.kategori = kategori;
        this.nama = nama;
        this.genre = genre;
        this.harga = harga;
        this.tahunRilis = tahunRilis;
    }

    public int getIdmovie() {
        return idmovie;
    }

    public void setIdmovie(int idmovie) {
        this.idmovie = idmovie;
    }

    public Kategori getKategori() {
        return kategori;
    }

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTahunRilis() {
        return tahunRilis;
    }

    public void setTahunRilis(String tahunRilis) {
        this.tahunRilis = tahunRilis;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public Movie getById(int id) {
        Movie movie = new Movie();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                                        + "     m.idmovie AS idmovie, "
                                        + "     m.nama AS nama, "
                                        + "     m.genre AS genre, "
                                        + "     m.harga AS harga, "
                                        + "     m.tahunrilis AS tahunrilis, "
                                        + "     k.idkategori AS idkategori, "
                                        + "     k.jenis AS jenis, "
                                        + "     k.detail AS detail "
                                        + "     FROM movie m "
                                        + "     LEFT JOIN kategori k ON m.idkategori = k.idkategori "
                                        + "     WHERE m.idmovie = '" + id + "'");
        try {
            while (rs.next()) {
                movie = new Movie();
                movie.setIdmovie(rs.getInt("idmovie"));
                movie.getKategori().setIdkategori(rs.getInt("idkategori"));
                movie.getKategori().setJenis(rs.getString("jenis"));
                movie.getKategori().setDetail(rs.getString("detail"));
                movie.setNama(rs.getString("nama"));
                movie.setGenre(rs.getString("genre"));
                movie.setHarga(rs.getInt("harga"));
                movie.setTahunRilis(rs.getString("tahunrilis"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return movie;
    }

    public ArrayList<Movie> getAll() {
        ArrayList<Movie> ListMovie = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                                        + "     m.idmovie AS idmovie, "
                                        + "     m.nama AS nama, "
                                        + "     m.genre AS genre, "
                                        + "     m.harga AS harga, "
                                        + "     m.tahunrilis AS tahunrilis, "
                                        + "     k.idkategori AS idkategori, "
                                        + "     k.jenis AS jenis, "
                                        + "     k.detail AS detail "
                                        + "     FROM movie m "
                                        + "     LEFT JOIN kategori k ON m.idkategori = k.idkategori ");

        try {
            while (rs.next()) {
                Movie movie = new Movie();
                movie.setIdmovie(rs.getInt("idmovie"));
                movie.getKategori().setIdkategori(rs.getInt("idkategori"));
                movie.getKategori().setJenis(rs.getString("jenis"));
                movie.getKategori().setDetail(rs.getString("detail"));
                movie.setNama(rs.getString("nama"));
                movie.setGenre(rs.getString("genre"));
                movie.setHarga(rs.getInt("harga"));
                movie.setTahunRilis(rs.getString("tahunrilis"));

                ListMovie.add(movie);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListMovie;
    }

    public ArrayList<Movie> search(String keyword) {
        ArrayList<Movie> ListMovie = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                                        + "     m.idmovie AS idmovie, "
                                        + "     m.nama AS nama, "
                                        + "     m.genre AS genre, "
                                        + "     m.harga AS harga, "
                                        + "     m.tahunrilis AS tahunrilis, "
                                        + "     k.idkategori AS idkategori, "
                                        + "     k.jenis AS jenis, "
                                        + "     k.detail AS detail "
                                        + "     FROM movie m "
                                        + "     LEFT JOIN kategori k ON m.idkategori = k.idkategori "
                                        + "     WHERE m.nama LIKE '%" + keyword + "%' "
                                        + "         OR m.genre LIKE '%" + keyword + "%' "
                                        + "         OR m.harga LIKE '%" + keyword + "%' "
                                        + "         OR m.tahunrilis LIKE '%" + keyword + "%' "
                                        + "         OR k.jenis LIKE '%" + keyword + "%' ");

        try {
            while (rs.next()) {
                Movie movie = new Movie();
                movie.setIdmovie(rs.getInt("idmovie"));
                movie.getKategori().setIdkategori(rs.getInt("idkategori"));
                movie.getKategori().setJenis(rs.getString("jenis"));
                movie.getKategori().setDetail(rs.getString("detail"));
                movie.setNama(rs.getString("nama"));
                movie.setGenre(rs.getString("genre"));
                movie.setHarga(rs.getInt("harga"));
                movie.setTahunRilis(rs.getString("tahunrilis"));

                ListMovie.add(movie);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListMovie;
    }

    public void save() {
        if (getById(idmovie).getIdmovie() == 0) {
            String SQL = "INSERT INTO movie (nama, idkategori, genre, harga, tahunrilis) VALUES("
                    + "         '" + this.nama + "', "
                    + "         '" + this.getKategori().getIdkategori() + "', "
                    + "         '" + this.genre + "', "
                    + "         '" + this.harga + "', "
                    + "         '" + this.tahunRilis + "' "
                    + "         )";
            this.idmovie = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE movie SET "
                    + "     nama =    '" + this.nama + "', "
                    + "     idkategori =    '" + this.getKategori().getIdkategori() + "', "
                    + "     genre =    '" + this.genre+ "', "
                    + "     harga =    '" + this.harga+ "', "
                    + "     tahunrilis =    '" + this.tahunRilis + "' "
                    + "     WHERE idmovie =  '" + this.idmovie + "'";
            DBHelper.executeQuery(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM movie WHERE idmovie = '" + this.idmovie + "'";
        DBHelper.executeQuery(SQL);
    }
    public String toString() {
        return nama;
    }
}

