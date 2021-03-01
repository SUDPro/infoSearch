**WebCrawler**

Это учебный проект. Программа скачиваниет веб-страницы сайтов и записывает содержимое в файл(название файла = индекс например _1.txt_),  которые
заданы в файле _sites.txt_. 

**Запуск программы**

Требования
   
    Java версии 8 или выше
    Maven версии 3.6.3 или выше
    Подключение к интернету
    
1. Скачивание проекта 

    http: `git clone https://github.com/SUDPro/infoSearch.git`

    ssh: `git clone git@github.com:SUDPro/infoSearch.git`

2. Запуск проекта

    С корневой папки `mvn clean install` 
    
    после _BUILD SUCCESS_ перейти в папку target `cd target/`
    
    Запустить программу с помощью `java -jar infoSearch-1.0.jar`
    
3. Результат
    
    Файл _index.txt_ лежит в папке _infoSearch\target\resources_
    
    Скачанные страницы лежат в папке _infoSearch\target\resources\files_