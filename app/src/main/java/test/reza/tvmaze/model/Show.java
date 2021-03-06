package test.reza.tvmaze.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;
import test.reza.tvmaze.model.Property.Image;
import test.reza.tvmaze.model.Property.Rating;
import test.reza.tvmaze.model.Property.Schedule;

/**
 * Class to expose an Show entity , retrieved  from TVMaze
 */

@JsonIgnoreProperties({ "_links" , "externals", "network" ,"weight" , "webChannel" , "premiered" , "updated"})
public class Show implements Serializable{

    @JsonProperty("id")
    private int  id;

    @JsonProperty("url")
    private String url;

    @JsonProperty("name")
    private String name;

    @JsonProperty("type")
    private String type;

    @JsonProperty("language")
    private String language;

    @JsonProperty("genres")
    private List<String> genres;

    @JsonProperty("status")
    private String status;

    @JsonProperty("runtime")
    private int runtime;

    @JsonProperty("officialSite")
    private String site;

    @JsonProperty("schedule")
    private Schedule schedule;

    @JsonProperty("rating")
    private Rating rating;

    @JsonProperty("image")
    private Image image;

    @JsonProperty("summary")
    private String summary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

}
