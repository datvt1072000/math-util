/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datvotrong.mathutil.test;

import com.datvotrong.mathutil.MathUtility;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
 public class MathhUtilityTest {
    // đặt tên chuẩn theo QA/QC test
    @Test // nó biến hàm này thành hàm mẹ
    public void testFactorialGivenRightArgumentReturnsGoodResult(){
        int n =5;
        long expected =120;
        long actual = MathUtility.getFactorial(n);
        assertEquals(expected, actual);
        assertEquals(720, MathUtility.getFactorial(6));
         assertEquals(24, MathUtility.getFactorial(4));
          assertEquals(6, MathUtility.getFactorial(3));
           assertEquals(2, MathUtility.getFactorial(2));
            assertEquals(1, MathUtility.getFactorial(1));
           
              // Màu đỏ đến có 2 nghĩa
              // Hàm tính đúng, kì vọng sai
              // Hàm tính sai, Kỳ vọng đúng
              // mỗi lời gọi hàm ở trên được gọi là test case
              // một tình huống test hàm, sẽ có 1 đầu vào và nhận đầu ra
    }
    // TEST ngoại lệ thì test như thế nào
    // vì khi ngoại lệ xảy ra app dừng liền
    // ko ổn đã diễn ra
    // thêm nữa, ngoại lệ không phải là 1 value để so sánh, không biết nó là số mấy chuỗi gì
    // ngoại lệ chỉ có thể ước lượng chạm nó xảy ra 
    // TEST ngoại lệ nên được đọc diễn giải như sau
    // Tui đưa vào các tình huống dữ liệu , ví dụ -5 
    // ví dụ 22, 40
    // tui muốn xem xem ngoại lệ có xảy ra tình hướng này hay không , vì neeys xảy ra thì OKE , app chạy đúng như thiết kế
    // tức là nếu như getFACTORIAL(-5) mà ném ra ngoại lệ IllegalArgumentEXCEPTION thì có nghĩa là hàm màu xanh
    // đừng bối rối khi có EXCEPTION mà lại xanh ,
    // xanh vì thiết trong tình huống -5 phỉa có ngoại lệ
    
    @Test(expected = IllegalArgumentException.class )
    public void testFactorialGivenWrongArgumentThrowsException(){
        MathUtility.getFactorial(-5);
        MathUtility.getFactorial(21);
        MathUtility.getFactorial(-1);
        MathUtility.getFactorial(40);
    }
}

// việc test dùng màu sắc , dùng thư viện unit test có quy ước
// nếu tất cả các cắp actual với expected giống mhau thì
// thì coi như hàm chạy đúng mọi tình hướng mà ta dẫ test -> XANH

// nếu trong tất cả các cặp mà ta đã test có ít nhát 1 cặp mà ta tets không giống nhau
// ít nhất 1 màu đỏ chứng tỏ hàm không ổn -> ĐỎ CHUNG
// Điều này đảm bảo rằng, hàm đã test các tình huống phải đúng hết các tình huống



