package com.springtraining.emailapp.repository;

import com.springtraining.emailapp.data.BlockchainInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface BlockchainInfoRepository extends MongoRepository<BlockchainInfo, String> {

    @Query("{firstName: '?0'}")
    List<BlockchainInfo> findByFirstName(String firstName);

}
