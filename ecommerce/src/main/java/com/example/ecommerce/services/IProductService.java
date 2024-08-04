package com.example.ecommerce.services;
import com.example.ecommerce.dtos.ProductDTO;
import com.example.ecommerce.dtos.ProductImageDTO;
import com.example.ecommerce.responses.ProductResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import com.example.ecommerce.models.*;

public interface IProductService {

    Product createProduct(ProductDTO productDTO) throws Exception;
    Product getProductById(long id) throws Exception;
    Page<ProductResponse> getAllProducts(PageRequest pageRequest);
    Product updateProduct(long id, ProductDTO productDTO) throws Exception;
    void deleteProduct(long id);
    boolean existsByName(String name);
    ProductImage createProductImage(
            Long productId,
            ProductImageDTO productImageDTO) throws Exception;

}
