package com.example.springfeign;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<Usuario, Long> {

}
