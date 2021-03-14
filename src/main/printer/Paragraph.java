package main.printer;

import java.io.PrintStream;

public class Paragraph implements HtmlElement {
    private String content;

    public Paragraph(String content){
        this.content=content;
    }

    public String getContent() {
        return content;
    }

    public Paragraph setContent(String content){
        this.content = content;
        return this;
    }

    @Override
    public void writeHTML(PrintStream out){
        out.println("<p>"+getContent()+"</p>");
    }
}