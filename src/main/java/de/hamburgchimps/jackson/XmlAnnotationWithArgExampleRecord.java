package de.hamburgchimps.jackson;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public record XmlAnnotationWithArgExampleRecord(@JacksonXmlProperty(isAttribute = true) String example,
                                                @JacksonXmlProperty(isAttribute = true) String demo) {}
