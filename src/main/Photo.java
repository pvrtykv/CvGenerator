package main;


import java.io.PrintStream;

public class Photo {
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


    void writeHTML(PrintStream out) {
       out.printf("<img src=\"%s\" alt=\"Smiley face\" width=100/>\n", url);
    }
}


