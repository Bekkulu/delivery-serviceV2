package kg.delivery.delivery_serviceV2.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(insertable = false, updatable = false)
    Long id;

    @Column(name = "username", unique = true, nullable = false)
    String username;

    @Column(nullable = false, unique = true, name = "email")
    String email;

    @Column(nullable = false, name = "password")
    String password;

    @Column(nullable = false, name = "phone")
    String phone;

    @ManyToOne
    @JoinColumn(name = "role_id")
    Role role;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phone + '\'' +
                ", roles=" + role +
                '}';
    }

//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return roles
//                .getPermissions()
//                .stream()
//                .map(authority -> new SimpleGrantedAuthority(authority.getPermissionName()))
//                .collect(Collectors.toList());
}


