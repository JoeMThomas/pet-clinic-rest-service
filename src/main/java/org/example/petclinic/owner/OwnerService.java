package org.example.petclinic.owner;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OwnerService {

    private final OwnerRepository ownerRepository;

    public OwnerService(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    public List<Owner> getAllOwners() {
        return ownerRepository.findAll();
    }

    public Owner saveOwner(Owner owner) {
        return ownerRepository.save(owner);
    }

    public Optional<Owner> getOwnerById(Long id) {
        return ownerRepository.findById(id);
    }
}
