package com.headfirst.facadePattern;

import com.headfirst.facadePattern.devices.*;

/**
 * @Author : Chris Wang
 * @Description :
 * @Date : 2019/7/17 10:01
 */
public class HomeTheaterFacade {

    private Amplifier amp;

    private Tuner tuner;

    private DvdPlayer dvdPlayer;

    private CdPlayer cdPlayer;

    private Projector projector;

    private ThreaterLights threaterLights;

    private Screen screen;

    private PopcornPopper popcornPopper;

    public HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvdPlayer, CdPlayer cdPlayer, Projector projector, ThreaterLights threaterLights, Screen screen, PopcornPopper popcornPopper) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
        this.projector = projector;
        this.threaterLights = threaterLights;
        this.screen = screen;
        this.popcornPopper = popcornPopper;
    }
}
