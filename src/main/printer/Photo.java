package main.printer;


import java.io.PrintStream;

public class Photo implements HtmlElement {
    private String url;

    public Photo(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public void writeHTML(PrintStream out) {
       out.printf("<img src=\"%s\" alt=\"Smiley face\" width=100/>\n", url);
    }
}


