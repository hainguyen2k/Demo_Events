package com.example.event_demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.event_demo.entity.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

	@Query(value = "SELECT * FROM events e WHERE e.event_name LIKE %:keyword%", nativeQuery = true)
	List<Event> findEventByKeyword(String keyword);

}
