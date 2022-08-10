package com.allstate.directclaimsserver.data;

import com.allstate.directclaimsserver.domain.ClaimsTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimsRepository extends JpaRepository<ClaimsTransaction, Integer> {

}
