package main;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        Document cv = new Document("Joanna Partyka - cv");
        String url  = "https://scontent-waw1-1.xx.fbcdn.net/v/t1.0-9/66377446_2666114893420515_771634356975304704_n.jpg?_nc_cat=109&_nc_ohc=NrKmOcNpUCgAQk_HELDm2Iva0pZSXuiYV8BsyvzFPnftCZEIrAY9kTOKg&_nc_ht=scontent-waw1-1.xx&oh=832527717c0cc50ab8ece645f484464f&oe=5E4A29B1";
        cv.setPhoto(url);
        cv.addSection("Wykształcenie")
                .addParagraph("2000-2005 Przedszkole im. Królewny Snieżki w ...")
                .addParagraph("2006-2012 SP7 im Ronalda Regana w ...")
                .addParagraph("...");
        cv.addSection("Umiejętności")
                .addParagraph("Nic nie umiem xD");
        try {
            cv.writeHTML(new PrintStream("cv.html", "ISO-8859-2"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}