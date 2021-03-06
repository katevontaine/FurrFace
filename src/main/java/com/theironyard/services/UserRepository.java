package com.theironyard.services;

import com.theironyard.entities.User;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by DrScott on 11/19/15.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
       User findOneByUsername(String username);
       List<User> findAllByNeighborhood(String neighborhood);
       List<User> findByPetType(String petType);
       List<User> findByPetAge(int petAge);
       User findOneById(int id);


       List<User> findTop4ByOrderByLikesDesc();
}
