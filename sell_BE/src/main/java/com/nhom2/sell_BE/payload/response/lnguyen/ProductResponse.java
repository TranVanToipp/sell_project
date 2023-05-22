package com.nhom2.sell_BE.payload.response.lnguyen;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class ProductResponse {

    private String productId;

    private String title;

    private BigDecimal price;

    private int number;

    private String thumbnail;

    private int discount;

    private int numberStars;

    private int releaseTime;

    private String description;

}
