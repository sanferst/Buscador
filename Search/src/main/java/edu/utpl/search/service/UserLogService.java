package edu.utpl.search.service;

import edu.utpl.search.domain.UserLog;
import edu.utpl.search.repository.UserLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserLogService {

	@Autowired
	private UserLogRepository repository;
	
	public Boolean create(UserLog userLog) {
		UserLog saved = repository.save(userLog);
		if (saved == null) 
			return false;
		return true;
	}
}
