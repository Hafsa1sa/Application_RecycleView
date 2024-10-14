package com.example.app_galerie.dao;

import java.util.List;
public interface IDao<T>{
     boolean Create(T o);
     boolean update(T o);
     boolean delete(T o);
     T findById(int id);
     List<T> findAll();
}
