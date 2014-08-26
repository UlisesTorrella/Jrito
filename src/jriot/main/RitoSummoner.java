/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jriot.main;
import java.util.*;
import jriot.objects.*;

/**
 *
 * @author ulises
 */
public class RitoSummoner {
   String name;
   double KDA = 0.00;
   RankedStats rankedStats;
   Champion main;
   String rank="Carton V";
   String lp="0";
   long id;
   RecentGames recentGames;
   Champion bestKDA;
   Jrito rito = new Jrito();
   JRiot lol = new JRiot();
   
   
    public RitoSummoner(String name) throws JRiotException {
        lol.setApiKey("ad5f2333-5eb4-473f-a763-969480587d8c");
        lol.setRegion("las");
        this.name=name;
        setMain();
        setKDA();
        //setRank();
        //setLp();
        setId();
        setRankedStats();
        setRecentGames();
    }

    public String getRank() {
        return rank;
    }

    public void setRank() throws JRiotException {
        rank = rito.getSummRank(id);
    }

    public String getLp() {
        return lp;
    }

    public void setLp() throws JRiotException {
        lp = rito.getSummLP(id);
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getKDA() {
        return KDA;
    }

    public void setKDA() throws JRiotException {
        KDA = rito.getSummonerGeneralKDA(name);
    }

    
    public RankedStats getRankedStats() {
        return rankedStats;
    }

    public void setRankedStats() throws JRiotException {
        rankedStats = lol.getRankedStats(id, 4);
    }

    public Champion getMain() {
        return main;
    }

    public void setMain() throws JRiotException {
        this.main = rito.getSummMain(name);
        System.out.println("la wea aweona");
    }

    public long getId() {
        return id;
    }

    public void setId() throws JRiotException {
        this.id = lol.getSummoner(name).getId();
    }

    public RecentGames getRecentGames() {
        return recentGames;
    }

    public void setRecentGames() throws JRiotException {
        this.recentGames = lol.getRecentGames(id);
    }
    
    
    
   
   
    
    
}
