package com.example.gestion.des.etudiants.Services;

import com.example.gestion.des.etudiants.Repository.EtudiantRepository;
import com.example.gestion.des.etudiants.entities.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceEtudiant {
    @Autowired
    private EtudiantRepository etudiantRepository;

    public void nouveauEtudiant( Etudiant etudiant ) {
        etudiantRepository.save(etudiant);
    }

    public Etudiant getEtudiantById(Integer id) {
        Optional<Etudiant> optional = etudiantRepository.findById(id);
        Etudiant etudiant;
        if (optional.isPresent()) {
            etudiant = optional.get();
        }
        else {
            throw new RuntimeException("Aucun etudiant pour l'identifiant :: "+ id);
        }
        return etudiant;
    }
}
