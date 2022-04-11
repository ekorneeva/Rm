package ru.netology.radio;

public class Radio {

    private int currentStation;


    public int getCurrentStation() {
        return currentStation;
    }


    public void stationNext() {
        if (currentStation >= 9) {
            setCurrentStation(0);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void stationPrev() {
        if (currentStation <= 0) {
            setCurrentStation(9);
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    public void setCurrentStation(int currentStation) {

        if (currentStation > 9) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }


    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setCurrentVolume(int currentVolume) {

        if (currentVolume > 10) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;

    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }


}


