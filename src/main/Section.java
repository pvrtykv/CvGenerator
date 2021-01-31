package main;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Section {
    public String title;
    public List<Paragraph> paragraphs = new ArrayList<>();


    public Section(String title){
        this.title = title;
    }
    public Section setTitle(String title){
        this.title = title;
        return this;
    }
    public Section addParagraph(String paragraphText){
        Paragraph p = new Paragraph(paragraphText);
        paragraphs.add(p);
        return this;
    }
    public Section addParagraph(Paragraph p){
        paragraphs.add(p);
        return this;
    }
    public void writeHTML(PrintStream out){
        out.println("<h2>"+title+"</h2>");
        for (Paragraph paragraph : paragraphs) {
            paragraph.writeHTML(out);
        }
    }
}
