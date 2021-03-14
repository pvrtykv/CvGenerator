package main.printer;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Section implements HtmlElement {
    private String title;
    private List<HtmlElement> htmlElements;


    public Section(String title){
        this.title = title;
        this.htmlElements = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public Section setTitle(String title){
        this.title = title;
        return this;
    }
    public Section addElement(HtmlElement element){
        htmlElements.add(element);
        return this;
    }



    public List<HtmlElement> getHtmlElements() {
        return htmlElements;
    }


    @Override
    public void writeHTML(PrintStream out){
        out.println("<h2>"+title+"</h2>");
        for (HtmlElement element : htmlElements) {
            element.writeHTML(out);
        }
    }
}
