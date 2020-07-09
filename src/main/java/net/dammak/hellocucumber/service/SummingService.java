package net.dammak.hellocucumber.service;

import org.springframework.stereotype.Service;

@Service
public class SummingService {

    public int sum(int first, int second) {
        return first + second ;
    }

}
