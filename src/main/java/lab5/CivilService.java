package lab5;

interface NationalService{
    int getDaysLeft();
    void work();
}
class CivilService implements NationalService{
    private int daysLeft;
    public CivilService(){
        this.daysLeft=362;
    }

    public int getDaysLeft() {
        return daysLeft;
    }

    public void setDaysLeft(int daysLeft) {
        this.daysLeft = daysLeft;
    }
    public void work(){
        this.setDaysLeft(getDaysLeft()+1);
    }
}

class MilitaryService implements NationalService{
    int daysLeft;

    public int getDaysLeft() {
        return daysLeft;
    }

    public void setDaysLeft(int daysLeft) {
        this.daysLeft = daysLeft;
    }
    public void work(){
        this.setDaysLeft(getDaysLeft()+1);
    }
}
