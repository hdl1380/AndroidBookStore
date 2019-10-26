package com.example.bookstore.model;

import com.google.gson.annotations.SerializedName;

// 영화 상세 정보
public class Movie {
    long id;
    String title;
    String summary;
    @SerializedName(value = "small_cover_image")
    String smallCoverImage;
    @SerializedName(value = "medium_cover_image")
    String mediumCoverImage;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSmallCoverImage() {
        return smallCoverImage;
    }

    public void setSmallCoverImage(String smallCoverImage) {
        this.smallCoverImage = smallCoverImage;
    }

    public String getMediumCoverImage() {
        return mediumCoverImage;
    }

    public void setMediumCoverImage(String mediumCoverImage) {
        this.mediumCoverImage = mediumCoverImage;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", smallCoverImage='" + smallCoverImage + '\'' +
                ", mediumCoverImage='" + mediumCoverImage + '\'' +
                '}';
    }
}
