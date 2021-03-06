package com.cegeka.repositories;

import com.cegeka.entities.Upload;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UploadRepository extends JpaRepository<Upload, Integer> {
}
