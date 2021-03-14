package main.printer;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class UnorderedList implements HtmlElement {
    private List<HtmlElement> htmlElements = new ArrayList<>();

    public UnorderedList addElement(HtmlElement element) {
        htmlElements.add(element);
        return this;
    }

    @Override
    public void writeHTML(PrintStream out) {
        out.println("<ul>");
        for(HtmlElement element : htmlElements) {
            out.println("<li>");
            element.writeHTML(out);
            out.println("</li>");
        }
        out.println("</ul>");

    }
}
