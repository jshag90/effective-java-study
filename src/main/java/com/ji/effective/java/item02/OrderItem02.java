package com.ji.effective.java.item02;

import java.time.LocalDate;

public class OrderItem02 {

    public void updateDeliveryDate(LocalDate deliveryDate) {
        if (deliveryDate == null) {
            throw new NullPointerException("deliverDate is not null");
        }

        if (deliveryDate.isBefore(deliveryDate)) {
            throw new IllegalArgumentException("delivery Cant't be earlier than "+ LocalDate.now());
        }

        // Quiz checked exception과 unchecked exception의 차이는?
        // Quiz 간혹 선언부에 unchecked exception을 선언하는 이유는?
        // Quiz checked exception은 왜 사용하는가?
        // mission java에 모든 RuntimeException 클래스 이름 한번씩 읽기
    }
}
