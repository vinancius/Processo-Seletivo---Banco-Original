package br.com.vinicius.mvc.processoSeletivo.controller.dto;

public class ArestaDTO {
    private int distance;
    private String source;
    private String target;

    public ArestaDTO(int distance, String source, String target) {
        this.distance = distance;
        this.source = source;
        this.target = target;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

}
