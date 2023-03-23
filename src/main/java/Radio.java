public class Radio {
    private int currentStationNumber;
    private int currentVolume;

    public void next() {

        if (currentStationNumber >= 9) {
            currentStationNumber = 0;
        } else currentStationNumber += 1;
    }

    public void prev() {
        if (currentStationNumber <= 0) {
            currentStationNumber = 9;
        } else {
            currentStationNumber -= 1;
        }

    }


    public void increaseVolume() {
        if (currentVolume >= 100) {
            currentVolume = 100;
        } else {
            currentVolume += 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume <= 0) {
            currentVolume = 0;
        } else {
            currentVolume -= 1;
        }
    }


    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int currentStationNumber) {
        if (currentStationNumber < 0) {
            return;
        }
        if (currentStationNumber > 9) {
            return;
        }
        this.currentStationNumber = currentStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
        if (currentVolume >= 100) {
            currentVolume = 100;
        }

        this.currentVolume = currentVolume;
    }
}

