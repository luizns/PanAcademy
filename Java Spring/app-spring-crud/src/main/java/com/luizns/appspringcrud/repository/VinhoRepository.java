package com.luizns.appspringcrud.repository;

import com.luizns.appspringcrud.model.Vinho;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VinhoRepository extends JpaRepository<Vinho, Long> {
}
