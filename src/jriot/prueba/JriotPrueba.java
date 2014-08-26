/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jriot.prueba;

import java.util.*;
import jriot.main.*;
import jriot.objects.*;

/**
 *
 * @author ulises
 */
public class JriotPrueba {

    /**
     * @param args the command line arguments
     * @throws jriot.main.JRiotException
     */
    public static void main(String[] args) throws JRiotException {
        JRiot lol = new JRiot();
        lol.setApiKey("ad5f2333-5eb4-473f-a763-969480587d8c");
        lol.setRegion("las");
        String invocador = "shamiv";
        long numero = lol.getSummoner(invocador).getId();
        System.out.println(numero);
        List<League> Summoner = lol.getLeagueEntries(numero);
        ChampionList lista = lol.getFreeChampions();
        Jrito rito = new Jrito();
        rito.getSummRank(numero);
        //RitoSummoner penca = rito.BuscarSummoner(invocador);
        String[] nombres = rito.getChampsNameByList(lista);
        System.out.println(Summoner);
        System.out.println(nombres[0]);
        Champion champ = lol.getChampion(254);
        System.out.println();
        System.out.println(champ.getName());
        System.out.println(rito.getSummRank(numero) + " " + rito.getSummLP(numero));
        RankedStats stats = lol.getRankedStats(numero, 4);
        System.out.println(stats.getChampions());
        Champion champeon = rito.getSummMain(invocador);
        System.out.println(champeon.getName());
        double kda = rito.getSummonerGeneralKDA(invocador);
        
        //System.out.println(penca.getMain().getName());
        System.out.println(kda);
    }

}
