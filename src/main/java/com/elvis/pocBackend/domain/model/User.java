package com.elvis.pocBackend.domain.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Component
@Entity
@Table(name = "USERS")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Integer id;
    private String name;
    private int age;

    @ElementCollection
    @OneToMany(mappedBy = "userId")
    private List<Email> emails;

    @ElementCollection
    @OneToMany(mappedBy = "userId")
    private List<Telephone> telephones;

    @ElementCollection
    @OneToMany(mappedBy = "userId")
    private List<Address> addresses;

}
