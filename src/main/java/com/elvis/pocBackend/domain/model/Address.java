package com.elvis.pocBackend.domain.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;

@Builder
@Component
@Table(name = "ADDRESS")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private AddressType type;
    private String address;
    private String addressName;
    private String city;
    private String state;
    private String postcode;

    @ManyToOne(targetEntity = com.elvis.pocBackend.domain.model.User.class)
    @JoinColumn(name = "user_id")
    private User userId;
}
