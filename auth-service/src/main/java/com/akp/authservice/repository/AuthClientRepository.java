package com.akp.authservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.akp.authservice.domain.AuthClientDetails;

import java.util.Optional;

@Repository
public interface AuthClientRepository extends MongoRepository<AuthClientDetails, String> {
    Optional<AuthClientDetails> findByClientId(String clientId);
}
