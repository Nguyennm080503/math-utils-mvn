/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.minhnguyen.math.utils.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ADMIN
 */
public class MathUtilsTest {
    //DDT -data driven testing(Parameterized Test) tách bộ data test ra khỏi lệnh test sau đó đưa thành tham số.
    @Test
    public void testFactorialGivenRightArgumentRunWell(){
        assertEquals(6, MathUtils.getFactorial(3));
    }
    
}
