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
public abstract class ApikeyAndRegion {
    private static String region = "las";
    private static String apikey = "ad5f2333-5eb4-473f-a763-969480587d8c";
    private static int season =4;

    public static int getSeason() {
        return season;
    }

    public static void setSeason(int season) {
        ApikeyAndRegion.season = season;
    }
    

    public static String getRegion() {
        return region;
    }

    public static void setRegion(String regioon) {
        region = regioon;
    }

    public static String getApiKey() {
        return apikey;
    }

    public static void setApiKey(String apikeey) {
        apikey = apikeey;
    }
    
    
}
