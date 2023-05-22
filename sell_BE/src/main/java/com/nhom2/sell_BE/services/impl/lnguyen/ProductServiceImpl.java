package com.nhom2.sell_BE.services.impl.lnguyen;

import com.nhom2.sell_BE.entities.Comment;
import com.nhom2.sell_BE.entities.Product;
import com.nhom2.sell_BE.entities.ProductType;
import com.nhom2.sell_BE.payload.response.lnguyen.ProductResponse;
import com.nhom2.sell_BE.payload.response.lnguyen.ProductTypeResponse;
import com.nhom2.sell_BE.repositories.CommentRepository;
import com.nhom2.sell_BE.repositories.ProductRepository;
import com.nhom2.sell_BE.repositories.ProductTypeRepository;
import com.nhom2.sell_BE.services.lnguyen.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Value("${sellsmartphone.app.path-image}")
    private String pathImage;

    @Autowired
    private ProductTypeRepository productTypeRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public List<ProductTypeResponse> getAllProductByProductType() {
        List<ProductType> productTypes = productTypeRepository.findAll();
        if(productTypes.isEmpty()){
            return null;
        }
        List<ProductTypeResponse> productTypeResponses = new ArrayList<>();
        for (ProductType item : productTypes){
            productTypeResponses.add(setupResponse(item));
        }

        return productTypeResponses;
    }

    public ProductTypeResponse setupResponse(ProductType item){
        List<Product> products = productRepository.findAllByProductTypeIdWithLimit(item.getProductTypeId());
        ProductTypeResponse productTypeResponse = new ProductTypeResponse();
        if(products.isEmpty());
        else {
            productTypeResponse.setProductTypeId(item.getProductTypeId());
            productTypeResponse.setName(item.getName());
            List<ProductResponse> productResponses = new ArrayList<>();
            for (Product itemProduct : products){
                String thumbnail = pathImage + itemProduct.getProductId();
                List<Comment> comments = commentRepository.findAllByProduct(itemProduct);
                int numberStars = 0;
                int totalStars = 0;
                if(comments.isEmpty()){
                    numberStars = 5;
                }else {
                    for (Comment comment : comments){
                        totalStars += comment.getNumberStars();
                    }
                    numberStars = totalStars/comments.size();
                }
                ProductResponse productResponse = new ProductResponse(itemProduct.getProductId(),itemProduct.getTitle(),
                        itemProduct.getPrice(), itemProduct.getNumber(), thumbnail, itemProduct.getDiscount(), numberStars,
                        itemProduct.getReleaseTime(), itemProduct.getDescription());

                productResponses.add(productResponse);
            }
            productTypeResponse.setProducts(productResponses);
        }
        return productTypeResponse;
    }
}
