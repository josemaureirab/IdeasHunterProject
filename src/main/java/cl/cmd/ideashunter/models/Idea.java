package cl.cmd.ideashunter.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.Date;
import java.util.List;

@Document(collection = "ideas")
public class Idea {
    @Id
    private String id;
    private String title;
    private String description;
    private String category;
    private Integer valuation;
    private Date date;
    private List<String> comments;

    public Idea() {
    }

    public Idea(String title, String description, String category, Integer valuation, Date date) {
        this.title = title;
        this.description = description;
        this.category = category;
        this.valuation = valuation;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getValuation() {
        return valuation;
    }

    public void setValuation(Integer valuation) {
        this.valuation = valuation;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }
}
