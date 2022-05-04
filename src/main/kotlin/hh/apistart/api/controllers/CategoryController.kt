package hh.apistart.api.controllers

import hh.apistart.api.entity.Category
import hh.apistart.api.service.CategoryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/category")
class CategoryController {

    private var categoryService:CategoryService

    @Autowired
    constructor(categoryService: CategoryService) {
        this.categoryService = categoryService
    }

    @PostMapping("/all")
    fun all(): List<Category> {
        return categoryService.findAll()
    }
    @PutMapping("/add")
    fun add(@RequestBody categoryName:String): ResponseEntity<Category> {
        val category = Category()
        category.setCategory(categoryName)
        if(category.getId() != null && category.getId() != 0L){
            return ResponseEntity(HttpStatus.NOT_ACCEPTABLE)
        }
        if(category.getCategory() == null || category.getCategory().trim().length==0){
            return ResponseEntity(HttpStatus.NOT_ACCEPTABLE)
        }
        return ResponseEntity.ok(categoryService.add(category))
    }
}