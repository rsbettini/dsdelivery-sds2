package com.rsbettini.dsdelivery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rsbettini.dsdelivery.entities.Order;

public interface OrderRepository  extends JpaRepository<Order, Long>{

}
