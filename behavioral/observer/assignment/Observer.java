package behavioral.observer.assignment;

interface Observer {
    public  void update(int runs,int wickets,double overs);
}

class AverageScore implements Observer{

    private double runRate;
    private int predictedScore;
    @Override
    public void update(int runs, int wickets, double overs) {
        this.runRate = runs/overs;
        this.predictedScore = (int) (runRate*50);
        display();
    }

    private void display() {
        System.out.println("Average Score is:\nRunrate:"+this.runRate+"\nPredicted Score:"+this.predictedScore);
    }
}
class CurrentScore implements Observer{
    private  int runs,wickets;
    private double overs;

    @Override
    public void update(int runs, int wickets, double overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
        display();
    }

    private void display() {
        System.out.println("Current Score is:\nRun:"+this.runs+"\nWicket:"+this.wickets+"\nOver:"+this.overs);
    }

}
