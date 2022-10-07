package mision.agro.mision_agro.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import mision.agro.mision_agro.controller.dto.CategoryDto;
import mision.agro.mision_agro.controller.dto.ProductDto;
import mision.agro.mision_agro.model.Repository.CategoryRepository;
import mision.agro.mision_agro.model.Repository.ProductRepository;
import mision.agro.mision_agro.model.Repository.UserRepository;
import mision.agro.mision_agro.service.CatalogService;

@AllArgsConstructor
@Service

public class CatalogServiceImpl implements CatalogService{

    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;
    private final UserRepository userRepository;


    @Override
    public List<CategoryDto> getCategories() {
        var categories= categoryRepository.findAll(Sort.by("name"));

        return categories.stream()
        
        
        
        return null;
    }

    @Override
    public Optional<CategoryDto> getCategoryById(Integer id) {
        
        

        return Optional.empty();
    }

    @Override
    public List<ProductDto> getProductsByCategoryId(Integer categoryId) {
        
        

        return null;
    }

    @Override
    public ProductDto getProductsById(String id) {
        
        

        return null;
    }

    @Override
    public List<ProductImageDto> getProductsImageById(String id) {
        
        

        return null;
    }
    
}
