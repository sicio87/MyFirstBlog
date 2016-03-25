package eu.karols.myfirstblog.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import eu.karols.myfirstblog.model.Article;

public class ArticleDAO {
	 
    /**
     * Tutaj należy zdefiniować użytkownika, hasło, adres oraz
     * sterownik do bazy danych z którą zamierzamy się połączyć.
     */
    private final static String DBURL = "jdbc:mysql://127.0.0.1:3306/MyFirstBlog";
    private final static String DBUSER = "root";
    private final static String DBPASS = "zaq1@WSX";
    private final static String DBDRIVER = "com.mysql.jdbc.Driver";
 
    //obiekt tworzący połączenie z bazą danych.
    private Connection connection;
    //obiekt pozwalający tworzyć nowe wyrażenia SQL
    private Statement statement;
    //zapytanie SQL
    private String query;
    //parser zapytań SQL dla obiektów klasy Article
    private SQLArticleParser sqlArticleParser;
 
    public ArticleDAO() {
        //inicjalizacja parserów
        sqlArticleParser = new SQLArticleParser();
    }
 
    public void save(Article article) {
        query = sqlArticleParser.createSaveQuery(article);
 
        try {
            Class.forName(DBDRIVER).newInstance();
            connection = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
            statement = connection.createStatement();
            statement.executeUpdate(query);
 
                        //zwolnienie zasobów i zamknięcie połączenia
                        statement.close();
                        connection.close();
        } catch (InstantiationException | IllegalAccessException
                | ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
