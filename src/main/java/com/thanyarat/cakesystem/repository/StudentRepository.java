package com.thanyarat.cakesystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.qos.logback.core.joran.event.SaxEvent;

public interface StudentRepository  extends JpaRepository<SaxEvent,Integer>{

}


