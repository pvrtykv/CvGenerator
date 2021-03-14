package main;
import main.printer.Document;
import main.printer.Paragraph;
import main.printer.UnorderedList;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        String url  = "src/images/photo1.jpg";
        Document cv = new Document("Jan Kowalski - cv");
        cv.setPhoto(url);
        cv.addSection("Wykształcenie")
                .addElement(new Paragraph("2000-2005 Przedszkole im. Królewny Snieżki w ..."))
                .addElement(new Paragraph("2006-2012 SP7 im Ronalda Regana w ..."));
        cv.addSection("Umiejętności")
                .addElement(new UnorderedList()
                        .addElement(new Paragraph("Zdolność analitycznego myślenia"))
                        .addElement(new Paragraph("Komunikacja interpersonalna"))
                );




        try {
            cv.writeHTML(new PrintStream("cv.html", "ISO-8859-2"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}