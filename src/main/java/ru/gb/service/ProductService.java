package ru.gb.service;

import java.util.List;
import org.springframework.stereotype.Service;
import ru.gb.dto.Product;
import ru.gb.repository.ProductRepository;

@Service
public class ProductService {
  private ProductRepository productRepository;

  public ProductService(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public List<Product> getAll() {
    return productRepository.getAll();
  }

  public void save(Product product) {
    productRepository.save(product);
  }

  public Product findById(int id) {
    return productRepository.findById(id);
  }
}
