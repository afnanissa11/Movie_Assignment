package com.example.movi_assignement.model;

import java.util.ArrayList;
import java.util.List;

 class MoviData implements InterfaceMoviData {

    //ArrayList
    private ArrayList<Movi> movies = new ArrayList<>();

    //constructor
    public MoviData()   {

        //Comedy movies
      //  movies.add(new Movi("Book Smart", 2019, "Comedy"));
        movies.add(new Movi("Duck Soup", 1933, "Comedy"));
        movies.add(new Movi("In The Loop", 2009, "Comedy"));
        movies.add(new Movi("Best in show", 2000, "Comedy"));

        //Romantic movies
        movies.add(new Movi("All The Bright", 2020, "Romantic"));
        movies.add(new Movi("Always Be My Maybe", 2019, "Romantic"));
        movies.add(new Movi("The perfect Date", 2018, "Romantic"));
        movies.add(new Movi("Kabir Singh", 2015, "Romantic"));

        //Action movies
        movies.add(new Movi("Tente", 2020, "Action"));
        movies.add(new Movi("Mulan", 2020, "Action"));
        movies.add(new Movi("Jhone Wick", 2019, "Action"));
        movies.add(new Movi("Flight World", 2015, "Action"));
    }

    //get movies method
    public List<Movi> getMoviesname(String var) {
        ArrayList<Movi> namelist = new ArrayList<>();
        for (Movi varname : movies) {
            if (varname.getName().equals(var)) {
                namelist.add(varname);
            }
        }
        return namelist;

    }


    public List<Movi> getMoviesyear(String var) {
        ArrayList<Movi> yearlist = new ArrayList<>();
        for (Movi varyear : movies) {
            if (varyear.getName().equals(var)) {
                yearlist.add(varyear);
            }
        }
        return yearlist;

    }


    public List<Movi> getMoviescategory(String var) {
        ArrayList<Movi> categorylist = new ArrayList<>();
        for (Movi varcategory : movies) {
            if (varcategory.getName().equals(var)) {
                categorylist.add(varcategory);
            }
        }
        return categorylist;

    }



    //override the method

    public String[] getnames()
    {
        String [] nameslist=new String []{"Duck Soup","In The Loop","Best in show","All The Bright","Always Be My Maybe","The perfect Date","Kabir Singh","Tente","Mulan","Jhone Wick","Flight World"};
        return nameslist;
    }



    public String[]  getyears(){
        String [] yearlists= new String [] {"2019","1933","2009","2000","2020","2019","2018","2015","2020","2020","2019","2015"};
        return yearlists;
    }

    public String[] getCategories(){
        String [] categorylist= new String []{"Comedy","Romantic","Action"};
        return categorylist;
    }



    }



