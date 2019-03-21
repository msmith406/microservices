package com.captech.wessel.streams.developerConsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.MessageEndpoint;

@EnableBinding(Sink.class)
@MessageEndpoint
public class DeveloperListener {

    public static final Logger logger = LoggerFactory.getLogger(DeveloperListener.class);

    @StreamListener(Sink.INPUT)
    void logMessage (Developer dev){
        logger.info("Got message from Stream, [dev={}]", dev);
    }

}
