package com.lophiester.dsvendas.service;

import com.lophiester.dsvendas.dto.SellerDTO;
import com.lophiester.dsvendas.entities.Seller;
import com.lophiester.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {
    @Autowired
    private SellerRepository sellerRepository;

    public List<SellerDTO> findAll() {
       List<Seller> result= sellerRepository.findAll();
       return result.stream().map(SellerDTO::new).collect(Collectors.toList());
    }
}
