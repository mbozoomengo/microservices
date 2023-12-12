package com.example.gestion.des.etudiants.Repository;


import com.example.gestion.des.etudiants.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {
    @Override
    Optional<Etudiant> findById(Integer integer);
}
