package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sala : sales) {
            totalSale += sala;
        }
        return totalSale;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;


    }


}
