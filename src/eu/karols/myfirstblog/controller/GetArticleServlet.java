package eu.karols.myfirstblog.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import eu.karols.myfirstblog.model.Article;

public class GetArticleServlet extends HttpServlet {
	 
    private static final long serialVersionUID = 5397405593623536498L;
 
    /**
     * Parser, który ma za zadanie przetwarzanie
     * źródła posiadającego artykuł. Źródłem może 
     * być np HttpRequest
     */
    private ArticleParser articleParser;
 
    /**
     * DAO - typ klasy odpowiadający za połączenie
     * aplikacji ze źródłem danych, np. bazą danych.
     * To tutaj będzie znajdować się implementacja
     * JDBC.
     */
    private ArticleDAO articleDAO;
 
    //inicjalizacja komponentów
    public GetArticleServlet() {
        articleParser = new ArticleParser();
        articleDAO = new ArticleDAO();
    }
 
    //pobieranie artykułu z http POST
    public void doPost(HttpServletRequest request,
            HttpServletResponse response)   throws ServletException, IOException {
 
        //Wykorzystaj parser do artykułów i pobierz artykuł z requesta
        Article article = articleParser.parseArticleFromRequest(request);
 
        //zapisz artykuł do bazy danych
        articleDAO.save(article);
    }
}