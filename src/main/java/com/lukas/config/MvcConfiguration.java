//package com.lukas.config;
//
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.MediaType;
//import org.springframework.http.converter.HttpMessageConverter;
//import org.springframework.http.converter.xml.MarshallingHttpMessageConverter;
//import org.springframework.oxm.jibx.JibxMarshaller;
//import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by Leon on 2017-01-04.
// */
//@Configuration
//@EnableWebMvc
//@ComponentScan(basePackages="com.tickets")
//public class MvcConfiguration extends WebMvcConfigurerAdapter{
//
//
////    @Bean
////    public ViewResolver cnViewResolver(ContentNegotiationManager cnm) {
////        ContentNegotiatingViewResolver cnvr =
////                new ContentNegotiatingViewResolver();
////        cnvr.setContentNegotiationManager(cnm);
////        return cnvr;
////    }
//    //    @Override
////    public void configureContentNegotiation(
////            ContentNegotiationConfigurer configurer) {
////        configurer.defaultContentType(MediaType.APPLICATION_XML);
////    }
////    @Override
////    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
////        configurer.favorPathExtension(true)
////                .useJaf(false)
////                .ignoreAcceptHeader(true)
////                .mediaType("html", MediaType.TEXT_HTML)
////                .mediaType("json", MediaType.APPLICATION_JSON)
////                .defaultContentType(MediaType.TEXT_HTML);
////    }
////    @Override
//    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
//        configurer.defaultContentType(MediaType.APPLICATION_JSON);
//        configurer.favorPathExtension(true);
//        configurer.mediaType("xml", MediaType.TEXT_XML);
//    }
////    @Override
////    public void configureMessageConverters(List<HttpMessageConverter< ? >> converters) {
////    }
//    @Override
//    public void configureMessageConverters(List<HttpMessageConverter< ?>> converters) {
//
//        List<MediaType> mediaType = new ArrayList<>();
//        mediaType.add(MediaType.TEXT_XML);
//
//        MarshallingHttpMessageConverter xmlConverter = new MarshallingHttpMessageConverter();
//        xmlConverter.setSupportedMediaTypes(mediaType);
//
//        JibxMarshaller xstreamMarshaller = new JibxMarshaller();
//        xmlConverter.setMarshaller(xstreamMarshaller);
//        xmlConverter.setUnmarshaller(xstreamMarshaller);
//
//        converters.add(xmlConverter);
//    }
//}
