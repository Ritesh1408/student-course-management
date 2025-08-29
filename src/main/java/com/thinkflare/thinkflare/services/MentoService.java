package com.thinkflare.thinkflare.services;

import com.thinkflare.thinkflare.entities.Mentor;
import com.thinkflare.thinkflare.repository.MentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MentoService {

    private final MentoRepository mentoRepository;

    @Autowired
    public MentoService(MentoRepository mentoRepository) {
        this.mentoRepository = mentoRepository;
    }

    public Mentor addMentor(Mentor mentor){
        return this.mentoRepository.save(mentor);
    }
}
