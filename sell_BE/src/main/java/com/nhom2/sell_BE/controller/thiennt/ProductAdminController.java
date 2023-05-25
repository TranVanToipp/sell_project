package com.nhom2.sell_BE.controller.thiennt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.nhom2.sell_BE.payload.request.thiennt.ProductAdminRequest;
import com.nhom2.sell_BE.services.thiennt.ProductAdminService;

@RestController
@RequestMapping(value = "/api/v1/product_admin")
public class ProductAdminController {

  @Autowired
  private ProductAdminService productAdminService;

  @GetMapping("get_all")
  public ResponseEntity<Object> getAllProduct() {
    return productAdminService.getAllProductAdmin();
  }

  @PostMapping(value = "create", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE},
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Object> createProduct( @RequestParam("file") MultipartFile file, @ModelAttribute("request") ProductAdminRequest request) throws Exception {
     return productAdminService.CreateProductAdmin(file ,request);
  }

  @PutMapping(value = "/{id}", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE},
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Object> updateProduct(@RequestParam("file") MultipartFile file , @PathVariable("id") String id,
      @ModelAttribute("request") ProductAdminRequest productAdminRequest) {
    return productAdminService.updateProductAdmin(id, productAdminRequest, file);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Object> deleteProduct(@PathVariable("id") String id) {
    return productAdminService.deleteProductAdmin(id);
  }
}
