package com.example.gestion.des.etudiants.Controller;

import com.example.gestion.des.etudiants.Repository.EtudiantRepository;
import com.example.gestion.des.etudiants.Services.ServiceEtudiant;
import com.example.gestion.des.etudiants.entities.Etudiant;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Service
@RequestMapping("/getud")
public class EtudiantController {

    @Autowired
    private EtudiantRepository etudiantRepository;
    @Autowired
    private ServiceEtudiant etudiantServ;

    @Autowired
    private ServiceEtudiant serviceEtudiant;

    public void nouveauEtudiant( Etudiant etudiant
    ) {
        etudiantRepository.save(etudiant);

    }

    @GetMapping("/ListeEtudiant")
    public List<Etudiant> nouveauEtudiant(Model model){
        List<Etudiant> list = etudiantRepository.findAll();
        Etudiant etudiant=new Etudiant();
        model.addAttribute("Etudiant",etudiant);
        return list;
    }

    @GetMapping("/delC/{id}")
    public void deleClient(@PathVariable(value = "id") Integer id){
        Etudiant etudiant = etudiantServ.getEtudiantById(id);
        if (etudiant != null) {
            etudiant.setBool(false);

            // Assuming you have a service or repository to save the changes
            AjouEtudiant(etudiant);
        }
    }


    @PostMapping("/AjouterEtudiant")
    public void   AjouEtudiant(@RequestBody Etudiant etudiant){
        // creation de l'etudiant
        serviceEtudiant.nouveauEtudiant(etudiant);
    }
}