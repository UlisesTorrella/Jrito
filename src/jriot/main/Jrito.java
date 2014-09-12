/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jriot.main;
import java.io.Serializable;
import java.util.*;
import jriot.objects.*;
/**
 *
 * @author ulises
 */
public class Jrito implements Serializable{
    private JRiot lol = new JRiot();

    public Jrito() {
        lol.setApiKey(ApikeyAndRegion.getApiKey());
        lol.setRegion(ApikeyAndRegion.getRegion());
    }

    public Champion getChampion(int id) throws JRiotException{
        return lol.getChampion(id);
    }
    
    public RankedStats getRankedStats(long summonerId, int season) throws JRiotException{
        return lol.getRankedStats(summonerId, season);
    }
    
    public Summoner getSummoner(String name) throws JRiotException{
        return lol.getSummoner(name);
    }
    
    public RitoSummoner BuscarSummoner(String name) throws JRiotException{
        RitoSummoner summ = new RitoSummoner(name);
        
        return summ;
    }
    
    public RecentGames getRecentGames(long summonerId) throws JRiotException{
        return lol.getRecentGames(summonerId);
    }
    
    public String[] getChampsNameByList(ChampionList lista) throws JRiotException{
        String[] nombres = new String[lista.getChampionList().size()];
        lol.setApiKey(ApikeyAndRegion.getApiKey());
        lol.setRegion(ApikeyAndRegion.getRegion());
        
        for(int i = 0 ; i< lista.getChampionList().size(); i++ ){
            ArrayList<Champion> championes = lista.getChampionList();
            long idAux = championes.get(i).getId();
            int id = (int)idAux;

            Champion champion = lol.getChampion(id);
            nombres[i] = champion.getName();
        }
        
        
     
        return nombres;
    }
    

    public String getSummRank(long id) throws JRiotException{
        String rank;
        lol.setApiKey(ApikeyAndRegion.getApiKey());
        lol.setRegion(ApikeyAndRegion.getRegion());
        
        List Summoner = lol.getLeagueEntries(id);
        League liga = (League) Summoner.get(0);
        ArrayList entries = liga.getEntries();
        LeagueEntry ligaentry = (LeagueEntry) entries.get(0);
        rank = liga.getTier()+ " " + ligaentry.getDivision() + "";
        
        return rank;
    }
   
    public String getSummLP(long Id) throws JRiotException{
        String lp;
        lol.setApiKey(ApikeyAndRegion.getApiKey());
        lol.setRegion(ApikeyAndRegion.getRegion());
        
        List Summoner = lol.getLeagueEntries(Id);
        League liga = (League) Summoner.get(0);
        ArrayList entries = liga.getEntries();
        LeagueEntry ligaentry = (LeagueEntry) entries.get(0);
        lp = ligaentry.getLeaguePoints()+"";    
        
        return lp;
    }
    
    public long[] getFreeChampsID() throws JRiotException{
        long[] lista=new long[10];
        
        ChampionList champFree = lol.getFreeChampions();
        
        ArrayList<Champion> listaChamps = champFree.getChampionList();
        int cont = 0;
        //System.out.println(listaChamps.size());

        for(int i=0;i<listaChamps.size();i++){
            if(listaChamps.get(i).getId()!=86){
                if(listaChamps.get(i).getId()!=22){
                    System.out.println(listaChamps.get(i).getId());
                    long id = listaChamps.get(i).getId();
                    lista[cont]=id;
                    cont++;
                    if(cont==10){
                        return lista;
                    }
                }          
            }
        }
        
        return lista;
    }
    
}
    
        

