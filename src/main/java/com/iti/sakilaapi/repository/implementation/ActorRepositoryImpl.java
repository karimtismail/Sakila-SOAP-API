package com.iti.sakilaapi.repository.implementation;

import com.iti.sakilaapi.model.entity.Actor;
import com.iti.sakilaapi.repository.TransactionalEntityManager;
import com.iti.sakilaapi.repository.interfaces.ActorRepository;

public class ActorRepositoryImpl extends BaseEntityRepositoryImpl<Actor, Integer> implements ActorRepository {
    public ActorRepositoryImpl() {
        super(new TransactionalEntityManager(), Actor.class);
    }
}