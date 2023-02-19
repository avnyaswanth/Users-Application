package com.users.application.usersjpa;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserMongoRepo extends MongoRepository<Users, UUID> {
}
