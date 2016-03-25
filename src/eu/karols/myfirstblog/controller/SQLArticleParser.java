package eu.karols.myfirstblog.controller;
import eu.karols.myfirstblog.model.Article;

public class SQLArticleParser {
	 
    //Metoda tworząca zapytanie SQL zapisujące artykul do bazy
    public String createSaveQuery(Article article) {
        String query = "";
 
        /**
         * Dodaj do tabeli "articles" wartości id, title i text.
         * id jest nullem, ponieważ pole id jest autoinkrementowane
         * przez bazę danych.
         * INSERT INTO articles VALUES (NULL, 'title', 'text');
         */
        query = "INSERT INTO articles VALUES (NULL, '" + article.getTitle() + "', '" + article.getText() +"');";
 
        return query;
    }
}
