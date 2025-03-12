package com.teknologiinformasi.paymen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teknologiinformasi.paymen.model.Payment;


@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}

