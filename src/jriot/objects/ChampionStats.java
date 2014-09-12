package jriot.objects;

import java.io.Serializable;

public class ChampionStats implements Serializable{

    private int id;
    private AggregatedStats stats;

    @Override
    public String toString() {
        return "ChampionStats [id=" + id + ", stats="
                + stats + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AggregatedStats getStats() {
        return stats;
    }

    public void setStats(AggregatedStats stats) {
        this.stats = stats;
    }

}
