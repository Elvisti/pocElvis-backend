package com.elvis.pocBackend.domain.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;

@Builder
@Component
@Table(name = "TELEPHONE")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Telephone implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String number;
    @EqualsAndHashCode.Exclude
    @ManyToOne(targetEntity = com.elvis.pocBackend.domain.model.User.class)
    @JoinColumn(name = "user_id")
    private User userId;
}
