package main;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Document {
    private String title;
    private Photo photo;
    public List<Section> sections = new ArrayList<>();

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle() {
        return title;
    }


    public void setPhoto(String photoUrl){
        this.photo= new Photo(photoUrl);
    }
    public Photo getPhoto() {
        return photo;
    }

    public List<Section> getSections() {
        return sections;
    }
    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

    public Document(String title){
        setTitle(title);
    }

    public Section addSection(String sectionTitle){
        Section s = new Section(sectionTitle);
        sections.add(s);
        return s;
    }
    public Document addSection(Section s){
        sections.add(s);
        return this;
    }


    public void writeHTML(PrintStream out){
        out.println("<html>");
        out.println("<head><title>"+getTitle()+"</title></head>");
        out.println("<body>");
        out.println("<h1>"+getTitle()+"</h1>");
        Photo p = getPhoto();
        p.writeHTML(out);
        for (Section section: sections){
            section.writeHTML(out);
        }
        out.println("</body>");
        out.println("</html>");

    }
}
