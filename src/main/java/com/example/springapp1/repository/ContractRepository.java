package com.example.springapp1.repository;

import com.example.springapp1.entity.Contrat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public  class ContractRepository implements JpaRepository<Contrat, Integer> {

    @Override
    public List<Contrat> findAll() {
        return null;
    }

    @Override
    public List<Contrat> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Contrat> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Contrat> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Contrat entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Contrat> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Contrat> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Contrat> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Contrat> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Contrat> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Contrat> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Contrat> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Contrat getOne(Integer integer) {
        return null;
    }

    @Override
    public Contrat getById(Integer integer) {
        return null;
    }

    @Override
    public Contrat getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Contrat> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Contrat> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Contrat> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Contrat> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Contrat> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Contrat> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Contrat, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}

