/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jriot.main;

import java.io.Serializable;

/**
 *
 * @author ulises
 */
public class Favorito implements Serializable{
    long id;
    String nombre;
    String rank;
    double kda;

    public Favorito(long id, String nombre, String rank, double kda) {
        this.id = id;
        this.nombre = nombre;
        this.rank = rank;
        this.kda = kda;
    }

    
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public double getKda() {
        return kda;
    }

    public void setKda(double kda) {
        this.kda = kda;
    }
    
    
}
