package com.example.demo.webscraper.util;

import com.example.demo.webscraper.YahooScraperService;
import com.example.demo.webscraper.models.CompleteRecord;
import org.junit.jupiter.api.Test;

public class WebscraperTest {

    @Test
    public void webscraperTest(){
        YahooScraperService yahooScraperService = new YahooScraperService();
        CompleteRecord record = yahooScraperService.scrape_symbol("CVAC", "2020-08-19", 3);
        System.out.println(record.toString_formatted());
    }
}
