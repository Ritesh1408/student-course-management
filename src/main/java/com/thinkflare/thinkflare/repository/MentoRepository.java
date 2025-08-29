package com.thinkflare.thinkflare.repository;

import com.thinkflare.thinkflare.entities.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MentoRepository extends JpaRepository<Mentor, Long> {

}
