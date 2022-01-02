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
public class Customer {
    private int idcustomer;
    private String namacustomer, alamat, notelp;
    
    public Customer() {
        
    }

    public Customer(String namacustomer, String alamat, String notelp) {
        this.namacustomer = namacustomer;
        this.alamat = alamat;
        this.notelp = notelp;
    }

    public int getIdcustomer() {
        return idcustomer;
    }

    public void setIdcustomer(int idcustomer) {
        this.idcustomer = idcustomer;
    }

    public String getNamaCustomer() {
        return namacustomer;
    }

    public void setNamaCustomer(String namacustomer) {
        this.namacustomer = namacustomer;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNotelp() {
        return notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }
    public Customer getById(int id) {
        Customer cus = new Customer();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM customer "
                                            + " WHERE idcustomer = '" + id + "'");

        try {
            while (rs.next()) {
                cus = new Customer();
                cus.setIdcustomer(rs.getInt("idcustomer"));
                cus.setNamaCustomer(rs.getString("namacustomer"));
                cus.setAlamat(rs.getString("alamat"));
                cus.setNotelp(rs.getString("notelp"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cus;
    }

    public ArrayList<Customer> getAll() {
        ArrayList<Customer> ListCustomer = new ArrayList();

        ResultSet rs = DBHelper.selectQuery("SELECT * FROM customer");

        try {
            while (rs.next()) {
                Customer cus = new Customer();
                cus.setIdcustomer(rs.getInt("idcustomer"));
                cus.setNamaCustomer(rs.getString("namacustomer"));
                cus.setAlamat(rs.getString("alamat"));
                cus.setNotelp(rs.getString("notelp"));
                
                ListCustomer.add(cus);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListCustomer;
    }

    public ArrayList<Customer> search(String keyword) {
        ArrayList<Customer> ListCustomer = new ArrayList();

        String sql = "SELECT * FROM customer WHERE "
                    + "     namacustomer LIKE '%" + keyword + "%' "
                    + "     OR alamat LIKE '%" + keyword + "%' "
                    + "     OR notelp LIKE '%" + keyword + "%' ";

        ResultSet rs = DBHelper.selectQuery(sql);

        try {
            while (rs.next()) {
                Customer cus = new Customer();
                cus.setIdcustomer(rs.getInt("idcustomer"));
                cus.setNamaCustomer(rs.getString("namacustomer"));
                cus.setAlamat(rs.getString("alamat"));
                cus.setNotelp(rs.getString("notelp"));
                
                ListCustomer.add(cus);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListCustomer;
    }

    public void save() {
        if (getById(idcustomer).getIdcustomer() == 0) {
            String SQL = "INSERT INTO customer (namacustomer, alamat, notelp) VALUES("
                    + "     '" + this.namacustomer + "', "
                    + "     '" + this.alamat + "', "
                    + "     '" + this.notelp + "' "
                    + "     )";
            this.idcustomer = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE customer SET "
                    + "     namacustomer = '" + this.namacustomer + "', "
                    + "     alamat = '" + this.alamat + "', "
                    + "     notelp = '" + this.notelp + "' "
                    + "     WHERE idcustomer = '" + this.idcustomer + "'";
            DBHelper.executeQuery(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM customer WHERE idcustomer = '" + this.idcustomer + "'";
        DBHelper.executeQuery(SQL);
    }
    public String toString() {
        return namacustomer;
    }
}
