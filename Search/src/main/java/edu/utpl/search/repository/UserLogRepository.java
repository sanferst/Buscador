package edu.utpl.search.repository;

import edu.utpl.search.domain.UserLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLogRepository extends JpaRepository<UserLog, Long> {
}
