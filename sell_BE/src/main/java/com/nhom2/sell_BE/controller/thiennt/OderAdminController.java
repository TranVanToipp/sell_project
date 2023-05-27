package com.nhom2.sell_BE.controller.thiennt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nhom2.sell_BE.payload.request.thiennt.OrderAdminRequest;
import com.nhom2.sell_BE.services.thiennt.OderAdminService;

@RestController
@RequestMapping(value = "/api/v1/oder_admin")
public class OderAdminController {
  @Autowired
  private OderAdminService oderAdminService;

  @GetMapping("/get_all")
  public ResponseEntity<Object> getAllOder() {
    return oderAdminService.getAllOderAdmin();
  }
  
  @PostMapping("/create")
  public ResponseEntity<Object> createOrder(@RequestBody OrderAdminRequest request) {
     return oderAdminService.Order(request);
  }
}
