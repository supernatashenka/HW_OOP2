public class Radio {
    public int currentStationNumber;

    public int currentVolume;

    public void setToStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber < 0) {
            return;
        }

        if (newCurrentStationNumber > 9) {
            return;
        }
        currentStationNumber = newCurrentStationNumber;
    }

    public void next() {
        currentStationNumber = currentStationNumber + 1;
        if (currentStationNumber >= 9) {
            currentStationNumber = 0;
        }


    }

    public void prev() {
        currentStationNumber = currentStationNumber - 1;
        if (currentStationNumber <= 0) {
            currentStationNumber = 9;
        }

    }

    public void increaseVolume() {
           if (currentVolume >=100) {
                currentVolume = 100;
            }
             currentVolume += 1;
        }



    public void decreaseVolume(){
        if(currentVolume <=0) {
            currentVolume = 0;
        }
        currentVolume -= 1;
    }
}
