package Lesson_7.HomeWork.logger;


import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    static String s;
//    public void Logger1() {
//    }

    static Logger logger(String s) throws IOException {
        try (FileWriter fw = new FileWriter("log.txt", false)) {
            //fw.write("line 1");
            //fw.append('добавить в файл');
            //fw.write("указать ошибку");
            //fw.flush();
        } catch (IOException ex) { // c помощью IOException ex можем посмотреть,
            // какая ошибка возникает при обработке файла
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public static Logger getLogger(String logger) throws IOException {
        return logger(s);
    }

    public void info(String найдена_разность_двух_комплексных_чисел) {
    }
}

