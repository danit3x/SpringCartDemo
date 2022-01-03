package com.danito.cart.entities;

import lombok.*;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Table(name = "customers")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String email;

    private String password;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "adress_line1")
    private String adressLine1;
    @Column(name = "adress_line2")
    private String adressLine2;

    private String city;

    private String state;
    @Column(name = "country_id")
    private int countryId;
    @Column(name = "postal_code")
    private String postalCode;
    @Column(name = "created_time")
    private OffsetDateTime createdTime = OffsetDateTime.now();

    private int enabled;

    @Column(name = "verification_code")
    private String verificationCode;
    @Column(name = "auth_provider")
    private String authProvider;
    @Column(name = "reset_password_token")
    private String resetPasswordToken;
}

