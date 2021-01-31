package main;

import java.io.PrintStream;

public class Paragraph {
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

    public void writeHTML(PrintStream out){
        out.println("<p>"+getContent()+"</p>");
    }
}