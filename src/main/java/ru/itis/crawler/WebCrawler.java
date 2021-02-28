package ru.itis.crawler;

import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class WebCrawler {
    private final File index = new File("src/main/resources/index.txt");
    private final File fileSites = new File("src/main/resources/sites.txt");

    private void getPageLinks() {
        try {
            Scanner scanner = new Scanner(fileSites);
            String path = "src/main/resources/files/";
            int i = 0;
            while (scanner.hasNextLine()) {
                String url = scanner.nextLine();
                Document document = Jsoup.connect(url).get();
                File fileName = new File(path + i + ".txt");
                savePages(document.text(), fileName);
                saveToIndex(i, url);
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void savePages(String text, File fileName) {
        try {
            FileUtils.writeStringToFile(fileName, text, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveToIndex(int docNumber, String link) {
        String fileIndexName = String.format("%d %s\n", docNumber, link);
        try {
            FileUtils.writeStringToFile(index, fileIndexName, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        getPageLinks();
    }
}
