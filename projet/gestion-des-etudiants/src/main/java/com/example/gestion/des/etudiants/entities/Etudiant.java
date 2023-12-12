package com.example.gestion.des.etudiants.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "etudiants")
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "matricule" , nullable = true)
    private String matricule;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "birthday")
    private Date birthday;
    @Column(name = "campus")
    private String campus;
    @Column(name = "circuit")
    private String circuit;
    @Column(name = "niveau")
    private int niveau;
    @Column(name = "filiere")
    private String filiere;
    @Column(name = "mail")
    private String mail;
    @Column(name = "bool", columnDefinition = "boolean default true")
    private Boolean bool = true;
}
