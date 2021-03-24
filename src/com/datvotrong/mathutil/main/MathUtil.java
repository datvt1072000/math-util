/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datvotrong.mathutil.main;

import com.datvotrong.mathutil.MathUtility;

/**
 *
 * @author Admin
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // tui muốn test 5! có bằng 120 hay không ?
        int n=5;
        long expected = 120;
        long actual = MathUtility.getFactorial(n);
        System.out.println("5! expected = "+ expected +
                 "  5! actual = " + actual );
        n=0;
        expected = 1;
        actual = MathUtility.getFactorial(n);
        System.out.println("0! expected "+ expected  + 
                "    0! actual :" + actual );
                
    }
    
}

//Trong quy trinh lam PM, dân DEV có trách nhiệm phải test từng hàm
// Từng class mình tạo ra cần phải được test trước khi mình đóng gói gửi cho bên QA/QC Test
/* Độc lập , từng hàm , từng class phải được test cân thận trước khi chúng được dùng để phối hợp với các class khác . TEST ngay mức hàm, mức class vừa hoàn thiện, chưa thèm bàn về UI 
Thì mức độ test sớm này gọi là UNIT TEST _ TEST TỪNG ĐƠN THẺ ĐƠN VỊ CODE
VẬY LÀM SAO ĐỂ TEST TỪNG HÀM TỪNG CLASS???


1. Cách 1 : Dùng sout : GỌI HÀM CẦN TEST 

2. Cách 2 : Dùng JOPTIONPANE của môn Java DESTOP 

3. Cách 3 L Dùng LG FILE, trang WEB in ra kết quả sử lí của hàm ( môn Java Web)

dù là cách nào ta cũng phải in ra giá trị hàm đã xử lí
gọi hàm là ACTUAL VALUE
rồi ta đi so sánh các giá trị trả về của hamf có giống ta tính toán trước đó hay không , cái ta hy vọng hàm sẽ trả về  - gọi là EXPECTED VALUE

nếu ACTUAL VALUE == EXPECTED VALUE -> Hàm chạy ngon
Khác -> Hàm Sai
// Nguyên tắc của việc test , so sánh ACTUAL  -- EXPECTED

3 CÁCH NÀY CÓ CHUNG 1 NGUYÊN TĂC
GỌI HÀM ĐẺ XEM HÀM XỬ LÝ RA KEEYS QUẢ MẤY
SAU ĐÓ DÙNG MẮT ĐỂ SO SÁNH ACTUAL VỚI EXPECTED RỒI TA TỰ KẾT LUẬN
CASH NÀY TIỀM ẨN NHIỀU SAI SÓT KHI TA CÓ QUÁ NHIỀU CẶP VALUE
VÍ DỤ GTHUA() PHẢI TEST TRUOWNFH HỢP n=1,=2=3=4=5=....
20 BIÊN

MỖI n ĐỂ TEST TA GỌI LÀ 1 TÌNH HUỐNG SÀI HÀM , 1 TÌNH HUỐNG TEST
TEST CASE 

CÁCH 4: KHÔNG THÈM NHÌN BẰNG MẮT TỪNG TRƯỜNG HỢP
SỬ DỤNG MÁY TỰ SO SÁNH : mÁY QUÉT TÁT CẢ CAC CẶP EXPECTED VÀ ACTUAL
NẾU TẤT CẢ KHỚP BÀO MÀU XANH - GOOD CODE
NẾU CÓ XUẤT HIỆN ÍT NHẤT 1 THẰNG KHÔNG KHỚP BÁO MÀU ĐỎ- CODE CÓ TRỤC TRẶC
MUỐN LMF ĐIỀU NÀY TA CẦN THƯ VIỆN PHỤ TRỢ
JV: JUnit; TestNG
C# :NUnit , MSUnit ; XUnit
PHP : PHPUnit
.. Mọi ngôn ngữ đều có thư viện xanh đỏ giúp cảnh báo hàm tốt hay không


*/ 

//TRONG QUY TRINH LAM PHAN MEM , DAN DEV CO TRACH NGHIEM TEST TUNG HAM 
    // TRUOC KHI DONG GOI CHO BEN QA/QC TEST
    //DOC LAP , TUNG HAM , TUNG CLASS PHAI DOI DUOC TEST CAN THAN TRUOC KHI CHUNG
    // DUOC DUNG DE PHOI HOP VOI CAC CLASS KHAC , TEST NGAY MUC HAM , MUC CLASS
    // VUA HOAN THIEN , CHUA THEM BAN VE UI , THI MUC DO TEST SOM NAY GOI LA
    // UNIT TEST LEVEL - TEST TUNG DON THE , DON VI CODE
    
    //vậy làm sao để test từng hàm , từng class??
    // có nhiều cách dùng để test từng hàm , từng class
    // cách 1 : Dùng sout(gọi hàm cần test) để in ra giá trị xử lí của hàm
    // DÙng trong OOP
    
    // Cách 2 : DÙng Jop của môn java desktop để pop-up một cửa sổ
    // in ra kết quả xử lí hàm để kiểm tra coi hàm chạy đúng hay sai
    
    // cách 3: Dùng LOG FILE . trang web inra kết quả xử lí của hàm ( java web)
    
    // DÙ gọi cách nào thì ta cũng cần phải in ra giá trị hàm xử lí
    // gọi là ACTUAL VALUE
    // rồi ta đi so sách trá trị trả về của hàm có giống như ta tính toán //
    // trước đó hay kp , cái ta hy vọng hàm sẽ trả về - gọi là EXOECTED VALUE
    
    // nếu ACTUAL VALUE == EXPECTED VALUE--> hàm chạy ngon
     //                     KHÁC     -->Hàm sai
    // nguyên tắc của việc test : so sánh ACTUAL với EXPECTED