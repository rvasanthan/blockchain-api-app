package com.springtraining.emailapp.service.impl;

import com.springtraining.emailapp.data.BlockchainInfo;
import com.springtraining.emailapp.repository.BlockchainInfoRepository;
import com.springtraining.emailapp.service.BlockchainInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlockchainInfoServiceImpl implements BlockchainInfoService {

    @Autowired
    BlockchainInfoRepository repository;

    @Override
    public List<BlockchainInfo> findByAlt(String firstName) {

        return repository.findByFirstName(firstName);
    }
}
