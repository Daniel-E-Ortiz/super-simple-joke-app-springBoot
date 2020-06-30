package com.chucknoris.springframework.chucknorisjokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeService implements JokeInterface{

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeService(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }


    @Override
    public String getRandomJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
