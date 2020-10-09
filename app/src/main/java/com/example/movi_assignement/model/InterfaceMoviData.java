package com.example.movi_assignement.model;

import java.util.List;

public interface InterfaceMoviData {
    List<Movi> getMoviesname (String var);
    List<Movi> getMoviesyear (String var);
    List<Movi> getMoviescategory (String var);

    String [] getnames();
    String [] getyears();
    String [] getCategories();




}
