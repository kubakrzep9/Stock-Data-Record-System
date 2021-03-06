package com.example.demo.webscraper.util;

import java.time.ZonedDateTime;

import static com.example.demo.webscraper.models.HistoricalData.default_time;
import static com.example.demo.webscraper.models.HistoricalData.dtf;

public class Validate {
    public static boolean validateJavaDate(String strDate) {
        // Create Date object parse the string into time_stamp
        try { ZonedDateTime zdt = ZonedDateTime.parse(strDate+" "+default_time, dtf); }
        // Date format is invalid
        catch (Exception e) { return false; }
        // Return true if time_stamp format is valid
        return true;
    }

    public static boolean validateSymbol(String symbol){
        char[] charArr = symbol.toCharArray();
        int size = charArr.length;
        if(size > 5 || size < 1){ return false; }
        for(char c : charArr){ if(!Character.isLetter(c)){ return false; }}

        return true;
    }

}
