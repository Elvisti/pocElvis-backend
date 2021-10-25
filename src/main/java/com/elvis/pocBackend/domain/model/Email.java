package com.elvis.pocBackend.domain.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;

@Builder
@Component
@Table(name = "EMAIL")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Email implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String email;
    @EqualsAndHashCode.Exclude
    @ManyToOne(targetEntity = com.elvis.pocBackend.domain.model.User.class)
    @JoinColumn(name = "user_id")
    private User userId;
}
