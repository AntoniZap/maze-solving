package com.company;

public enum Orientaction {
    UP(-1 ,0), LEFT(0,-1), DOWN(1,0), RIGHT(0,1);

    int row;
    int column;

    Orientaction(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public static Orientaction getLeftHandOrientation(Orientaction current){
        Orientaction[] orientations = Orientaction.values();
        for (int i = 0; i < orientations.length; i++) {
            if (orientations[i] == current) {
                return orientations[ (i + 1) % orientations.length ];
            }
        }
        return null;
    }


}
