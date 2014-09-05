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
   String killsDeathsAssists;
   RankedStats rankedStats;
   Champion main;
   Champion bestChamp;
   String rank;
   String lp;
   long id;
   RecentGames recentGames;
   Champion bestKDA;
   Jrito rito = new Jrito();
   JRiot lol = new JRiot();
   
   
    public RitoSummoner(String name) throws JRiotException {
        lol.setApiKey(ApikeyAndRegion.getApiKey());
        lol.setRegion(ApikeyAndRegion.getRegion());
        this.name=name;
        setId();
        System.out.println("ranked statst");
        setRankedStats();
        System.out.println("recents games");
        //setRecentGames();

        System.out.println("main");
        setMain();
        System.out.println("kdachamp");
        setBestKDAChampion();        
        System.out.println("genkda");
        setKDA();
        System.out.println("rank");
        setRank();
        System.out.println("lp");
        setLp();
        System.out.println("kdadea");
        setKillsDeathsAssists();
    }
    
    public void setBestKDAChampion() throws JRiotException{
        ArrayList<ChampionStats> championes = rankedStats.getChampions();
        int partidas=0;
        int kills=0;
        int assists=0;
        int deaths=0;
        int idBestKDA=0;
        double bestKDA=0.00;
        for(int i = 1; i<championes.size();i++){
            ChampionStats champStats = championes.get(i);
            if(champStats.getId()!=0){
                partidas = champStats.getStats().getTotalSessionsPlayed();
                kills = champStats.getStats().getTotalChampionKills();
                assists = champStats.getStats().getTotalAssists();
                deaths = champStats.getStats().getTotalDeathsPerSession();
                int auxKDA = kills+ assists;
                auxKDA = auxKDA/deaths;

                if(auxKDA>bestKDA){
                    idBestKDA=champStats.getId();
                }                
            }

        }
        System.out.println(idBestKDA);
        bestChamp=lol.getChampion(idBestKDA);
    }
    

    
    public String getChampKDAbyId(long id){
        String kda;
        ArrayList<ChampionStats> championes = rankedStats.getChampions();
        int partidas=0;
        int kills=0;
        int assists=0;
        int deaths=0;
        for(int i = 1; i<championes.size();i++){
            ChampionStats champStats = championes.get(i);
            if(champStats.getId() == id){        
                partidas = champStats.getStats().getTotalSessionsPlayed();
                kills = champStats.getStats().getTotalChampionKills();
                assists = champStats.getStats().getTotalAssists();
                deaths = champStats.getStats().getTotalDeathsPerSession();                             
            }
        }
        kda=kills/partidas+"/"+deaths/partidas+"/"+assists/partidas;
        return kda;
    }

    public Champion getBestChamp() {
        return bestChamp;
    }

    public void setBestChamp(Champion bestChamp) {
        this.bestChamp = bestChamp;
    }

    public Champion getBestKDA() {
        return bestKDA;
    }

    public void setBestKDA(Champion bestKDA) {
        this.bestKDA = bestKDA;
    }
    
    
    public String getKillsDeathsAssists() {
        return killsDeathsAssists;
    }



    
    public void setKillsDeathsAssists() throws JRiotException{

        ArrayList<ChampionStats> championes = rankedStats.getChampions();
        int partidas=0;
        int kills=0;
        int deaths=0;
        int assists=0;
        for(int i = 1; i<championes.size();i++){
            ChampionStats champStats = championes.get(i);
            if(champStats.getId() == 0){        
                partidas = champStats.getStats().getTotalSessionsPlayed();
                kills = champStats.getStats().getTotalChampionKills();
                assists = champStats.getStats().getTotalAssists();
                deaths = champStats.getStats().getTotalDeathsPerSession();
                              
            }
        }    
        
        kills = kills/ partidas;
        deaths = deaths/partidas;
        assists= assists/partidas;
        
        killsDeathsAssists=kills+" / "+ deaths + " / " + assists;

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
        double KDAaux = 0.00;
        ArrayList<ChampionStats> championes = rankedStats.getChampions();
        int partidas=0;
        int kills=0;
        int deaths=0;
        int assists=0;
        for(int i = 1; i<championes.size();i++){
            ChampionStats champStats = championes.get(i);
            if(champStats.getId() == 0){        
                partidas = champStats.getStats().getTotalSessionsPlayed();
                kills = champStats.getStats().getTotalChampionKills();
                assists = champStats.getStats().getTotalAssists();
                deaths = champStats.getStats().getTotalDeathsPerSession();
                              
            }
        }    
        
        KDAaux = kills+ assists;
        KDAaux = KDAaux/deaths;
        double unm = KDAaux;
        this.KDA = (double)Math.round(unm * 100) / 100;

    }
    
    public void setMain() throws JRiotException{

        int maxGamesUsed= 0;
        int mainChampId = 115;
        ArrayList<ChampionStats> championes = rankedStats.getChampions();
        for(int i = 1; i<championes.size();i++){
            ChampionStats champStats = championes.get(i);
            // IF para evitar que confunda las stats totales con individuales
            if(champStats.getId() != 0){
                int gamesPlayed = champStats.getStats().getTotalSessionsPlayed();
                if(gamesPlayed>maxGamesUsed){
                    mainChampId = championes.get(i).getId();
                    maxGamesUsed = gamesPlayed;
                }
            }
        }
        
        main = lol.getChampion(mainChampId);
        System.out.println(main.getName());
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
