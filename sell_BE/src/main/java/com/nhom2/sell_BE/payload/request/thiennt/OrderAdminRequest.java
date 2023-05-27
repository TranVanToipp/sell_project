package com.nhom2.sell_BE.payload.request.thiennt;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import com.nhom2.sell_BE.payload.response.thiennt.OrderAdminResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderAdminRequest {
  
  private String userName;

  private String phoneNumber;

  private String address;

  private int numberProduct;

  private BigDecimal totalMoney;

  private Boolean status;

  private String orderId;

  private String productId;
  
  private String userId;
  
  private String provinceCityName;
}
