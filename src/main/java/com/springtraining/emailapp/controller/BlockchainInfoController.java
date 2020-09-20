package com.springtraining.emailapp.controller;

import com.springtraining.emailapp.data.BlockchainInfo;
import com.springtraining.emailapp.service.BlockchainInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("/blockchain-info")
public class BlockchainInfoController {

    @Autowired
    BlockchainInfoService service;

    @ResponseBody
    @GetMapping("/{firstName}")
    public List<BlockchainInfo> findByAlt(@PathVariable String altName) {
       List<BlockchainInfo> response = service.findByAlt(altName);
       return response;
    }

    @ResponseBody
    @GetMapping("/all")
    public List<BlockchainInfo> findAll() {
        List<BlockchainInfo> infos = new ArrayList<>();
        infos.add(new BlockchainInfo("0001", "COSMOS", 3.69));
        infos.add(new BlockchainInfo("0002", "TEZOS", 4.52));
        infos.add(new BlockchainInfo("0003", "ZCASH", 69.31));
        return infos;
    }
}
