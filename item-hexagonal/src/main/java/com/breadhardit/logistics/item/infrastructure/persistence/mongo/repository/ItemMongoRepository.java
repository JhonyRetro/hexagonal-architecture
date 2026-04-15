package com.breadhardit.logistics.item.infrastructure.persistence.mongo.repository;

import com.breadhardit.logistics.item.infrastructure.persistence.entity.ItemEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ItemMongoRepository extends MongoRepository<ItemEntity, String>{
    List<ItemEntity> findByName(String name);
}
