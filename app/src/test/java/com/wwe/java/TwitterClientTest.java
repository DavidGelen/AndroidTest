package com.wwe.java;

import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * @name AndroidTest
 * @class name：com.wwe.java
 * @class describe
 * @anthor David
 * @time 2019/1/30 6:29 PM
 * @class describe
 */
public class TwitterClientTest {

    @Test
    public void test1() {
        TwitterClient twitterClient = new TwitterClient();
        ITweet iTweet = mock(ITweet.class);
        twitterClient.sendTweet(iTweet);
        when(iTweet.getMessage()).thenReturn("Using mockito is great");
    }

    @Test
    public void test2() {
        TwitterClient twitterClient = new TwitterClient();
        ITweet iTweet = mock(ITweet.class);
        twitterClient.sendTweet(iTweet);
        when(iTweet.getMessage()).thenReturn("Using mockito is great");
        verify(iTweet, atLeastOnce()).getMessage();
    }
}