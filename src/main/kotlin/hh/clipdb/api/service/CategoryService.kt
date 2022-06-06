package hh.clipdb.api.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CategoryService {
    var categoryRepository: ICategoryRepository

    @Autowired
    constructor(categoryRepository: ICategoryRepository) {
        this.categoryRepository = categoryRepository
    }

    fun findAll():List<Category>{
        return categoryRepository.findAll()
    }

    fun add(category: Category):Category{
        return categoryRepository.save(category)
    }
    fun update(category: Category){
        categoryRepository.save(category)
    }

    fun delete(id:Long){
        categoryRepository.deleteById(id)
    }
}