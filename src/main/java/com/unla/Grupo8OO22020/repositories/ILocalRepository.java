package com.unla.Grupo8OO22020.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.unla.Grupo8OO22020.entities.Local;

@Repository("localRepository")

public interface ILocalRepository extends JpaRepository<Local, Serializable>{
	public abstract Local findById(int id);



}