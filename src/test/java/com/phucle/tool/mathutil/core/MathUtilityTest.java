package com.phucle.tool.mathutil.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    @Test   //mang ý nghĩa biến hàm ở dưới thành hàm main() thì mới chạy lệnh test được
    //test case #1: Verify getfactỏial with n = 0
    void testFactorialGivenRightArgument0RunsWell() {
        int n = 0;
        long expected = 1;     // hi vọng n = 0, tức là 0! sẽ có gi trị = 1
        long actual = MathUtility.getFactorial(n);
        assertEquals(expected,actual); // so sánh giúp tui xem thực tế có như kì vọng không. ko thi ra đỏ, tick đỏ
        //ngược lại xanh

    }

    //test case #2: Verify getfactỏial with n = 0
    @Test
    void testFactorialGivenRightArgument1RunsWell() {

        int n = 1;
        long expected = 1;     // hi vọng n = 0, tức là 0! sẽ có gi trị = 1
        long actual = MathUtility.getFactorial(n);
        assertEquals(expected,actual); // so sánh giúp tui xem thực tế có như kì vọng không. ko thi ra đỏ, tick đỏ
        //ngược lại xanh

    }

    //test case #3: Verify getfactỏial with n = 1
    @Test
    void testFactorialGivenRightArgumentRunsWell() {

        assertEquals(2,MathUtility.getFactorial(2)); // so sánh giúp tui xem thực tế có như kì vọng không. ko thi ra đỏ, tick đỏ
        //ngược lại xanh
        assertEquals(6,MathUtility.getFactorial(3));
        assertEquals(24,MathUtility.getFactorial(4));
        assertEquals(120,MathUtility.getFactorial(5));

    }

    //TEST CASE #4: BẮT NGOẠI LỆ
    //VERIFY FACTỎIAL() WITH N < 0, e.g. n =-5 to throw an Exception
    //steps:
    //1. given an invalid number, n= -5
    //2. call/invoke the function getFactorial(-5)
    //Expected result:
        // an illegalArgumentException will be thrown
    // nếu đưa -5 cà chớn, hy vọng sẽ nhìn thấy ngoại lệ
    @Test
    public void testFactorialGivenWrongArgumentMinus5ThrowsException() {
       assertThrows(IllegalArgumentException.class, () -> MathUtility.getFactorial(-5));
        //so sánh, đo xem, ngoại lệ có xuất hiện chưa nếu gọi -5!
        // cú pháp biểu thức lambda.
    }
}