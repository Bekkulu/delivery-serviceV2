package kg.delivery.delivery_serviceV2.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@Entity
@Table(name = "addresses")
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false, name = "city")
    String city;
    @Column(nullable = false, name = "Street")
    String street;
    @Column(nullable = false, name = "house_number")
    String houseNumber;
    @Column(nullable = false, name = "apartment")
    String apartment;
    @Column(nullable = false, name = "postal_code")
    String postalCode;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    @ManyToOne
    @JoinColumn(name = "courier_id")
    Courier courier;

    @Override
    public String toString() {
        return "Address{" +
                "id =" + id +
                ", city ='" + city + '\'' +
                ", street ='" + street + '\'' +
                ", houseNumber ='" + houseNumber + '\'' +
                ", apartment ='" + apartment + '\'' +
                ", postalCode ='" + postalCode + '\'' +
                ", user =" + user.toString() +
                '}';
    }

}
