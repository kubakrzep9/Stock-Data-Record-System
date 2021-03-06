package com.example.demo.common.util;

import org.junit.jupiter.api.Test;

import static com.example.demo.common.util.Analyis.*;
import static org.junit.jupiter.api.Assertions.*;

class AnalyisTest {

    @Test
    void calc_percent_change_test(){
        assertEquals(-66.5, calc_percent_change(112.12, 37.56));
        assertEquals(10, calc_percent_change(10, 11));
        assertEquals(-9.09, calc_percent_change(11, 10));
        assertEquals(0, calc_percent_change(1, 1));
    }


    @Test
    void calc_time_elapsed_Test() {
        assertEquals("1:30", calc_time_elapsed("8:30", "10:00"));
        assertEquals("0:30", calc_time_elapsed("8:30", "9:00"));
        assertEquals("3:20", calc_time_elapsed("09:15", "12:35"));
        assertEquals("12:00", calc_time_elapsed("09:00", "21:00"));
        assertEquals("0:06", calc_time_elapsed("8:30", "8:36"));
    }

    @Test
    void extract_hour_Test(){
        assertEquals(9, extract_hour("9:30"));
        assertEquals(9, extract_hour("09:30"));
        assertEquals(-1, extract_hour("HOOPLA"));
    }

    @Test
    void extract_minute_Test(){
        assertEquals(30, extract_minute("9:30"));
        assertEquals(1, extract_minute("9:01"));
        assertEquals(0, extract_minute("09:00"));
        assertEquals(-1, extract_minute("HOOPLA"));
    }
}