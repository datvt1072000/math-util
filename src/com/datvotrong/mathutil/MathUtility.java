/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datvotrong.mathutil;

/**
 *
 * @author Vo Trong Dat
 */
public class MathUtility {
    // ta sẽ tạo các àm trong class này fake y chnang class math của JDK
    // các hàm sẽ sài chung ở nhiều nơi, làm tiện ích dùng chung
    // phàm cái gì dùng chung ta nghĩ tới STATIC

    public static final double PI = 3.1415; // y chang Math.PI

    public MathUtility() {
    }
// y chang Math.PI
    // lát hồi MathUtility.PI
    //hàm tính n! =1.2.3.4.5.6.7...n
    // Quy ước 0! = 1!=1
    // ko có giai thừa ầm
    // vì các giai thừa tăng cực nhanh về giá trị , 21 tràn kiểu Long
    // a sẽ không chế n đầu vào hàm từ 0.20
    //Kiểu long : 10^18, 18 con số 0 tối  đa

    /*  public static long getFactorial(int n){
       if (n<0 || n>20 )
       throw new IllegalArgumentException("Invalid argument . "+ 
               "n must be between 0..20");
       if(n==0 || n==1)
       return 1; 
       // đến đoạn này sure từ 2 đến 20
       long result =1;
       for(int i=2; i<=n;i++)
           result=result*i;
       return result;
               
       
    
    }
     */

    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument . "
                    + "n must be between 0..20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        // đến đoạn này sure từ 2 đến 20

        return n * getFactorial(n - 1);
    


    }
}
