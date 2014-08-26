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
public class Jrito {
    private JRiot lol = new JRiot();

    public Jrito() {
        lol.setApiKey("ad5f2333-5eb4-473f-a763-969480587d8c");
        lol.setRegion("las");
    }

    public RitoSummoner BuscarSummoner(String name) throws JRiotException{
        RitoSummoner summ = new RitoSummoner(name);
        
        return summ;
    }
    
    public String[] getChampsNameByList(ChampionList lista) throws JRiotException{
        String[] nombres = new String[lista.getChampionList().size()];
        lol.setApiKey("ad5f2333-5eb4-473f-a763-969480587d8c");
        lol.setRegion("las");
        
        for(int i = 0 ; i< lista.getChampionList().size(); i++ ){
            ArrayList<Champion> championes = lista.getChampionList();
            long idAux = championes.get(i).getId();
            int id = (int)idAux;

            Champion champion = lol.getChampion(id);
            nombres[i] = champion.getName();
        }
        
        
     
        return nombres;
    }
    

    public String getSummRank(long Id) throws JRiotException{
        String rank;
        lol.setApiKey("ad5f2333-5eb4-473f-a763-969480587d8c");
        lol.setRegion("las");
        
        List Summoner = lol.getLeagueEntries(Id);
        League liga = (League) Summoner.get(0);
        ArrayList entries = liga.getEntries();
        LeagueEntry ligaentry = (LeagueEntry) entries.get(0);
        rank = liga.getTier()+ " " + ligaentry.getDivision() + "";
        
        return rank;
    }
   
    public String getSummLP(long Id) throws JRiotException{
        String lp;
        lol.setApiKey("ad5f2333-5eb4-473f-a763-969480587d8c");
        lol.setRegion("las");
        
        List Summoner = lol.getLeagueEntries(Id);
        League liga = (League) Summoner.get(0);
        ArrayList entries = liga.getEntries();
        LeagueEntry ligaentry = (LeagueEntry) entries.get(0);
        lp = ligaentry.getLeaguePoints()+"";    
        
        return lp;
    }
    
    public Champion getSummMain(String nombre) throws JRiotException{
        Champion main;
        lol.setApiKey("ad5f2333-5eb4-473f-a763-969480587d8c");
        lol.setRegion("las");
        
        Summoner summ = lol.getSummoner(nombre);
        long id = summ.getId();
        RankedStats stats = lol.getRankedStats(id, 4);
        int maxGamesUsed= 0;
        int mainChampId = 115;
        ArrayList<ChampionStats> championes = stats.getChampions();
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
        
        return main;
    }
    
    public double getSummonerGeneralKDA(String nombre) throws JRiotException {
        double KDA= 0.00;
        lol.setApiKey("ad5f2333-5eb4-473f-a763-969480587d8c");
        lol.setRegion("las");
        
        Summoner summ = lol.getSummoner(nombre);
        long id = summ.getId();
        RankedStats stats = lol.getRankedStats(id, 4);
        ArrayList<ChampionStats> championes = stats.getChampions();
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
        
        KDA = kills+ assists;
        KDA = KDA/deaths;
        
        return KDA;
    }
}
    
        

