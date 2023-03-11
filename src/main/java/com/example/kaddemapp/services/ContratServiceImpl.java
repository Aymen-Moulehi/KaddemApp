package com.example.kaddemapp.services;

import com.example.kaddemapp.entities.Contrat;
import com.example.kaddemapp.repositories.ContratRepository;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@AllArgsConstructor
@Service
public class ContratServiceImpl implements IContratService{

    private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(Log.class.getName());
    ContratRepository contratRepository;

    @Scheduled(fixedDelay = 20000)
    void retrieveAndUpdateStatusContrat(){
        List<Contrat> contratList;
        contratList = contratRepository.findAll();
        Date limitDate = new Date(System.currentTimeMillis() + 15 * 24 * 60 * 60 * 1000);

        contratList.stream().filter(
                contrat -> {
                    if(limitDate.getTime()-contrat.getDateFinContrat().getTime()>0)
                        return true;
                    return false;
                }
        ).forEach(
                contrat -> log.info("THIS CONTRAT ID: "+contrat.getIdContrat()+" WILL BE EN IN "+contrat.getDateFinContrat())
        );

    }

}
