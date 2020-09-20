package com.springtraining.emailapp.service;


import com.springtraining.emailapp.data.BlockchainInfo;

import java.util.List;

public interface BlockchainInfoService {

    List<BlockchainInfo> findByAlt(String altName);
}
