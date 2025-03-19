package com.example.demo.Service;

import com.example.demo.Entity.Organizator;
import com.example.demo.Repository.OrganizatorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizatorService {
    private OrganizatorRepository organizatorRepository;
    public OrganizatorService(OrganizatorRepository organizatorRepository){
        this.organizatorRepository = organizatorRepository;
    }
    //C,U
    public Organizator saveOrganizator(Organizator organizator){
        return organizatorRepository.save(organizator);
    }

    public List<Organizator> organizatorList() {
        return organizatorRepository.findAll();
    }

    public void deleteOrganizator(Long id) {
        organizatorRepository.deleteById(id);
    }
}
