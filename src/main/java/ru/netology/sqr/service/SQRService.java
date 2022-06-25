
package ru.netology.sqr.service;

public class SQRService {

    public int sqrPants(int borderStart, int borderFinish) {
        int j = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= borderStart) {
                if (i * i <= borderFinish) {
                    j = j + 1;
                }
            }
        }
        return j;
    }
}


