package kg.delivery.delivery_serviceV2.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "courier")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Courier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "name", nullable = false)
    String name;

    @Column(name = "email", unique = true, nullable = false)
    String email;

    @Column(name = "phone", nullable = false)
    String phone;

    @OneToOne
    @JoinColumn(name = "user_id")
    User user;

    @Override
    public String toString() {
        return "Address{" +
                "id =" + id +
                ", courierName ='" + name + '\'' +
                ", courierEmail ='" + email + '\'' +
                ", courierPhone ='" + phone + '\'' +
                ", user =" + user.toString() +
                '}';
    }

}
