package com.example.msa_ddd.account.domain.repository;

import com.example.msa_ddd.account.domain.model.Account;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AccountRepository extends PagingAndSortingRepository<Account, Long> {

    Account findByName(@Param("name") String name);
}
