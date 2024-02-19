package dev.joaor.movies.repository;

import dev.joaor.movies.domain.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends MongoRepository<User, Integer> {
    @Query("{login:'?0'}")
    UserDetails findByLogin(String login);
}
