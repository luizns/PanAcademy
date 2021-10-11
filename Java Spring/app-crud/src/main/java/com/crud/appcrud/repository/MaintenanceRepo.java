package com.crud.appcrud.repository;

import com.crud.appcrud.model.MaintenanceModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaintenanceRepo extends JpaRepository<MaintenanceModel, Long> {

}
