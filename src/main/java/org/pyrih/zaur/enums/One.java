package org.pyrih.zaur.enums;

enum WeekDays {
    Monday("bad"),
    Tuesday("good"),
    Wednesday("grate"),
    Thursday("so-so"),
    Friday("good"),
    Saturday("amazing"),
    Sunday("good");

    private String mood;

    WeekDays(String mood) {
        this.mood = mood;
    }

    String getMood() {
        return mood;
    }
}

public class One {
    public static void main(String[] args) {
        Today today = new Today(WeekDays.Wednesday);
        today.daysInfo();

        WeekDays weekDays = WeekDays.Wednesday;
        System.out.println(weekDays);
    }
}

class Today {
    WeekDays weekDays;

    public Today(WeekDays weekDays) {
        this.weekDays = weekDays;
    }

    void daysInfo() {
        switch (weekDays) {
            case Monday:
            case Tuesday:
                System.out.println("Mon or Tue");
                break;
            case Wednesday:
                System.out.println("Wed");
                break;
        }
        System.out.println(weekDays.getMood());
    }
}
