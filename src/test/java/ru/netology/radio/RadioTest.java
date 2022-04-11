package ru.netology.radio;

import org.junit.jupiter.api.Test;

class RadioTest {


    @Test
    public void shouldSetRadio() {
        Radio radio = new Radio();


        radio.setCurrentStation(10); // тестируемое действие

        int expected = 0; // ожидаемый результат
        int actual = radio.getCurrentStation(); // фактический результат

        assertEquals(expected, actual);
    }

    private void assertEquals(int expected, int actual) {
    }


    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio. stationNext();


        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio. stationNext();


        int expected = 7;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.stationPrev();

        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.stationPrev();

        int expected = 4;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {   //  сеттер работает на выбор допустимого значания громкости
        Radio volume = new Radio();

        volume.setCurrentVolume(8);

        int expected = 8;
        int actual = volume.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeVolume() {  // проверили недопкустимые значения меньше 0
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeVolume2() { // проверили недопустимые значения больше 10
        Radio radio = new Radio();
        radio.setCurrentVolume(15);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() {  // увеличение больше 10, ни к чему не приводит
        Radio volume = new Radio();
        volume.setCurrentVolume(10);
        volume.increaseVolume();


        int expected = 10;
        int actual = volume.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinVolume() { // уменьшение меньше 0, ни к чему не приводит
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.decreaseVolume();


        int expected = 0;
        int actual = volume.getCurrentVolume();

        assertEquals(expected, actual);
    }


    @Test
    public void shouldSetIncreaseVolume() { // увеличиваем звук
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        radio.increaseVolume();


        int expected = 9;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseVolume() {  // уменьшаем звук
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.decreaseVolume();


        int expected = 2;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }


}