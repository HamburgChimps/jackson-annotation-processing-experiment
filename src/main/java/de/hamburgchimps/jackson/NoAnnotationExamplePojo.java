package de.hamburgchimps.jackson;

public class NoAnnotationExamplePojo {
    private String example;
    private String demo;

    public NoAnnotationExamplePojo() {}

    public NoAnnotationExamplePojo(String example, String demo) {
        this.example = example;
        this.demo = demo;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public String getDemo() {
        return demo;
    }

    public void setDemo(String demo) {
        this.demo = demo;
    }
}
