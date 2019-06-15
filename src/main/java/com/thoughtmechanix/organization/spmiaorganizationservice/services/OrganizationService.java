package com.thoughtmechanix.organization.spmiaorganizationservice.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.thoughtmechanix.organization.spmiaorganizationservice.model.Organization;
import com.thoughtmechanix.organization.spmiaorganizationservice.repository.OrganizationRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class OrganizationService {
    
    private final OrganizationRepository orgRepository;

    public Organization getOrg(String organizationId) {
        return orgRepository.findById(organizationId).orElse(null);
    }

    public void saveOrg(Organization org){
        org.setId( UUID.randomUUID().toString());

        orgRepository.save(org);

    }

    public void updateOrg(Organization org){
        orgRepository.save(org);
    }

    public void deleteOrg(Organization org){
        orgRepository.deleteById(org.getId());
    }
}