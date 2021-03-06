/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fullstack.webshop.dao;

import com.fullstack.webshop.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;


//@RepositoryRestResource(collectionResourceRel = "tag", path = "tag")

/**
 *
 * @author nzsom
 */
@CrossOrigin("http://localhost:4200")
@Repository
public interface TagRepository extends JpaRepository<Tag, Long>{
    
}
