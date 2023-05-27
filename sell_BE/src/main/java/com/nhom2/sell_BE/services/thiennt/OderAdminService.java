package com.nhom2.sell_BE.services.thiennt;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.nhom2.sell_BE.payload.request.thiennt.OrderAdminRequest;

@Service
public interface OderAdminService {

  ResponseEntity<Object> getAllOderAdmin();

  ResponseEntity<Object> Order(OrderAdminRequest request);

}
