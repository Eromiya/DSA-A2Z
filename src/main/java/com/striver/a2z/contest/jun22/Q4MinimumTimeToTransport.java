package com.striver.a2z.contest.jun22;

public class Q4MinimumTimeToTransport {
    public double minTime(int n, int k, int m, int[] time, double[] mul) {
        if (m == 0 || k <= 0 || time == null || time.length == 0 || mul.length == 0) {
            return -1;
        }

        int j = 0; // environmental stage
        int returned = -1; // value of returned person
        double totalTime = 0;
        int start = 0;
        boolean first = true;

        while (start < time.length) {
            int end;

            if (first) {
                end = Math.min(start + k, time.length); // full k in first round
                first = false;
            } else {
                end = Math.min(start + (k == 1 ? 1 : k - 1), time.length); // k-1 after
            }

            // compute max and min from current group + returned (if any)
            int[] mandm = minAndMax(time, returned, start, end);

            // Step 1: forward trip (with max)
            double stepTime = mandm[1] * mul[j];
            totalTime += stepTime;
            int add = (int) Math.floor(stepTime) % m;
            j = (j + add) % m;

            // Step 2: return trip only if people are left to move
            if (end < time.length) {
                stepTime = mandm[0] * mul[j];
                totalTime += stepTime;
                add = (int) Math.floor(stepTime) % m;
                j = (j + add) % m;

                returned = mandm[0]; // update returner for next round
            }

            // advance start based on trip
            start += (first ? k : (k == 1 ? 1 : k - 1));
        }

        return totalTime;
    }

    public int[] minAndMax(int[] time,int returned, int startWin, int endWin){
        int max ;
        int min;
        if(returned!=-1) {
            max = returned;
            min = returned;
        }
        else{
            max = Integer.MIN_VALUE;
            min = Integer.MAX_VALUE;
        }
        for(int i=startWin;i< endWin;i++){
            max = Math.max(max, time[i]);
            min = Math.min(min, time[i]);
        }
        return new int[]{min, max};
    }

    public double minTime1(int n, int k, int m, int[] time, double[] mul) {
        if (m == 0 || k <= 0 || time == null || time.length == 0 || mul.length == 0) {
            return -1;
        }

        int j = 0;
        int returned = -1;
        double totalTime = 0;
        int start = 0;
        boolean first = true;

        while (start < time.length) {
            int end;

            if (first) {
                end = Math.min(start + k, time.length);
                first = false;
            } else {
                end = Math.min(start + (k == 1 ? 1 : k - 1), time.length);
            }

            int[] mandm = minAndMax(time, returned, start, end);

            double stepTime = mandm[1] * mul[j];
            totalTime += stepTime;
            int add = (int) Math.floor(stepTime) % m;
            j = (j + add) % m;

            if (end < time.length) {
                stepTime = mandm[0] * mul[j];
                totalTime += stepTime;
                add = (int) Math.floor(stepTime) % m;
                j = (j + add) % m;

                returned = mandm[0];
            }

            start += (first ? k : (k == 1 ? 1 : k - 1));
        }

        return totalTime;

    }
    public int[] minAndMax1(int[] time,int returned, int startWin, int endWin){
        int max ;
        int min;
        if(returned!=-1) {
            max = returned;
            min = returned;
        }
        else{
            max = Integer.MIN_VALUE;
            min = Integer.MAX_VALUE;
        }
        for(int i=startWin;i< endWin;i++){
            max = Math.max(max, time[i]);
            min = Math.min(min, time[i]);
        }
        return new int[]{min, max};
    }
}
