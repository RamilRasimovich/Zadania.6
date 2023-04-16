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

    public int monthMaximumSala(long[] sales) {
        int montMaximum = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[montMaximum]) {
                montMaximum = i;
            }

        }
        return montMaximum + 1;

    }

    public int monthMinimumSala(long[] sales) {
        int montMinimum = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[montMinimum]) {
                montMinimum = i;
            }

        }
        return montMinimum + 1;
    }

    public int monthsBellowAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                counter++;
            }
        }
        return counter;

    }
    public int monthsAboveAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > average(sales)) {
                counter++;
            }
        }
        return counter;

    }

}
