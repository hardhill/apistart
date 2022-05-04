package hh.apistart.auth.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "user_data", schema = "onstart", catalog = "postgres")
@Getter
@Setter
public class UserData {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic
    @Column(name = "email", nullable = false, length = 150)
    private String email;
    @Basic
    @Column(name = "name", nullable = false, length = 100)
    private String name;
    @Basic
    @Column(name = "password", nullable = false, length = 255)
    private String password;
    @Basic
    @Column(name = "created_at", nullable = false)
    private Timestamp createdAt;
    @Basic
    @Column(name = "email_verified_at", nullable = true)
    private Timestamp emailVerifiedAt;
    @Basic
    @Column(name = "remeber_token", nullable = true, length = 100)
    private String remeberToken;
    @Basic
    @Column(name = "updated_at", nullable = false)
    private Timestamp updatedAt;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserData userData = (UserData) o;

        if (id != null ? !id.equals(userData.id) : userData.id != null) return false;
        if (email != null ? !email.equals(userData.email) : userData.email != null) return false;
        if (name != null ? !name.equals(userData.name) : userData.name != null) return false;
        if (password != null ? !password.equals(userData.password) : userData.password != null) return false;
        if (createdAt != null ? !createdAt.equals(userData.createdAt) : userData.createdAt != null) return false;
        if (emailVerifiedAt != null ? !emailVerifiedAt.equals(userData.emailVerifiedAt) : userData.emailVerifiedAt != null)
            return false;
        if (remeberToken != null ? !remeberToken.equals(userData.remeberToken) : userData.remeberToken != null)
            return false;
        if (updatedAt != null ? !updatedAt.equals(userData.updatedAt) : userData.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (emailVerifiedAt != null ? emailVerifiedAt.hashCode() : 0);
        result = 31 * result + (remeberToken != null ? remeberToken.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
