package com.nhom2.sell_BE.services.lnguyen;

import com.nhom2.sell_BE.payload.response.lnguyen.ProductTypeResponse;

import java.util.List;

public interface ProductService {

    List<ProductTypeResponse> getAllProductByProductType();
}
