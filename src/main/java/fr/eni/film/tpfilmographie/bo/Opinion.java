package fr.eni.film.tpfilmographie.bo;

public class Opinion {
    private int id;
    private String opinion;
    private int rating;

    public Opinion(int id, String opinion, int rating) {
        this.id = id;
        this.opinion = opinion;
        this.rating = rating;
    }

    public Opinion() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
