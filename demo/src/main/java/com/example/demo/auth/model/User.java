package com.example.demo.auth.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "tb_userLogin")
public class User {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Id private Long id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;



}
