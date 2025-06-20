package com.striver.a2z.contest;

import org.junit.Assert;
import org.junit.Test;

public class Q1GenerateVideoTag_ETest {
    Q1GenerateVideoTag_E q = new Q1GenerateVideoTag_E();

    @Test
    public void test1(){
        Assert.assertEquals("#leetcodeDailyStreakAchieved",q.generateTag("Leetcode daily streak achieved") );
    }

    @Test
    public void test2(){
        Assert.assertEquals("#canIGoThere",q.generateTag("can I Go There") );
    }

    @Test
    public void test3(){
        Assert.assertEquals("#hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh",q.generateTag("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh") );
    }

    @Test
    public void test4(){
        String str = "#riseOverMindGrowsForestPathOpenBrightlyFutureSoftlyHighWhispersIgnitesFriendSurfaceFastThingsBright";
        System.out.println(str.length());
        Assert.assertEquals("#riseOverMindGrowsForestPathOpenBrightlyFutureSoftlyHighWhispersIgnitesFriendSurfaceFastThingsBright", q.generateTag("Rise over mind grows forest path open brightly future softly high whispers ignites friend surface fast things bright plays music truth bird sun "));
    }

    @Test
    public void test5(){
//        String str = "#riseOverMindGrowsForestPathOpenBrightlyFutureSoftlyHighWhispersIgnitesFriendSurfaceFastThingsBright";
//        System.out.println(str.length());
        Assert.assertEquals("#fkvsgzfhqxpykrWtacvduhqeoRoevhioporzuiumdxhyvsJlfcrxcdqbvjgmzxxmzopupccEhmpzrnxilbpngylmcs", q.generateTag("FkVsgzfhQxPYKr WtaCvDuHQeo roeVHIoPorZuIuMDxhYVs jlfCrXCDqBVjgmzxxmZOpUpCc  eHMpZrNxilBPngylMcS"));
    }
}