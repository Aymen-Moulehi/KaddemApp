package com.example.kaddemapp.services;

import com.example.kaddemapp.entities.Contrat;
import com.example.kaddemapp.entities.Equipe;
import com.example.kaddemapp.entities.Etudiant;
import com.example.kaddemapp.repositories.ContratRepository;
import com.example.kaddemapp.repositories.EquipeRepository;
import com.example.kaddemapp.repositories.EtudiantRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@Aspect
@Component
@Slf4j
public class EtudiantServiceImpl implements IEtudiantService{

    EtudiantRepository etudiantRepository;
    ContratRepository contratRepository;
    EquipeRepository equipeRepository;

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    //@Transactional finish all or stop
    @Transactional
    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe) {

        Equipe equipe = equipeRepository.findById(idEquipe).get();
        Contrat contrat = contratRepository.findById(idContrat).get();

        Etudiant etudiant = etudiantRepository.save(e);

        equipe.getEtudiants().add(etudiant);
        equipeRepository.save(equipe);

        contrat.setEtudiant(etudiant);
        contratRepository.save(contrat);

        return e;
    }


    @After("execution(* com.example.kaddemapp.services.*.*(..))")
    public void logSomethingForTest(){
        log.info("JUST_INFO");
    }

}
