package com.example.testdemo;

// xunit -> junit, jsunit, pyunit, cunit
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TestCalculator {
    // annotation - > 부가 설명, 기능을 코드 없이 설정
    @Test
    public void testAdd() {
    Calculator calc = new Calculator();
    int result = calc.add(10, 20);
        assertTrue(result == 30);
    }
    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        int result = calc.subtract(20, 10);
        assertTrue(result == 10);
    }
    @Test
    public void testAddError() {
        Calculator calc = new Calculator();
        int result = calc.add(20, 10);
        assertFalse(result != 30);
    }
    @Test
    public void testSubtractError() {
        Calculator calc = new Calculator();
        int result = calc.subtract(10, 20);
        assertEquals(10, result, "결과는 10이어야 합니다.");
    }
}
