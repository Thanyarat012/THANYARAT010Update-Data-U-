package com.thanyarat.cakesystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ch.qos.logback.core.joran.event.SaxEvent;

@Repository
public interface StudentRepository  extends JpaRepository<SaxEvent,Integer>{

}
