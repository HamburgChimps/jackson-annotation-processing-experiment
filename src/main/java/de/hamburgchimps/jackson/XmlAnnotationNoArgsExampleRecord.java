package de.hamburgchimps.jackson;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public record XmlAnnotationNoArgsExampleRecord(@JacksonXmlProperty String example,
                                               @JacksonXmlProperty String demo) {
}
