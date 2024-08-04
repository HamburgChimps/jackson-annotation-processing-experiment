package de.hamburgchimps.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestPojoSerialization {
    static final XmlMapper xmlMapper = new XmlMapper();

    @BeforeAll
    static void setUpMapper() {
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    @Test
    void NoAnnotation_pojo() throws JsonProcessingException {
        var exampleFromNoAnnotationPojo = new NoAnnotationExamplePojo("hooray", "oh no");
        System.out.println(xmlMapper.writeValueAsString(exampleFromNoAnnotationPojo));
    }

    @Test
    void JsonProperty_pojo_no_args() throws JsonProcessingException {
        var exampleFromJsonPropertyNoArgsPojo = new JsonPropertyNoArgsExamplePojo("hooray", "oh no");
        System.out.println(xmlMapper.writeValueAsString(exampleFromJsonPropertyNoArgsPojo));
    }

    @Test
    void JacksonXmlProperty_pojo_no_args() throws JsonProcessingException {
        var exampleFromXmlAnnotationNoArgsExamplePojo = new XmlAnnotationNoArgsExamplePojo("hooray", "oh no");
        System.out.println(xmlMapper.writeValueAsString(exampleFromXmlAnnotationNoArgsExamplePojo));
    }

    @Test
    void JsonProperty_pojo_with_arg() throws JsonProcessingException {
        var exampleFromJsonPropertyWithArgPojo = new JsonPropertyWithArgExamplePojo("hooray", "oh no");
        System.out.println(xmlMapper.writeValueAsString(exampleFromJsonPropertyWithArgPojo));
    }

    @Test
    void JacksonXmlProperty_pojo_with_arg() throws JsonProcessingException {
        var exampleFromXmlAnnotationWithArgPojo = new XmlAnnotationWithArgExamplePojo("hooray", "oh no");
        System.out.println(xmlMapper.writeValueAsString(exampleFromXmlAnnotationWithArgPojo));
    }
}
