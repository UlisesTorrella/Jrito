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
   long id;
   RecentGames recentGames;
   Champion bestKDA;
   Jrito rito = new Jrito();
   JRiot lol = new JRiot();
   
   
    public RitoSummoner(String name) throws JRiotException {
        lol.setApiKey("ad5f2333-5eb4-473f-a763-969480587d8c");
        lol.setRegion("las");
        setKDA();
        setRankedStats();
        setMain();
        setId();
        setRecentGames();
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
