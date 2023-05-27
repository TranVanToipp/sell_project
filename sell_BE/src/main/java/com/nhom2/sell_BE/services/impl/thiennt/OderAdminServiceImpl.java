package com.nhom2.sell_BE.services.impl.thiennt;

import java.security.SecureRandom;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.nhom2.sell_BE.entities.*;
import com.nhom2.sell_BE.payload.request.thiennt.OrderAdminRequest;
import com.nhom2.sell_BE.payload.response.thiennt.OrderAdminResponse;
import com.nhom2.sell_BE.repositories.OrderDetailsRepository;
import com.nhom2.sell_BE.repositories.OrderRepository;
import com.nhom2.sell_BE.repositories.ProductRepository;
import com.nhom2.sell_BE.repositories.ProvinceCityRepository;
import com.nhom2.sell_BE.repositories.UserRepositories;
import com.nhom2.sell_BE.services.thiennt.OderAdminService;

@Service
public class OderAdminServiceImpl implements OderAdminService {

  @Autowired
  private OrderDetailsRepository orderDetailsRepository;
  
  @Autowired
  private OrderRepository orderRepository;
  
  @Autowired
  private UserRepositories userRepositories;
  
  @Autowired
  private ProductRepository productRepository;
  
  @Autowired
  private ProvinceCityRepository provinceCityRepository;
  
  static final String RandomString = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  static SecureRandom rnd = new SecureRandom();

  static String randomString(int len) {
      StringBuilder sb = new StringBuilder(len);
      for (int i = 0; i < len; i++)
          sb.append(RandomString.charAt(rnd.nextInt(RandomString.length())));
      return sb.toString();
  }
  
  @Override
  public ResponseEntity<Object> getAllOderAdmin() {
    List<OrderDetails> lst = orderDetailsRepository.findAll();
    if (lst.isEmpty()) {
      return ResponseEntity.noContent().build();
    }
    OrderAdminResponse response = new OrderAdminResponse();
    for (OrderDetails o : lst) {
      response = OrderAdminResponse.builder().orderDetailsId(o.getOrderDetailsId())
          .userName(o.getUserName()).phoneNumber(o.getPhoneNumber()).address(o.getAddress())
          .numberProduct(o.getNumberProduct()).totalMoney(o.getTotalMoney())
          .createdAt(o.getCreatedAt()).updateAt(o.getUpdateAt()).status(o.getStatus())
          .orderId(o.getOrder().getOrderId()).productId(o.getProduct().getProductId()).build();
    }
    return ResponseEntity.ok().body(response);
  }

  @Override
  public ResponseEntity<Object> Order(OrderAdminRequest request) {
    Optional<User> user = userRepositories.findById(request.getUserId());
    Optional<Product> product = productRepository.findById(request.getProductId());
    if (user.isEmpty() || product.isEmpty()) {
      return ResponseEntity.noContent().build();
    }
    ProvinceCity pvc = provinceCityRepository.findByName(request.getProvinceCityName());
    Order order = Order
        .builder()
        .orderId("HD".concat(pvc.getProvinceCityId()).concat("_").concat(randomString(10)))
        .user(user.get())
        .build();
    
    Order orderNew = orderRepository.save(order);
    
    OrderDetails orderDetails = OrderDetails
        .builder()
        .address(request.getAddress())
        .numberProduct(request.getNumberProduct())
        .phoneNumber(request.getPhoneNumber())
        .status(request.getStatus())
        .totalMoney(request.getTotalMoney())
        .userName(request.getUserName())
        .order(orderNew)
        .product(product.get())
        .build();
    orderDetailsRepository.save(orderDetails);
    return ResponseEntity.ok().body("Create Success");
  }

}
