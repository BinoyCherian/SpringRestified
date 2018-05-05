package fr.epita.springrestified.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.epita.springrestified.datamodel.Login;

/**
 * The interface repository to manipulate the login objects in the database.
 * 
 * @author raaool
 *
 */
@Repository
public interface LoginRepository extends JpaRepository<Login, String>{

}
