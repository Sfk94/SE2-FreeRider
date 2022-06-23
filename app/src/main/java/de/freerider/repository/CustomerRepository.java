package de.freerider.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import de.freerider.datamodel.Customer;

@Component
public abstract class CustomerRepository implements CrudRepository<Customer, Long> {

 
    
} 
