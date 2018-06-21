package model.lab5;

import model.AbstractModel;

import java.io.*;

import static utils.Constant.*;

/**
 * Created by nimtego_loc on 21.06.2018.
 */
public class Lab5ReadingFromFile extends AbstractModel {

    private File file;

    public Lab5ReadingFromFile(String pathname) {
        if(file == null || !file.exists()){
            this.file = new File(pathname);
        }
    }

    @Override
    public String solution(String request) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append(SOURCE_FILE).append("\n");
            sb.append(reading()).append("\n");
            sb.append(MODIFIED_FILE).append("\n");
            record(request, true);
            sb.append(reading()).append("\n");
            System.out.println(4);
        } catch (IOException e) {
            return null;
        }
        return String.valueOf(sb);
    }

    @Override
    protected String setHeader() {
        return DESCRIPTION_LAB_5;
    }

    @Override
    protected String setQuestion() {
        return LAB_5_QUESTION;
    }
    private boolean record(String text, boolean writeToEnd) throws IOException {
        FileWriter fw = new FileWriter(file, writeToEnd);
        BufferedWriter bufferWriter = new BufferedWriter(fw);
        bufferWriter.write(text);
        bufferWriter.close();
        return true;
    }
    private String reading() throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();
        FileReader fr = new FileReader(file);
        int c;
        try {
            while ((c = fr.read()) != -1) {
                sb.append((char) c);
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return String.valueOf(sb);
    }
}
