package com.vizury.async.server;


import io.netty.util.internal.logging.InternalLoggerFactory;
import io.netty.util.internal.logging.Slf4JLoggerFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class BidServer {

    static {
        // initiate SLF4J Logger Factory setting
        InternalLoggerFactory.setDefaultFactory(new Slf4JLoggerFactory());
    }

    private final Logger logger = LoggerFactory.getLogger(RPCServer.class);
    private static Config conf = ConfigFactory.load();

    private static HashMap<String,Object> objects =new HashMap<String,Object>();

    private int port;
    private int backlog;
    private int ioThreadNum;

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
