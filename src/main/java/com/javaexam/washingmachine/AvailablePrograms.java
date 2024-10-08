package com.javaexam.washingmachine;

public enum AvailablePrograms {
    COTTON(1),
    DELICATES(2),
    QUICK(3),
    ECO(4),
    WOOL(5),
    SYNTHETICS(6),
    HEAVY_DUTY(7),
    RINSE_AND_SPIN(8),
    HAND_WASH(9),
    FUR_REMOVAL(10);

    private final int program;

    AvailablePrograms(int program) {
        this.program = program;
    }

    public int getAvailableProgram() {
        return program;
    }

}
