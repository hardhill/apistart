package hh.clipdb.auth.entity

import lombok.Getter
import lombok.Setter
import java.sql.Timestamp
import javax.persistence.*

@Entity
@Table(name = "user_data", schema = "onstart", catalog = "postgres")
@Getter
@Setter
class UserData {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private val id: Long? = null

    @Basic
    @Column(name = "email", nullable = false, length = 150)
    private val email: String? = null

    @Basic
    @Column(name = "name", nullable = false, length = 100)
    private val name: String? = null

    @Basic
    @Column(name = "password", nullable = false, length = 255)
    private val password: String? = null

    @Basic
    @Column(name = "created_at", nullable = false)
    private val createdAt: Timestamp? = null

    @Basic
    @Column(name = "email_verified_at", nullable = true)
    private val emailVerifiedAt: Timestamp? = null

    @Basic
    @Column(name = "remember_token", nullable = true, length = 100)
    private val rememberToken: String? = null

    @Basic
    @Column(name = "updated_at", nullable = false)
    private val updatedAt: Timestamp? = null
    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o == null || javaClass != o.javaClass) return false
        val userData = o as UserData
        if (if (id != null) id != userData.id else userData.id != null) return false
        if (if (email != null) email != userData.email else userData.email != null) return false
        if (if (name != null) name != userData.name else userData.name != null) return false
        if (if (password != null) password != userData.password else userData.password != null) return false
        if (if (createdAt != null) !createdAt.equals(userData.createdAt) else userData.createdAt != null) return false
        if (if (emailVerifiedAt != null) !emailVerifiedAt.equals(userData.emailVerifiedAt) else userData.emailVerifiedAt != null) return false
        if (if (rememberToken != null) rememberToken != userData.rememberToken else userData.rememberToken != null) return false
        return if (if (updatedAt != null) !updatedAt.equals(userData.updatedAt) else userData.updatedAt != null) false else true
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + (email?.hashCode() ?: 0)
        result = 31 * result + (name?.hashCode() ?: 0)
        result = 31 * result + (password?.hashCode() ?: 0)
        result = 31 * result + (createdAt?.hashCode() ?: 0)
        result = 31 * result + (emailVerifiedAt?.hashCode() ?: 0)
        result = 31 * result + (rememberToken?.hashCode() ?: 0)
        result = 31 * result + (updatedAt?.hashCode() ?: 0)
        return result
    }
}