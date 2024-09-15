package com.sundar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sundar.entity.OrderDetail;

@Repository
public interface OrderRepository extends JpaRepository<OrderDetail, Long> {
//	@Query(value = "SELECT * FROM order_detail WHERE amount > :amount", nativeQuery = true)
//	List<OrderDetail> findOrdersWithNativeQuery(Double amount);
//	
//	  @Query("SELECT o FROM OrderDetail o WHERE o.amount > :amount")
//	  List < OrderDetail > findOrdersWithAmountGreaterThan(Double amount);
	  
	  List<OrderDetail>findByAmountGreaterThan(Double amount);
}
