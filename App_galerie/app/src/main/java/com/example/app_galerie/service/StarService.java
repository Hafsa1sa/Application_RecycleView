package com.example.app_galerie.service;

import com.example.app_galerie.beans.Star;
import com.example.app_galerie.dao.IDao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class StarService implements IDao<Star>{
    private List<Star> stars;
    private static StarService instance;
    //verifie qu il ya une seule instance
    public StarService(){
        this.stars=new ArrayList<>() ;
        }
    public static StarService getInstance() {
        if (instance == null) {
            instance = new StarService();  // Créer l'instance si elle n'existe pas
        }
        return instance;  // Retourner l'instance existante
    }
        @Override
    public boolean Create(Star s){
        return stars.add(s);
        }
        @Override
        public boolean delete(Star s){
        return stars.remove(s);
        }
        @Override
        public boolean update(Star o) {
        for(Star s : stars){
            if(s.getId() == o.getId()){
                s.setImg(o.getImg());
                s.setName(o.getName());
                s.setStar(o.getStar());
            } }
        return true;
    }
        @Override
       public Star findById(int id){
         for(Star star:stars){
             if(id==star.getId())
                 return star;
         }
         return null;
        }
    @Override
    public List<Star> findAll(){
        return stars;
        }

    }
