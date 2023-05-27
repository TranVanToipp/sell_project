package com.nhom2.sell_BE.payload.response.thiennt;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderAdminResponse {
  
  private String orderDetailsId;
  
  private String userName;

  private String phoneNumber;

  private String address;

  private int numberProduct;

  private BigDecimal totalMoney;

  private Boolean status;

  private LocalDateTime createdAt;

  private LocalDateTime updateAt;

  private String orderId;

  private String productId;
}
