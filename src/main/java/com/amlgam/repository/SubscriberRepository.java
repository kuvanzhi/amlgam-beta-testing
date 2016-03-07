package com.amlgam.repository;

import com.amlgam.model.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by dima on 07.03.16.
 */
@Repository
public interface SubscriberRepository extends JpaRepository<Subscriber, Long> {
}
