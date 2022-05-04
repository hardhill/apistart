package hh.apistart.api.entity

import lombok.Getter
import lombok.Setter
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "categories", catalog = "postgres", schema = "onstart")
@Getter
@Setter
class Category {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private val id: Long? = null

    @Basic
    @Column(name = "sports", nullable = false, unique = true)
    private lateinit var category: String

    fun getId(): Long? {
        return id
    }

    fun getCategory(): String {
        return category
    }

    fun setCategory(categoryName: String) {
        category = categoryName
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Category

        if (id != other.id) return false
        if (category != other.category) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + category.hashCode()
        return result
    }




}