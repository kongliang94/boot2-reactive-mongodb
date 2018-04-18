package com.example.boot.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.example.boot.entity.User;

public interface UserReactiveRepository extends ReactiveMongoRepository<User,String>{

}
