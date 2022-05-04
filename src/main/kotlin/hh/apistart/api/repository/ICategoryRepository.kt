package hh.apistart.api.repository

import hh.apistart.api.entity.Category
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ICategoryRepository: JpaRepository<Category, Long> {

}