package com.stir.cscu9t4practical1;

public class SprintEntry extends Entry


{

    private int repetitions; //Number of reps
    private int recovery; //Time between each repetition

    public SprintEntry(String n, int d, int m, int y, int h, int min, int s, float dist, int repetitions, int recovery) {
        super(n, d, m, y, h, min, s, dist);
        this.repetitions = repetitions;
        this.recovery = recovery;
    }
        //Method for accessing repetitions
        public int getRepetitions() {
            return repetitions;
        }
        //Method for accessing recovery time
        public int getRecovery() {
                return recovery;
        }
        //Method for return the entry
        public String getEntry(){
            String result = super.getName() + " sprinted " + getRepetitions() + "x" +
            super.getDistance() + "m in " + super.getHour() + ":" + super.getMin() +
            " : " + super.getSec() + " with " + getRecovery() + " minutes recovery on "+
            super.getDay() + "/" + super.getMonth() + "/" + super.getYear() + "\n";
            return result;
        }


}



