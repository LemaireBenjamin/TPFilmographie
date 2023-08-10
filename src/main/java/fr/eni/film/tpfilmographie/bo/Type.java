package fr.eni.film.tpfilmographie.bo;



public class Type {
    private int id;
    private String label;


    public Type(int id, String label) {
        this.id = id;
        this.label = label;
    }

    public Type() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

}
