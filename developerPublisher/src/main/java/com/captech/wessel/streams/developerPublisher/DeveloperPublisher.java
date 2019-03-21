package com.captech.wessel.streams.developerPublisher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@EnableScheduling
@Component
@EnableBinding(Source.class)
public class DeveloperPublisher {

    private static final Logger logger = LoggerFactory.getLogger(DeveloperPublisher.class);

    private final Source source;
    private final DeveloperFactory factory;

    DeveloperPublisher(Source source, DeveloperFactory factory){
        this.source = source;
        this.factory = factory;
    }

    @Scheduled(fixedRate = 1000)
    private void publish(){
        Developer dev = factory.build();
        logger.info("publisher created this dev: {}", dev);
        source.output().send(MessageBuilder.withPayload(dev).build());
    }
}
