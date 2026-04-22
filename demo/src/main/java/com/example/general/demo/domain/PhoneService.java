package com.example.general.demo.domain;

import com.example.general.demo.data.PhoneRepository;
import org.springframework.stereotype.Service;

@Service
public class PhoneService {

    private final PhoneRepository phoneRepository;

    public PhoneService(PhoneRepository phoneRepository) {
        this.phoneRepository = phoneRepository;
    }

    public String recordPush() {
        return null;
    }

}
