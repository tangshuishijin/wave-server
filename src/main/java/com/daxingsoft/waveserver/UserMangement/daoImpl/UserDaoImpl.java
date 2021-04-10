package com.daxingsoft.waveserver.UserMangement.daoImpl;

import com.daxingsoft.waveserver.UserMangement.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserDaoImpl extends PagingAndSortingRepository<User, Long> {
    @Override
    Iterable<User> findAll(Sort sort);

    @Override
    Page<User> findAll(Pageable pageable);

    @Override
    <S extends User> S save(S s);

    @Override
    <S extends User> Iterable<S> saveAll(Iterable<S> iterable);

    @Override
    Optional<User> findById(Long aLong);

    @Override
    boolean existsById(Long aLong);

    @Override
    Iterable<User> findAll();

    @Override
    Iterable<User> findAllById(Iterable<Long> iterable);

    @Override
    long count();

    @Override
    void deleteById(Long aLong);

    @Override
    void delete(User user);

    @Override
    void deleteAll(Iterable<? extends User> iterable);

    @Override
    void deleteAll();

}
