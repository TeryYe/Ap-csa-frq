public class Feeder {
    private int currentFood = 100; 
    public void simulateOneday(int numbirds) {
        if(Math.random() < 0.95){
            int foodperbird = (int) (Math.random() * 41) + 10;
            currentFood -= numbirds * foodperbird;
            if(currentFood < 0)
                currentFood = 0;
            }
        } else {
            currentFood = 0;
        }
    }

    public int simulateManyDays(int numbirds, int numdays){
        int daysLeft = numdays;
        int foundFood = 0;
        while(daysLeft > 0 && currentFood > 0){
            daysLeft--;
            foundFood++;
            simulateOneday(numbirds);
        }
        return foundFood;
    }
}
