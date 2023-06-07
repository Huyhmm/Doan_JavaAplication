package com.example.quytuthien.repository;

import com.example.quytuthien.entity.ToChuc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IToChucRepository extends JpaRepository<ToChuc, Long> {
}

