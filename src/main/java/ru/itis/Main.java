package ru.itis;

import ru.itis.crawler.WebCrawler;

public class Main {

    public static void main(String[] args) {
        WebCrawler webCrawler = new WebCrawler();
        webCrawler.start();
    }
}