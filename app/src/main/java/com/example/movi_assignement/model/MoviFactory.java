package com.example.movi_assignement.model;

public class MoviFactory {
    public InterfaceMoviData GetModel()
    {
        return new MoviData();
    }
}

