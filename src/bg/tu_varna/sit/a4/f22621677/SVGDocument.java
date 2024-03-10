package bg.tu_varna.sit.a4.f22621677;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class SVGDocument {
    private ArrayList<SVGFigure> figures;
    private String filename;

    public SVGDocument() {
        this.figures = new ArrayList<>();
        this.filename = null;
    }

    public void openFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.startsWith("<rect") || line.startsWith("<circle")) {
                    String[] parts = line.split("\\s+");
                    String tag = parts[0].substring(1);
                    HashMap<String, String> attributes = parseAttributes(parts);
                    figures.add(new SVGFigure(tag, attributes));
                }
            }
            this.filename = filename;
            System.out.println("Successfully opened " + filename);
        } catch (IOException e) {
            System.out.println("File not found or error reading file.");
        }
    }

    private HashMap<String, String> parseAttributes(String[] parts) {
    }


