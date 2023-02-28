package Homework.OOP_3;

public enum PriorityHealerEnum {
    HIGHT(2),
    MEDIUM(1),
    LOW(0);

    private int code;

    PriorityHealerEnum(int code) {
        this.code = code;

    }

    public int getCode() {
        return code;
    }
}
