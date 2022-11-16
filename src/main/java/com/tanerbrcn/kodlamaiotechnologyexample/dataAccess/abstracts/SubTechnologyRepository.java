package com.tanerbrcn.kodlamaiotechnologyexample.dataAccess.abstracts;

import com.tanerbrcn.kodlamaiotechnologyexample.model.concretes.entities.SubTechnology;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubTechnologyRepository extends JpaRepository<SubTechnology,Integer> {
}
