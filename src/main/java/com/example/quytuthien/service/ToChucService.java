package com.example.quytuthien.service;

import com.example.quytuthien.entity.ToChuc;
import com.example.quytuthien.repository.IToChucRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToChucService {
    @Autowired
    private IToChucRepository toChucRepository;
    public List<ToChuc> layTatCaToChuc() {
        return toChucRepository.findAll();
    }

    public ToChuc layIdToChuc(Long matochuc) {
        return toChucRepository.findById(matochuc).orElse(null);
    }

    public void themToChuc(ToChuc toChuc) {
        toChucRepository.save(toChuc);
    }

    public void capNhatToChuc(ToChuc toChuc) {
        toChucRepository.save(toChuc);
    }

    public void xoaToChuc(Long maToChuc) {
        toChucRepository.deleteById(maToChuc);
    }
}
