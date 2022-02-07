package com.rehan.c6;

public class Level1 {
    public enum Level{
        HIGH(3),Medium(2),Low(1);
        private final int levelCode;
        //Constractor
        Level(int levelCode){
            this.levelCode = levelCode;
        }
        public int getLevelCode(){
            return this.levelCode;
        }

    }


}
