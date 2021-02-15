package com.stir.cscu9t4practical1;

public class SwimEntry extends Entry {

    private String where;

    public SwimEntry(String n, int d, int m, int y, int h, int min, int s, float dist, String where) {
        super(n, d, m, y, h, min, s, dist);
        this.where = where;
    }
    public String getWhere() {
        return where;
    }

        public String getEntry()
        {
            String result = super.getName() + " swam " + getDistance() + " km " + getWhere() +
                    " in " + super.getHour() + ":" + super.getMin() + ":" + super.getSec() + " on "
                    + super.getDay() + "/" + super.getMonth() + "/" + super.getYear()+ "\n";
            return result;
        }
}

