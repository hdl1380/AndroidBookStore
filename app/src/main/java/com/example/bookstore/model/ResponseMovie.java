package com.example.bookstore.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseMovie {
    String status;
    @SerializedName("status_message")
    String statusMessage;
    ResponseData data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public ResponseData getData() {
        return data;
    }

    public void setData(ResponseData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseMovie{" +
                "status='" + status + '\'' +
                ", statusMessage='" + statusMessage + '\'' +
                ", data=" + data +
                '}';
    }

    public class ResponseData {
        @SerializedName(value = "movie_count")
        int movieCount;
        int limit;
        @SerializedName(value = "page_number")
        int pageNumber;
        List<Movie> movies;

        public int getMovieCount() {
            return movieCount;
        }

        public void setMovieCount(int movieCount) {
            this.movieCount = movieCount;
        }

        public int getLimit() {
            return limit;
        }

        public void setLimit(int limit) {
            this.limit = limit;
        }

        public int getPageNumber() {
            return pageNumber;
        }

        public void setPageNumber(int pageNumber) {
            this.pageNumber = pageNumber;
        }

        public List<Movie> getMovies() {
            return movies;
        }

        public void setMovies(List<Movie> movies) {
            this.movies = movies;
        }

        @Override
        public String toString() {
            return "ResponseData{" +
                    "movieCount=" + movieCount +
                    ", limit=" + limit +
                    ", pageNumber=" + pageNumber +
                    ", movies=" + movies +
                    '}';
        }
    }
}


