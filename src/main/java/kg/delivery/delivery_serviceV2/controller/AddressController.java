package kg.delivery.delivery_serviceV2.controller;

import jakarta.persistence.TableGenerator;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor

public class AddressController {

    private final AddressController addressService;

    @PostMapping("/address/create")
    public ResponseEntity<?> createAddress(@RequestBody De)



    }

