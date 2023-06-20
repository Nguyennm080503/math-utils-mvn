/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.minhnguyen.math.utils.core;

/**
 *
 * @author ADMIN
 */
public class MathUtils {
    public static final double PI = 3.1415;
    
    // tính n! = 1.2.3....
    // thiết kế/quy ước cho hàm/ method
    // 0! = 1! = 1
    // ko áp dung giai thừa cho số âm. Nếu n < 0, ném Exception
    // ko áp dụng giai thừa cho số > 20. Vì 20! vừa đur khít / khớp kiểu long 18 con số 0
    
    public static long getFactorial(int n){
        if(n == 0)
            return 1;
        if(n < 0 || n > 20)
           throw new IllegalArgumentException("Exception! Invalid n. n most be between 0...20");
         
         long actual = 1;
         for (int i = 1; i <= n; i++)
            actual *= i; 
        return actual;
    }
}
