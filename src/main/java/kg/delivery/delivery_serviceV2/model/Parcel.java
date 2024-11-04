package kg.delivery.delivery_serviceV2.model;

import jakarta.persistence.*;
import kg.delivery.delivery_serviceV2.enums.ParcelStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "parcels")
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Parcel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    @ManyToOne
    @JoinColumn(name = "courier_id")
    User courier;

    @Column(name = "parcel_status", nullable = false)
    ParcelStatus status;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    @Column(nullable = false, name = "creation_date")
    Date creationDate;

    @Column(nullable = false, name = "pick_up_adress_id")
    Long pickupAddressId;

    @Column(nullable = false, name = "delivery_address_id")
    Long deliveryAddressId;

    @Column(nullable = false, name = "weight")
    Double weight;

    @ManyToOne
    @JoinColumn(name = "pickup_address_id")
    Address pickupAddress;

    @ManyToOne
    @JoinColumn(name = "delivery_address_id")
    Address deliveryAddress;

    @Override
    public String toString() {
        return "Parcel{" +
                "id=" + id +
                ", user=" + user +
                ", courier=" + courier +
                ", parcelStatus='" + status + '\'' +
                ", creationDate=" + creationDate +
                ", pickupAddress=" + pickupAddressId +
                ", deliveryAddress=" + deliveryAddressId +
                ", weight=" + weight +
                '}';
    }

}
