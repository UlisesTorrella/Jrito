/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jriot.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author ulises
 */
public abstract class ListaFavoritos {
    private static Favorito[] favoritos = new Favorito[0];
    
        //Elementos para guardar el archivo
    private static String archivo = "favoritos.po";
    private static FileInputStream fis = null;
    private static ObjectInputStream ois = null;
    private static FileOutputStream fos = null;
    private static ObjectOutputStream oos = null;
    
    public static boolean addFavorito(Favorito p){
        Favorito[] favAux = new Favorito[favoritos.length + 1];
        for (int i = 0; i < favoritos.length; i++) {
            if(p.getId()==favoritos[i].getId()){
                return false;
            }  
            favAux[i] = favoritos[i];
        }
        favAux[favAux.length-1] = p;
        favoritos=favAux;
        return true;
    }
    
    public static Favorito[] getFavoritos(){
        return favoritos;
    }

    public static boolean saveLista() {

        boolean saved = false;
        
        try {
            fos = new FileOutputStream(archivo);
            oos = new ObjectOutputStream(fos);
            //Esta es otra forma de hacer un for, la sintaxis es la siguiente:
            //for (Clase aux:array), recorre el array y se lo asigna al auxiliar.
            oos.writeObject(favoritos);

        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el archivo");
            return false;
        } catch (IOException ex) {
            System.out.println("Error al guardar el archivo");
            return false;
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                    oos = null;
                }
                if (fos != null) {
                    fos.close();
                    fos = null;
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar archivo");
            }
        }        

        System.out.println("Guardado Correctamente");
        return true;
    }

    /*
     * Devuelve un arraylist con las ventas en disco
     */
    public static boolean levantarObjetoEntero() {
        Favorito[] aux=null;

        try {
            fis = new FileInputStream(archivo);
            ois = new ObjectInputStream(fis);

            aux = (Favorito[]) ois.readObject();
            System.out.println(aux.length);

        }  catch (Exception e1) {
            System.out.println("Error!!!" + e1);
            return false;
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                    ois = null;
                }
                if (fis != null) {
                    fis.close();
                    fis = null;
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar archivo");
            }
        }
        favoritos = aux;
        return true;
    }
    
}