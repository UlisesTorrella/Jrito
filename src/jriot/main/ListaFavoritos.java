/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jriot.main;

/**
 *
 * @author ulises
 */
public abstract class ListaFavoritos {
    private static RitoSummoner[] favoritos = new RitoSummoner[0];
    
    public static void addFavorito(RitoSummoner p){
        RitoSummoner[] favAux = new RitoSummoner[favoritos.length + 1];
        for (int i = 0; i < favoritos.length; i++) {
                favAux[i] = favoritos[i];
        }
        favAux[favAux.length-1] = p;
        favoritos=favAux;
    }
    
    public static RitoSummoner[] getFavoritos(){
        return favoritos;
    }
    
    
}