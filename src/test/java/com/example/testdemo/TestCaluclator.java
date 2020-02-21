package com.example.testdemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCaluclator {
    // APPLICATION SRS 1. 정수 덧셈 2. 정수 뺄셈

    //annotation -> 부가설명 ,기능을 코드없이 설정
    @Test
    public void  testAdd(){
        Calculator cal = new Calculator();
        int result = cal.add(10,20);
       assertTrue(result ==30);

    }
    @Test
    public void testSubs(){
        Calculator cal =new Calculator() ;
        int result =cal.substract(20,10);
     assertTrue(result ==10);
    }
    @Test
    public void testAddError(){
        Calculator cal =new Calculator() ;
        int result =cal.add(20,10);
        assertFalse(result !=30);
    }
    @Test
    public void testSubsError(){
        Calculator cal =new Calculator() ;
        int result =cal.substract(10,20);
        assertEquals(-10 ,result,"결과는 -10이여야 합니다.");
    }
}
