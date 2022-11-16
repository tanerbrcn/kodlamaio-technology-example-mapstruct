package com.tanerbrcn.kodlamaiotechnologyexample.dataAccess.abstracts;

import com.tanerbrcn.kodlamaiotechnologyexample.model.concretes.entities.Technology;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnologyRepository extends JpaRepository <Technology,Integer> {
}
