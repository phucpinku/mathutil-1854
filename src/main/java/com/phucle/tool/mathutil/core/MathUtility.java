package com.phucle.tool.mathutil.core;

public class MathUtility {
    // CLASS NÀY CHỨA CÁC HÀM STATIC LÀ NHỮNG HÀM TIỆN ÍCH DÙNG CHUNG CO MỌI NƠI

    // ĐÂY LÀ HÀM MÔ PHỎNG THƯ VIỆN TOÁN HỌC MATH, CỦA JDK
    // HÀM NÀY TÍNH N!
    // N! = 1.2.3...N
    // KO CÓ GIAI THỪA SỐ ÂM
    // 0! = 1
    // 20! VỪA ĐỦ KIỂU LONG, TỨC 21! VƯỢT KIỂU LONG
    public static long getFactorial(int n) {
        //đem code chính ra sửa gọi là refractor
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 0 and 20");
        }   // bạn đưa invalid data, ném ra ngoại lệ, hàm không đc chạy thành công, không value trả về
        if (n == 0)
            return 1;
        // sống sót đến đây n = 1...19
        //dùng for tính
        long result = 1; // thuật toán dồn con heo đất
        for (int i = 1; i <= n; i++) {
            result *= i;    //nhân dồn vào từng i
        }
        return result;
    }

}
