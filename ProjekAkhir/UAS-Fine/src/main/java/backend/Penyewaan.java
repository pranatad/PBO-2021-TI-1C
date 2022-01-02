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
public class Penyewaan {
    private int idpenyewaan;
    private Customer customer = new Customer();
    private Movie movie = new Movie();
    private int lamasewa;
    private int totalharga;
    
    public Penyewaan() {
        
    }

    public Penyewaan(Customer customer, Movie movie, int lamasewa, int totalharga) {
        this.customer = customer;
        this.movie = movie;
        this.lamasewa = lamasewa;
        this.totalharga = totalharga;
    }

    public int getTotalharga() {
        return totalharga;
    }

    public void setTotalharga(int totalharga) {
        this.totalharga = totalharga;
    }

    public int getIdpenyewaan() {
        return idpenyewaan;
    }

    public void setIdpenyewaan(int idpenyewaan) {
        this.idpenyewaan = idpenyewaan;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public int getLamasewa() {
        return lamasewa;
    }

    public void setLamasewa(int lamasewa) {
        this.lamasewa = lamasewa;
    }
    
    public Penyewaan getById(int id) {
        Penyewaan sewa = new Penyewaan();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                                        + "     p.idpenyewaan AS idpenyewaan, "
                                        + "     p.lamasewa AS lamasewa, "
                                        + "     p.totalharga AS totalharga, "
                                        + "     m.idmovie AS idmovie, "
                                        + "     m.nama AS nama, "
                                        + "     m.genre AS genre, "
                                        + "     m.harga AS harga, "               
                                        + "     m.tahunrilis AS tahunrilis, "
                                        + "     c.idcustomer AS idcustomer, "
                                        + "     c.namacustomer AS namacustomer, "
                                        + "     c.alamat AS alamat, "
                                        + "     c.notelp AS notelp "
                                        + "     FROM penyewaan p "
                                        + "     LEFT JOIN movie m ON p.idmovie = m.idmovie "
                                        + "     LEFT JOIN customer c ON p.idcustomer = c.idcustomer "
                                        + "     WHERE p.idpenyewaan = '" + id + "'");
        try {
            while (rs.next()) {
                sewa = new Penyewaan();
                sewa.setIdpenyewaan(rs.getInt("idpenyewaan"));
                sewa.getCustomer().setIdcustomer(rs.getInt("idcustomer"));
                sewa.getCustomer().setNamaCustomer(rs.getString("namacustomer"));
                sewa.getCustomer().setAlamat(rs.getString("alamat"));
                sewa.getCustomer().setNotelp(rs.getString("notelp"));
                
                sewa.getMovie().setIdmovie(rs.getInt("idmovie"));
                sewa.getMovie().setNama(rs.getString("nama"));
                sewa.getMovie().setGenre(rs.getString("genre"));
                sewa.getMovie().setHarga(rs.getInt("harga"));
                sewa.getMovie().setTahunRilis(rs.getString("tahunrilis"));
                
                sewa.setLamasewa(rs.getInt("lamasewa"));
                sewa.setTotalharga(rs.getInt("totalharga"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sewa;
    }
    
    public ArrayList<Penyewaan> getAll() {
        ArrayList<Penyewaan> Sewa = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                                        + "     p.idpenyewaan AS idpenyewaan, "
                                        + "     p.lamasewa AS lamasewa, "
                                        + "     p.totalharga AS totalharga, "
                                        + "     m.idmovie AS idmovie, "
                                        + "     m.nama AS nama, "
                                        + "     m.genre AS genre, "
                                        + "     m.harga AS harga, "
                                        + "     m.tahunrilis AS tahunrilis, "
                                        + "     c.idcustomer AS idcustomer, "
                                        + "     c.namacustomer AS namacustomer, "
                                        + "     c.alamat AS alamat, "
                                        + "     c.notelp AS notelp "
                                        + "     FROM penyewaan p "
                                        + "     LEFT JOIN movie m ON p.idmovie = m.idmovie "
                                        + "     LEFT JOIN customer c ON p.idcustomer = c.idcustomer ");
        try {
            while (rs.next()) {
                Penyewaan sewa = new Penyewaan();
                sewa.setIdpenyewaan(rs.getInt("idpenyewaan"));
                sewa.getCustomer().setIdcustomer(rs.getInt("idcustomer"));
                sewa.getCustomer().setNamaCustomer(rs.getString("namacustomer"));
                sewa.getCustomer().setAlamat(rs.getString("alamat"));
                sewa.getCustomer().setNotelp(rs.getString("notelp"));
                
                sewa.getMovie().setIdmovie(rs.getInt("idmovie"));
                sewa.getMovie().setNama(rs.getString("nama"));
                sewa.getMovie().setGenre(rs.getString("genre"));
                sewa.getMovie().setHarga(rs.getInt("harga"));
                sewa.getMovie().setTahunRilis(rs.getString("tahunrilis"));
                
                sewa.setLamasewa(rs.getInt("lamasewa"));
                sewa.setTotalharga(rs.getInt("totalharga"));

                Sewa.add(sewa);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Sewa;
    }
    
    public ArrayList<Penyewaan> search(String keyword) {
        ArrayList<Penyewaan> Sewa = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                                        + "     p.idpenyewaan AS idpenyewaan, "
                                        + "     p.lamasewa AS lamasewa, "
                                        + "     p.totalharga AS totalharga, "
                                        + "     m.idmovie AS idmovie, "
                                        + "     m.nama AS nama, "
                                        + "     m.genre AS genre, "
                                        + "     m.harga AS harga, "
                                        + "     m.tahunrilis AS tahunrilis, "
                                        + "     c.idcustomer AS idcustomer, "
                                        + "     c.namacustomer AS namacustomer, "
                                        + "     c.alamat AS alamat, "
                                        + "     c.notelp AS notelp "
                                        + "     FROM penyewaan p "
                                        + "     JOIN movie m ON p.idmovie = m.idmovie "
                                        + "     JOIN customer c ON p.idcustomer = c.idcustomer "
                                        + "     WHERE p.lamasewa LIKE '%" + keyword + "%' "
                                        + "         OR p.totalharga LIKE '%" + keyword + "%' "
                                        + "         OR m.nama LIKE '%" + keyword + "%' "
                                        + "         OR m.harga LIKE '%" + keyword + "%' "        
                                        + "         OR c.namacustomer LIKE '%" + keyword + "%' ");
                                       

        try {
            while (rs.next()) {
                Penyewaan sewa = new Penyewaan();
                sewa.setIdpenyewaan(rs.getInt("idpenyewaan"));
                sewa.getCustomer().setIdcustomer(rs.getInt("idcustomer"));
                sewa.getCustomer().setNamaCustomer(rs.getString("namacustomer"));
                sewa.getCustomer().setAlamat(rs.getString("alamat"));
                sewa.getCustomer().setNotelp(rs.getString("notelp"));
                
                sewa.getMovie().setIdmovie(rs.getInt("idmovie"));
                sewa.getMovie().setNama(rs.getString("nama"));
                sewa.getMovie().setGenre(rs.getString("genre"));
                sewa.getMovie().setHarga(rs.getInt("harga"));
                sewa.getMovie().setTahunRilis(rs.getString("tahunrilis"));
                
                sewa.setLamasewa(rs.getInt("lamasewa"));
                sewa.setTotalharga(rs.getInt("totalharga"));
                Sewa.add(sewa);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Sewa;
    }
    
    public void save() {
        if (getById(idpenyewaan).getIdpenyewaan() == 0) {
            String SQL = "INSERT INTO penyewaan (idcustomer, idmovie, lamasewa, totalharga) VALUES("
                    + "         '" + this.getCustomer().getIdcustomer() + "', "
                    + "         '" + this.getMovie().getIdmovie() + "', "
                    + "         '" + this.lamasewa + "', "
                    + "         '" + this.totalharga + "' "
                    + "         )";
            this.idpenyewaan = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE penyewaan SET "
                    + "     idcustomer =    '" + this.getCustomer().getIdcustomer() + "', "
                    + "     idmovie =    '" + this.getMovie().getIdmovie() + "', "
                    + "     lamasewa =    '" + this.lamasewa + "', "
                    + "     totalharga =    '" + this.totalharga + "' "
                    + "     WHERE idpenyewaan =  '" + this.idpenyewaan + "'";
            DBHelper.executeQuery(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM penyewaan WHERE idpenyewaan = '" + this.idpenyewaan + "'";
        DBHelper.executeQuery(SQL);
    }

}
