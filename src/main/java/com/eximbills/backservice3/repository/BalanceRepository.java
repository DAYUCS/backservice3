package com.eximbills.backservice3.repository;

import com.eximbills.backservice3.domain.Balance;
import org.springframework.data.repository.CrudRepository;

public interface BalanceRepository extends CrudRepository<Balance, Long> {
}
