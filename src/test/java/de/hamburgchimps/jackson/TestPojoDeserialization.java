package de.hamburgchimps.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.junit.jupiter.api.Test;

public class TestPojoDeserialization {
    private static final XmlMapper xmlMapper = new XmlMapper();

    private static final String NO_ANNOTATION_EXAMPLE_POJO_XML;
    private static final String JSON_PROPERTY_NO_ARGS_EXAMPLE_POJO_XML;
    private static final String XML_ANNOTATION_NO_ARGS_EXAMPLE_POJO_XML;
    private static final String JSON_PROPERTY_WITH_ARG_EXAMPLE_POJO_XML;
    private static final String XML_ANNOTATION_WITH_ARG_EXAMPLE_POJO_XML;

    static {
        try {
            NO_ANNOTATION_EXAMPLE_POJO_XML = xmlMapper.writeValueAsString(new NoAnnotationExamplePojo("hooray", "oh no"));
            JSON_PROPERTY_NO_ARGS_EXAMPLE_POJO_XML = xmlMapper.writeValueAsString(new JsonPropertyNoArgsExamplePojo("hooray", "oh no"));
            XML_ANNOTATION_NO_ARGS_EXAMPLE_POJO_XML = xmlMapper.writeValueAsString(new XmlAnnotationNoArgsExamplePojo("hooray", "oh no"));
            JSON_PROPERTY_WITH_ARG_EXAMPLE_POJO_XML = xmlMapper.writeValueAsString(new JsonPropertyWithArgExamplePojo("hooray", "oh no"));
            XML_ANNOTATION_WITH_ARG_EXAMPLE_POJO_XML = xmlMapper.writeValueAsString(new XmlAnnotationWithArgExamplePojo("hooray", "oh no"));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void NoAnnotation_pojo() throws JsonProcessingException {
        xmlMapper.readValue(NO_ANNOTATION_EXAMPLE_POJO_XML, NoAnnotationExamplePojo.class);
    }

    @Test
    void JsonProperty_pojo_no_args() throws JsonProcessingException {
        xmlMapper.readValue(JSON_PROPERTY_NO_ARGS_EXAMPLE_POJO_XML, JsonPropertyNoArgsExamplePojo.class);
    }

    @Test
    void JacksonXmlProperty_pojo_no_args() throws JsonProcessingException {
        xmlMapper.readValue(XML_ANNOTATION_NO_ARGS_EXAMPLE_POJO_XML, XmlAnnotationNoArgsExamplePojo.class);
    }

    @Test
    void JsonProperty_pojo_with_arg() throws JsonProcessingException {
        xmlMapper.readValue(JSON_PROPERTY_WITH_ARG_EXAMPLE_POJO_XML, JsonPropertyWithArgExamplePojo.class);
    }

    @Test
    void JacksonXmlProperty_pojo_with_arg() throws JsonProcessingException {
        xmlMapper.readValue(XML_ANNOTATION_WITH_ARG_EXAMPLE_POJO_XML, XmlAnnotationWithArgExamplePojo.class);
    }
}
